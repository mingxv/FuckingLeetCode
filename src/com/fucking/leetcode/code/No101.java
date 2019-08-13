package com.fucking.leetcode.code;

import java.util.ArrayList;
import java.util.List;

import com.fucking.leetcode.entity.TreeNode;

/**
 * 对称二叉树
 * 
 * @author mingxv
 *
 */
public class No101 {
	public boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return true;
		}
		return tree(root.left, root.right);
	}

	private boolean tree(TreeNode left, TreeNode right) {
		if(left == null && right == null) {
			return true;
		}
		else if(left == null && right != null) {
			return false;
		}else if (left != null && right == null) {
			return false;
		}else {
			return (left.val == right.val) && tree(left.left, right.right) && tree(left.right, right.left);
		}
	}
}
