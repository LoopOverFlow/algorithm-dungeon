package de.leon.dungeon;

public class Dungeon {
    private MonsterListe monsterListe;

    public Dungeon() {
        this.monsterListe = new MonsterListe();
    }

    public void addMonster(Monster m) {
        monsterListe.add(m);
    }

    public void showMonsters() {
        System.out.println("--- Monster im Dungeon ---");
        monsterListe.printAll();
    }

    public int getMonsterCount() {
        return monsterListe.size();
    }

    public String removeMonster(String typ) {
        return monsterListe.remove(typ);
    }
}