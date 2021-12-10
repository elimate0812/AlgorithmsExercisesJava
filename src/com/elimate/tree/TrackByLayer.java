package com.elimate.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TrackByLayer {
    public static void main(String[] args) {

    }
    public static void trackByLayer(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp = node;
        if(temp != null){
            queue.add(temp);
        }
        while(temp)
    }
}
