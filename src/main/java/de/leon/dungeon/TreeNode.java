package de.leon.dungeon;

public class TreeNode {
    private Monster monster;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Monster monster) {
        this.monster = monster;
        this.left = null;
        this.right = null;
    }

    public Monster getMonster() { 
        return monster; 
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
