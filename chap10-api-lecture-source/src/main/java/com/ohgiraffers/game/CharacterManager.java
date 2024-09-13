package com.ohgiraffers.game;

public class CharacterManager {


    public void CharacterManager(){

        Character_DTO[] characters = new Character_DTO[4];
        characters[1] = new Character_DTO(1,"전사",70,30);
        characters[2] = new Character_DTO(2,"궁수",70,30);
        characters[3] = new Character_DTO(3,"마법사",70,30);
        characters[4] = new Character_DTO(4,"도적",70,30);
    }
}
