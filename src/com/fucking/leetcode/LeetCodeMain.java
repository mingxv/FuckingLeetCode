package com.fucking.leetcode;

import java.util.List;

import com.fucking.leetcode.code.MinStack;
import com.fucking.leetcode.code.No229;
import com.fucking.leetcode.toutiao.ToutiaoTest;

public class LeetCodeMain {

	public static void main(String[] args) {
		LeetCodeMain main = new LeetCodeMain();
//		main.toutiaoTest();
//		main.testMinStack();
		main.test229();
	}
	
	private void testMinStack() {
//		["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
//				[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
		MinStack min = new MinStack();
		min.push(2147483646);
		min.push(2147483646);
		min.push(2147483647);
		min.top();
		min.pop();
		min.getMin();
		min.pop();
		min.getMin();
		min.pop();
		min.push(2147483647);
		min.top();
		min.getMin();
		min.push(-2147483648);
		min.top();
		min.getMin();
		min.pop();
		min.getMin();
	}
	
	private void test229() {
		No229 no = new No229();
		List<Integer> a = no.majorityElement(new int[] {1,2,3,4,5,1});
		System.out.print(a);
	}
}
