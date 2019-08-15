package com.fucking.leetcode.code;

import java.util.Arrays;

public class No567 {
	/**
	 * 检测s2里是否有s1任意排列的子串
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public boolean checkInclusion(String s1, String s2) {
		if (s2 == null || s1 == null) {
			return false;
		}
		int l1 = s1.length();
		int l2 = s2.length();
		int[] array1 = new int[26];
		int[] array2 = new int[26];
		if (l1 > l2) {
			return false;
		}
		for (char c : s1.toCharArray()) {
			array2[c - 'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			if (i >= l1) {
				array2[s2.toCharArray()[i - l1] - 'a']++;
			}
			array2[s2.toCharArray()[i] - 'a']--;
			if (Arrays.equals(array1, array2)) {
				return true;
			}
		}
		return false;
	}
}
