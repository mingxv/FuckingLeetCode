package com.fucking.leetcode.toutiao;

public class ToutiaoTest {
	private ToutiaoString toutiaoString;
	
	public ToutiaoTest() {
		toutiaoString = new ToutiaoString();
	}

	/**
	 * 测试最长共用串
	 */
	public void longestCommonPrefix() {
		String[] strs = new String[] { "flaw", "flwww" };
		String prefix = toutiaoString.longestCommonPrefix(strs);
		System.out.print("longestCommonPrefix = " + prefix);
	}
	
	public void checkInclusion() {
		boolean result = toutiaoString.checkInclusion("ab", "eidbaooo");
		System.out.print("checkInclusion = " + result);
	}
}
