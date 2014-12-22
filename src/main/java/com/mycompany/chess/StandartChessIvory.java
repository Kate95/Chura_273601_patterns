package com.mycompany.chess;

import com.mycompany.material.Material;

public class StandartChessIvory extends Chess{
        public StandartChessIvory(){
        name="Standard size ivory chess";
        material=Material.IVORY;
        size=7;
    }  
    public void cut(){
        System.out.println("Cut pieces of ivory");
    }
}
