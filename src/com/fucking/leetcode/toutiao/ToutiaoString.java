package com.fucking.leetcode.toutiao;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class ToutiaoString {
	public String multiply(String num1, String num2) {
		if (num1 == null || num2 == null) {
			return "0";
		}
		int[] result = new int[num1.length() + num2.length()];
		for (int i = 0; i < num1.length(); i++) {
			for (int j = 0; j < num2.length(); j++) {
				result[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}
		StringBuilder sBuilder = new StringBuilder();
		for (int i = result.length - 1; i >= 0; i--) {
			if (result[i] >= 10) {
				result[i - 1] += result[i] / 10;
				result[i] = result[i] % 10;
			}
			sBuilder.insert(0, result[i] + "");
		}
		while (true) {
			if (sBuilder.length() > 1 && sBuilder.charAt(0) == '0') {
				sBuilder.deleteCharAt(0);
			} else {
				break;
			}
		}
		return sBuilder.toString();
	}

	/**
	 * 两个字符串相乘 改进
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String multiply1(String num1, String num2) {
		if (num1 == null || num2 == null) {
			return "0";
		}
		int[] result = new int[num1.length() + num2.length()];
		for (int i = 0; i < num1.length(); i++) {
			for (int j = 0; j < num2.length(); j++) {
				int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				result[i + j + 1] += temp % 10;
				result[i + j] += temp / 10;
			}
		}
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			if (sBuilder.length() != 0 || result[i] != 0) {
				sBuilder.append(result[i] + "");
			}
		}
		return sBuilder.toString();
	}

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
