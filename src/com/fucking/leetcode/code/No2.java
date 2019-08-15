package com.fucking.leetcode.code;

import com.fucking.leetcode.entity.ListNode;

/**
 * 两数相加
 * 
 * @author mingxv
 *
 */
public class No2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return listNode(l1, l2, 0);
	}

	public ListNode listNode(ListNode l1, ListNode l2, int offset) {
		if (l1 == null && l2 == null && offset == 0) {
			return null;
		}
		ListNode a = new ListNode(0);
		if (l1 != null && l2 != null) {
			a.val = l1.val + l2.val + offset;
			int temp = 0;
			if (a.val > 9) {
				temp = 1;
				a.val = a.val % 10;
			}
			ListNode b = listNode(l1.next, l2.next, temp);
			a.next = b;
		} else if (l1 != null) {
			a.val = l1.val + offset;
			int temp = 0;
			if (a.val > 9) {
				temp = 1;
				a.val = a.val % 10;
			}
			ListNode b = listNode(l1.next, null, temp);
			a.next = b;
		} else if (l2 != null) {
			a.val = l2.val + offset;
			int temp = 0;
			if (a.val > 9) {
				temp = 1;
				a.val = a.val % 10;
			}
			ListNode b = listNode(null, l2.next, temp);
			a.next = b;
		} else {
			a.val = offset;
		}
		return a;
	}

}
