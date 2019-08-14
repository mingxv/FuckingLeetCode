package com.fucking.leetcode.code;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * 
 * @author mingxv
 *
 */
public class No231 {
	/**
	 * Hamming Weight，即汉明重量（Integer.bitCount(n)），指的是一个数中非0二进制位的数量
	 * 
	 * @param n
	 * @return
	 */
	public boolean isPowerOfTwo(int n) {
		if (n < 0) {
			return false;
		} else {
			return Integer.bitCount(n) == 1;
		}
	}
	
	public void test() {
		boolean result = isPowerOfTwo(2147483646);
		System.out.print(result);
	}
}
