package com.fucking.leetcode.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树前序遍历
 * @author mingxv
 *
 */
public class No144 {
	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();
		if (root != null) {
			list.add(root.val);
		}
		preorder(root, list);
		return list;
	}

	private void preorder(TreeNode root, List<Integer> srcList) {
		if (root == null) {
			return;
		}
		srcList.add(root.val);
		preorder(root.left, srcList);
		preorder(root.right, srcList);
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
