package com.elimate.tree;

import java.util.Stack;

public class DeepingTrack {
    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode root = tree.getRoot();
        deepinTrack(root);
    }
    public static void deepinTrack(TreeNode root){
        TreeNode temp;
        Stack<TreeNode> nodes = new Stack<>();
        temp = root;
        while(temp != null){
            System.out.print(temp.getData() + " ");
            if(temp.getRight() != null){
                nodes.push(temp.getRight());
            }
            if(temp.getLeft() != null){
                temp = temp.getLeft();
            }else{
                if(!nodes.empty()){
                    temp = nodes.pop();
                }else{
                    temp = null;
                }
            }
        }
    }
}
