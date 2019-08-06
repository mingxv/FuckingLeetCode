package com.fucking.leetcode.test;

import java.util.List;
import java.util.LinkedList;

/**
 * 栈
 * @author mingxv
 *
 */
public class MinStack {

	LinkedList<Integer> list;
	int min = Integer.MAX_VALUE;
	boolean isReset = true;
    
    /** initialize your data structure here. */
    public MinStack() {
    	list = new LinkedList<Integer>();
    }
    
    public void push(int x) {
    	list.add(x);
    	if(x < min) {
    		min = x;
    	}
    }
    
    public void pop() {
        int pop = list.removeLast();
        if(pop == min) {
        	isReset = true;
        }
    }
    
    public int top() {
    	return list.getLast();
    }
    
    public int getMin() {
    	if(!isReset) {
    		return min;
    	}
    	isReset = false;
    	if(list == null || list.size() <= 0) {
    		return 0;
    	}
    	min = list.get(0);
        for(int i=0;i<list.size();i++) {
        	min = Math.min(min, list.get(i));
        }
        return min;
    }
}
