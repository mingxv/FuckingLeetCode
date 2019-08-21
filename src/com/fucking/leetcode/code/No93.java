package com.fucking.leetcode.code;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.spi.IIORegistry;

/**
 * 复原IP地址
 * 
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 * 
 * @author mingxv
 *
 */
public class No93 {
	/**
	 * 使用回溯算法
	 * 
	 * 1.什么时候打断拿到结果
	 * 2.记录上一次的值
	 * @param s
	 * @return
	 */
	public List<String> restoreIpAddresses(String s) {
		List<String> result = new ArrayList<String>();
		address(s, "", 0, 0, result);
		return result;
	}
	
	public void test() {
		List<String> strsList = restoreIpAddresses("25525511135");
		System.out.print(strsList);
	}

	/**
	 * 判断某一段的合理性
	 * 
	 * @param str
	 * @return
	 */
	private boolean isValid(String str) {
		if (str == null || str.length() == 0 || str.length() > 3 || Integer.parseInt(str) < 0
				|| Integer.parseInt(str) > 255 || str.startsWith("0") && str.length() > 1)
			return false;
		return true;
	}

	private void address(String src, String currString, int currentLevel, int offset, List<String> res) {
		if (currentLevel == 3) {
			if (isValid(src.substring(offset))) {
				res.add(currString + "." + src.substring(offset));
			}
			// 结束
			return;
		}

		for (int i = 1; i <= 3; i++) {
			if (offset > src.length() || (offset + i) > src.length()) {
				// 剪切失败，offset超出length
				return;
			}
			String seg = src.substring(offset, offset + i);// 1-3位数
			if (isValid(seg)) {
				String nextString = currString.length() == 0 ? seg : currString + "." + seg;
				address(src, nextString, currentLevel + 1, offset + i, res);
			}
		}
	}
}
