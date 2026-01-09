package de.leon.dungeon;

public class MonsterNode {
    private Monster monster;
    private MonsterNode next;

    public MonsterNode(Monster monster) {
        this.monster = monster;
        this.next = null;
    }

    public Monster getMonster() { 
        return monster; 
    }
    
    public MonsterNode getNext() { 
        return next; 
    }
    
    public void setNext(MonsterNode next) { 
        this.next = next; 
    }

    public void setCurrent(Monster monster){
        this.monster = monster;
    }
}