package com.fucking.leetcode.code;

import com.fucking.leetcode.entity.ListNode;

/**
 * 链表翻转
 * @author mingxv
 *
 */
public class No206 {
	public ListNode reverseList(ListNode head) {
		return ln(head);
    }
	
	private ListNode ln(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode p = ln(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	}

}
