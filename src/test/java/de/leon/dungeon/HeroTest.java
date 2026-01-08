package de.leon.dungeon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    @Test
    public void testTakeDamage() {
        Hero hero = new Hero("TestHeld");
        hero.takeDamage(30);
        assertEquals(70, hero.getHp(), "HP sollte nach 30 Schaden 70 sein");
    }

    @Test
    public void testTakeDamageBelowZero() {
        Hero hero = new Hero("TestHeld");
        hero.takeDamage(150);
        assertEquals(0, hero.getHp(), "HP sollte nicht negativ werden");
    }
}