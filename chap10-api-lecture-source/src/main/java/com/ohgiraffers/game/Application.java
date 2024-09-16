package com.ohgiraffers.game;

public class Application {
    public static void main(String[] args) {

        CharacterManager c = new CharacterManager();
        c.characterManager();
        System.out.println();
        MonsterManager m = new MonsterManager();
        m.monsterManager();
        System.out.println();
        CharacterLevel cl = new CharacterLevel();
        cl.attackMonster();








    }
}
