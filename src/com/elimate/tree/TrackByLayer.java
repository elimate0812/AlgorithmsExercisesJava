package com.elimate.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TrackByLayer {
    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode root = tree.getRoot();
        trackByLayer(root);
    }
    public static void trackByLayer(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        if(node != null){
            queue.add(node);
        }
        TreeNode temp = queue.poll();
        while(temp != null){
            System.out.print(temp.getData() + " ");
            if(temp.getLeft() != null){
                queue.add(temp.getLeft());
            }
            if(temp.getRight() != null){
                queue.add(temp.getRight());
            }
            temp = queue.poll();
        }
    }
}
