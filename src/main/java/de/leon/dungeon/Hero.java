package de.leon.dungeon;

public class Hero {
    private String namen;
    private int hp;
    private int level;

    public Hero(String namen) {
        this.namen = namen;
        this.hp = 100;
        this.level = 1;
    }

    public String getNamen() { 
        return namen; 
    }

    public int getHp() { 
        return hp; 
    }
    
    public int getLevel() { 
        return level; 
    }

    
    public void takeDamage(int damage) {
        this.hp = this.hp - damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }
}