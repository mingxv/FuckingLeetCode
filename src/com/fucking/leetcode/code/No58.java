package com.fucking.leetcode.code;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 
 * 如果不存在最后一个单词，请返回 0 。
 * 
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 
 * @author mingxv
 *
 */
public class No58 {
	public int lengthOfLastWord(String s) {
		int start, end;
		end = s.length() - 1;
		int i = end;
		while (end > 0 && s.charAt(end) == ' ') {
			end--;
		}
		if (end < 0) {
			end = 0;
			return 0;
		}
		start = end;
		while (start > 0 && s.charAt(start) != ' ') {
			start--;
		}
		return end - start;
	}
}
