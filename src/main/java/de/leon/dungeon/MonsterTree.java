package de.leon.dungeon;

public class MonsterTree {
    private TreeNode root;

    public void add(Monster monster) {
        this.root = addRecursive(this.root, monster);
    }

    private TreeNode addRecursive(TreeNode current, Monster monster) {
        if (current == null) {
            return new TreeNode(monster);
        }
        if (monster.getHp() < current.getMonster().getHp()) {
            current.setLeft(addRecursive(current.getLeft(), monster));
        } else {
            current.setRight(addRecursive(current.getRight(), monster));
        }
        return current;
    }

    public void printSorted() {
        printInOrder(root);
    }

    private void printInOrder(TreeNode node) {
        if (node == null) return;

        printInOrder(node.getLeft());
        System.out.println(node.getMonster().getTyp() + " HP: " + node.getMonster().getHp());
        printInOrder(node.getRight());
    }

    public int getHeight() {
        return getHeightRecursive(root);
    }

    private int getHeightRecursive(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = getHeightRecursive(node.getLeft());
        int rightHeight = getHeightRecursive(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int getBalance() {
        return getBalanceRecursive(root);
    }

    private int getBalanceRecursive(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeightRecursive(node.getLeft());
        int rightHeight = getHeightRecursive(node.getRight());
        return rightHeight - leftHeight;
    }

}
