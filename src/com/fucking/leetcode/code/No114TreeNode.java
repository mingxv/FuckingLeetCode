package com.fucking.leetcode.code;

import com.fucking.leetcode.entity.TreeNode;

/**
 * 给定二叉树，原地展开为链表
 * 
 * @author mingxv
 *
 * 1 2 5 3 4 null 6
 */
public class No114TreeNode {
	public void flatten(TreeNode root) {
		if(root == null) {
			return;
		}
		flatten(root.left);
		flatten(root.right);
		TreeNode lefTreeNode = root.left;
		TreeNode rightTreeNode = root.right;
		if(lefTreeNode == null) { 
			return;
		}
		TreeNode tempNode = lefTreeNode;
		while(tempNode.right != null) {
			tempNode = tempNode.right;
		}
		tempNode.right = root.right;
		root.right = lefTreeNode;
		root.left = null;
	}
}
