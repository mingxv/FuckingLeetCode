package com.fucking.leetcode.code;


import com.fucking.leetcode.entity.TreeNode;

/**
 * 对称二叉树
 * 
 * @author mingxv
 *
 */
public class No101 {
	//尝试了中序排列首位比对，空位自动补-1不成立。会有特殊情况 [5,4,1,null,1,null,4,2,null,2,null]
	
	public boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return true;
		}
		return tree(root.left, root.right);
	}

	/**
	 * 左右比对
	 * @param root
	 * @return
	 */
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
