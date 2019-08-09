package com.fucking.leetcode.code;

import java.util.ArrayList;
import java.util.List;

import com.fucking.leetcode.entity.TreeNode;


public class No102 {

//	二叉树的层次遍历
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		tree(list, 0, root);
		return list;
	}

	private void tree(List<List<Integer>> list, int level, TreeNode root) {
		if(root == null) {
			return;
		}
		int val = root.val;
		if(list.size() <= level) {
			List<Integer> l = new ArrayList<Integer>();
			l.add(val);
			list.add(l);
		}else {
			list.get(level).add(val);
		}
		tree(list, level + 1, root.left);
		tree(list, level + 1, root.right);
	}
}
