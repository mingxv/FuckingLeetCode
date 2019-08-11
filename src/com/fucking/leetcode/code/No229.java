package com.fucking.leetcode.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 求众数 给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 * 
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。
 * 
 * ps:摩尔投票法 基于这样一个事实，当一个数的重复次数超过数组长度的一半，每次将两个不相同的数删除，最终剩下的就是要找的数
 * 摩尔投票法：记录一个数，可以找到大于1/2长度；记录2个数，可以找到大于1/3长度；记录3个数可以找到大于1/4长度；依次类推
 * 最后得到的数字，需要校验
 * @author mingxv
 *
 */
public class No229 {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums == null) {
			return list;
		}
		int a = nums.length / 3;
		int num1 = 0, num2 = 0, count1 = 0, count2 = 0;
		for (int val : nums) {
			if (val == num1) {
				++count1;
			} else if (val == num2) {
				++count2;
			} else if (count1 == 0) {
				++count1;
				num1 = val;
			} else if (count2 == 0) {
				++count2;
				num2 = val;
			} else {
				--count1;
				--count2;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int val : nums) {
			if (val == num1) {
				++count1;
			} else if (val == num2) {
				++count2;
			}
		}
		if (count1 > a) {
			list.add(num1);
		}
		if (count2 > a) {
			list.add(num2);
		}
		return list;
	}

	/**
	 * 摩尔投票法
	 * @param nums
	 * @return
	 */
	public int majorityElement1(int[] nums) {
		int majority = -1;

		int count = 0;

		for (int num : nums) {
			if (count == 0) {
				majority = num;
				count++;
			} else {
				if (majority == num) {
					count++;
				} else {
					count--;
				}
			}
		}
		return majority;
	}

}
