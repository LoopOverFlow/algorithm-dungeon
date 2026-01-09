package de.leon.dungeon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
    @Test
    public void testMonster() {
        Monster monster = new Monster("Goblin", 50);
        assertEquals("Goblin", monster.getTyp(), "Monster Typ sollte Goblin sein:");
        assertEquals(50, monster.getHp(), "Monster sollte 50 HP haben.");
    }

    @Test
    public void testMonsterNode() {
        MonsterNode monsterNode = new MonsterNode(new Monster("Ork", 80));
        assertEquals("Ork", monsterNode.getMonster().getTyp(), "Monster Typ sollte Ork sein.");
        assertEquals(80, monsterNode.getMonster().getHp(), "Monster sollte 80 HP haben.");
        assertNull(monsterNode.getNext(), "Next sollte null sein.");
    }

    @Test
    public void testMonsterList(){
        MonsterListe monsterlist = new MonsterListe();
        monsterlist.add(new Monster("Drache", 200));
        monsterlist.add(new Monster("Troll", 120));
        assertEquals(2, monsterlist.size(), "MonsterListe sollte 2 Monster enthalten.");
        assertEquals("Monster Drache wurde entfernt.", monsterlist.remove("Drache"), "Monster 'Drache' sollte entfernt werden.");
        assertEquals(1, monsterlist.size(), "MonsterListe sollte jetzt 1 Monster enthalten.");
        assertEquals("Monster existiert nicht.", monsterlist.remove("Phönix"), "Monster 'Phönix' sollte nicht exestieren.");
    }
}

