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

public String remove(String typ) {
    if (head == null) {
        return "Monster existiert nicht.";
        }
    if (head.getMonster().getTyp().equals(typ)) {
        String monsterTyp = head.getMonster().getTyp();
        head = head.getNext(); // Der neue Kopf ist einfach der nächste in der Schlange
        return "Monster " + monsterTyp + " wurde entfernt.";
        }
    MonsterNode current = head;
    while (current.getNext() != null && !current.getNext().getMonster().getTyp().equals(typ)) {
        current = current.getNext();
        }
    if (current.getNext() == null) {
        return "Monster existiert nicht.";
        }
    String monsterTyp = current.getNext().getMonster().getTyp();
    current.setNext(current.getNext().getNext());
    
    return "Monster " + monsterTyp + " wurde entfernt.";
    }
}