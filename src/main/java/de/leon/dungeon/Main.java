package de.leon.dungeon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Willkommen im Algorithm Dungeon!");

        Hero meinHeld = new Hero("Batman");
        Dungeon meinDungeon = new Dungeon();

        meinDungeon.addMonster(new Monster("Slime", 20));
        meinDungeon.addMonster(new Monster("Goblin", 50));
        meinDungeon.addMonster(new Monster("Orc", 100));

        System.out.println("Held: " + meinHeld.getNamen() + " ist bereit.");
        System.out.println("Anzahl Gegner: " + meinDungeon.getMonsterCount());
        
        meinDungeon.showMonsters();

        System.out.println(meinDungeon.removeMonster("Goblin"));
        System.out.println("Nach dem Entfernen eines Monsters:");
        meinDungeon.showMonsters();
    }
}