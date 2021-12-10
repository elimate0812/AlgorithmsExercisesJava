package com.elimate.tree;

public class TrackWithRecursion {
    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode root = tree.getRoot();
        midTrack(root);
        System.out.println();
        priorTrack(root);
        System.out.println();
        lastTrack(root);
    }
    public static void midTrack(TreeNode node){
        if(node != null){
            midTrack(node.getLeft());
            System.out.print(node.getData() + " ");
            midTrack(node.getRight());
        }
    }
    public static void priorTrack(TreeNode node){
        if(node != null){
            System.out.print(node.getData() + " ");
            priorTrack(node.getLeft());
            priorTrack(node.getRight());
        }
    }
    public static void lastTrack(TreeNode node){
        if(node != null){
            lastTrack(node.getLeft());
            lastTrack(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }
}
