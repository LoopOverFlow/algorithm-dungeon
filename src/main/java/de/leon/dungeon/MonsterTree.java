package de.leon.dungeon;

public class MonsterTree {
    private TreeNode root;

    public void add(Monster monster) {
        this.root = addRecursive(this.root, monster);
        }

private TreeNode addRecursive(TreeNode current, Monster monster) {
    if (current == null) return new TreeNode(monster);
    if (monster.getHp() < current.getMonster().getHp()) {
        current.setLeft(addRecursive(current.getLeft(), monster));
    } else {
        current.setRight(addRecursive(current.getRight(), monster));
    }
    int balance = getBalanceRecursive(current);
    if (balance < -1) {
        return rotateRight(current);
    }
    if (balance > 1) {
        return rotateLeft(current);
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

    private TreeNode rotateRight(TreeNode node) {
        TreeNode Y = node;
        TreeNode X = Y.getLeft();
        TreeNode T2 = X.getRight();
        
        Y.setLeft(T2);
        X.setRight(Y);
        root = X;
        return root;
    }

    private TreeNode rotateLeft(TreeNode node) {
        TreeNode Y = node;
        TreeNode X = Y.getRight();
        TreeNode T2 = X.getLeft();
        Y.setRight(T2);
        X.setLeft(Y);
        root = X;
        return root;
    }
}
