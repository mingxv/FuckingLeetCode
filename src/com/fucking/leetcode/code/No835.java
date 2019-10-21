package com.fucking.leetcode.code;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 图像重叠
 */
public class No835 {
    /**
     * 偏移量枚举法
     * @param A
     * @param B
     * @return
     */
    public int largestOverlap(int[][] A, int[][] B) {
        int length = A.length;
        LinkedList<Point> lista = new LinkedList<>();
        LinkedList<Point> listb = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (A[i][j] == 1) lista.add(new Point(i, j));
                if (B[i][j] == 1) listb.add(new Point(i, j));
            }
        }
        Set<Point> setB = new HashSet<>(listb);
        ArrayList<Point> cache = new ArrayList<Point>();
        int max = 0;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < listb.size(); j++) {
                Point offset = new Point(listb.get(j).x - lista.get(i).x, listb.get(j).y - lista.get(i).y);
                if (cache.contains(offset)) {
                    continue;
                }
                cache.add(offset);
                int m = 0;
                for (int n = 0; n < lista.size(); n++) {
                    if (setB.contains(new Point(lista.get(n).x + offset.x, lista.get(n).y + offset.y))){
                        m++;
                    }
                }
                Math.max(max, m);
            }
        }
        return max;
    }

}
