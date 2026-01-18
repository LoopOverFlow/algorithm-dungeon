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

    @Test
    public void testMonsterListRecursiveSize(){
        MonsterListe monsterlist = new MonsterListe();
        monsterlist.add(new Monster("Goblin", 50));
        monsterlist.add(new Monster("Ork", 80));
        monsterlist.add(new Monster("Troll", 120));
        assertEquals(3, monsterlist.sizeRecursive(), "Rekursive Größe sollte 3 sein.");
    }

    @Test
    public void testContainMonster(){
        MonsterListe monsterlist = new MonsterListe();
        monsterlist.add(new Monster("Goblin", 50));
        monsterlist.add(new Monster("Ork", 80));
        assertTrue(monsterlist.containMonster("Ork"), "MonsterListe sollte Ork enthalten.");
        assertFalse(monsterlist.containMonster("Drache"), "MonsterListe sollte Drache nicht enthalten.");
    }

    @Test
    public void testMonsterTreeHeight(){
    MonsterTree monsterTree = new MonsterTree();
        monsterTree.add(new Monster("Slime", 50));
        monsterTree.add(new Monster("Goblin", 30));
        monsterTree.add(new Monster("Orc", 70));
        monsterTree.add(new Monster("Dragon", 20));
        monsterTree.add(new Monster("Orc", 40));
        monsterTree.add(new Monster("Troll", 60));
        monsterTree.add(new Monster("Giant", 80));
        assertEquals(2, monsterTree.getHeight(), "Die Höhe des MonsterBaums sollte 2 sein, da wir von 0 beginnen.");
    }

    @Test public void testMonsterTreeHeightNull(){
        MonsterTree monsterTree = new MonsterTree();
        assertEquals(-1, monsterTree.getHeight(), "Die Höhe eines Leeren Baums sollte -1 betragen.");
    }

    @Test
    public void MonsterTreeBalance(){
        MonsterTree monsterTree = new MonsterTree();
        monsterTree.add(new Monster("Golbin", 50));
        monsterTree.add(new Monster("Orc", 30));
        monsterTree.add(new Monster("Troll", 20));
        assertEquals(-2, monsterTree.getBalance(), "Der Baum sollte linkslastig sein mit einer Balance von -2.");
    }
    

    @Test
    public void testMonsterTreeRotateLeft(){
        MonsterTree monsterTree = new MonsterTree();
        monsterTree.add(new Monster("Slime", 1));
        monsterTree.add(new Monster("Slime", 2));
        monsterTree.add(new Monster("Slime", 3));
        monsterTree.add(new Monster("Slime", 4));
        monsterTree.add(new Monster("Slime", 5));
        monsterTree.add(new Monster("Slime", 6));
        monsterTree.add(new Monster("Slime", 7));
        monsterTree.add(new Monster("Slime", 8));
        monsterTree.add(new Monster("Slime", 9));
        monsterTree.add(new Monster("Slime", 10));
        monsterTree.add(new Monster("Slime", 11));
        assertEquals(1, monsterTree.getBalance(), "Der Baum sollte nicht Rechtslastig sein.");
    }

    @Test
    public void testMonsterTreeRotateRight(){
        MonsterTree monsterTree = new MonsterTree();
        monsterTree.add(new Monster("Slime", 11));
        monsterTree.add(new Monster("Slime", 10));
        monsterTree.add(new Monster("Slime", 9));
        monsterTree.add(new Monster("Slime", 8));
        monsterTree.add(new Monster("Slime", 7));
        monsterTree.add(new Monster("Slime", 6));
        monsterTree.add(new Monster("Slime", 5));
        monsterTree.add(new Monster("Slime", 4));
        monsterTree.add(new Monster("Slime", 3));
        monsterTree.add(new Monster("Slime", 2));
        monsterTree.add(new Monster("Slime", 1));
        assertEquals(-1, monsterTree.getBalance(), "Der Baum sollte nicht Linkslastig sein.");
    }
}

