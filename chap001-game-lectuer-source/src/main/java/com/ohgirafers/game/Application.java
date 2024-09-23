package com.ohgirafers.game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        CharacterManager c = new CharacterManager();
        c.characterManager();

        MonsterManager m = new MonsterManager();
        m.monsterManager();
    }
}


