package com.fucking.leetcode.code;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import com.fucking.leetcode.entity.TreeNode;

/**
 * 二叉树的最大深度
 * 
 * @author mingxv
 * 
 *         给定一个二叉树，找出其最大深度。
 * 
 *         二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 
 *         说明: 叶子节点是指没有子节点的节点。
 */
public class No104 {
	public int maxDepth(TreeNode root) {

	}

	private int tree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = tree(root.left);
		int right = tree(root.right);
		return root.left != null || root.right != null? tree(root)
		return tree(root.left) + 1;
	}
}
