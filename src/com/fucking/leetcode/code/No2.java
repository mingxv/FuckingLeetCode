package com.fucking.leetcode.code;

import com.fucking.leetcode.entity.ListNode;

/**
 * 两数相加
 * 
 * 
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
