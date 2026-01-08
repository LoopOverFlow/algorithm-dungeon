package de.leon.dungeon;

public class Monster {
    private String typ;
    private int hp;

    public Monster(String typ, int hp) {
        this.typ = typ;
        this.hp = hp;
    }

    public String getTyp() { 
        return typ; 
    }
    
    public int getHp() { 
        return hp; 
    }
}