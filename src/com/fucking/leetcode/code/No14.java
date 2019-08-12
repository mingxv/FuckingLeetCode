package com.fucking.leetcode.code;

public class No14 {
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
}
