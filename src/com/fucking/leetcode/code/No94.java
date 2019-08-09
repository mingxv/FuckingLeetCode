package com.fucking.leetcode.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树中序遍历
 * @author mingxv
 *
 */
public class No94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		tree(root, list);
		return list;
	}

	public void tree(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		tree(root.left, list);
		list.add(root.val);
		tree(root.right, list);
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
