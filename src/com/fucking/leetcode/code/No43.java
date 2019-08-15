package com.fucking.leetcode.code;

public class No43 {
	/**
	 * 两个字符串相乘
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
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
}
