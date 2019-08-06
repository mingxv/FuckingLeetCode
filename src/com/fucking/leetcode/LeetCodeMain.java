package com.fucking.leetcode;

import com.fucking.leetcode.test.MinStack;
import com.fucking.leetcode.toutiao.ToutiaoTest;

public class LeetCodeMain {

	public static void main(String[] args) {
		LeetCodeMain main = new LeetCodeMain();
//		main.toutiaoTest();
		main.testMinStack();
	}
	
	private void toutiaoTest() {
		ToutiaoTest main = new ToutiaoTest();
		
//		main.longestCommonPrefix();
//		main.checkInclusion();
		main.testMultiply("123", "456");
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
}
