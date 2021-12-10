package com.elimate.tree;

public class Tree {
    private TreeNode root;

    public Tree() {
        this.root = new TreeNode(1);
        TreeNode nodeA = new TreeNode(2);
        TreeNode nodeB = new TreeNode(3);
        TreeNode nodeC = new TreeNode(4);
        TreeNode nodeD = new TreeNode(5);
        TreeNode nodeE = new TreeNode(6);
        TreeNode nodeF = new TreeNode(7);
        TreeNode nodeG = new TreeNode(8);
        TreeNode nodeH = new TreeNode(9);
        TreeNode nodeI= new TreeNode(10);
        this.root.setLeft(nodeA);
        this.root.setRight(nodeB);
        nodeA.setLeft(nodeC);
        nodeA.setRight(nodeD);
        nodeB.setLeft(nodeE);
        nodeB.setRight(nodeF);
        nodeC.setLeft(nodeG);
        nodeD.setRight(nodeH);
        nodeE.setLeft(nodeI);
    }

    public TreeNode getRoot() {
        return root;
    }
}
