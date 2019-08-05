package com.fucking.leetcode.toutiao;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class ToutiaoString {
	/**
	 * 最大公共串
	 * 
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix(String[] strs) {
		String preff = null;
		for (int i = 0; i < strs.length; i++) {
			String temp = strs[i];
			if (preff == null) {
				preff = temp;
			}
			if (temp.indexOf(preff) != 0) {
				StringBuilder sb = new StringBuilder();
				for (int n = 0; n < preff.length(); n++) {
					if (temp.length() > n && preff.charAt(n) == temp.charAt(n)) {
						sb.append(preff.charAt(n));
					} else {
						break;
					}
				}
				preff = sb.toString();
			}
		}
		if (preff == null) {
			preff = "";
		}
		return preff;
	}

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
			if(Arrays.equals(array1, array2)) {
				return true;
			}
		}
		return false;
	}
}
