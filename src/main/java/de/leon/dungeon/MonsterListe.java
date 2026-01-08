package de.leon.dungeon;

public class MonsterListe {
    private MonsterNode head;

    public void add(Monster m) {
        MonsterNode newNode = new MonsterNode(m);
        if (head == null) {
            head = newNode;
        } else {
            MonsterNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void printAll() {
        MonsterNode current = head;
        while (current != null) {
            System.out.println("- " + current.getMonster().getTyp() + " (HP: " + current.getMonster().getHp() + ")");
            current = current.getNext();
        }
    }

    public int size() {
        int count = 0;
        MonsterNode current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}