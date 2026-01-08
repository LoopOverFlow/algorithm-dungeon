package de.leon.dungeon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Willkommen im Algorithm Dungeon!");
        Hero leon =  new Hero("Leon");
        System.out.println("Held erstellt: " + leon.namen + " mit HP: " + leon.hp + " und Level: " + leon.level);
    }
    
}
