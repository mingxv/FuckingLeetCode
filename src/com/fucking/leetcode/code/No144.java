package com.fucking.leetcode.code;

import java.util.ArrayList;
import java.util.List;

import com.fucking.leetcode.entity.TreeNode;

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
		if (root.left != null) {
			srcList.add(root.left.val);
		}
		preorder(root.left, srcList);
		if (root.right != null) {
			srcList.add(root.right.val);
		}
		preorder(root.right, srcList);
	}

}
