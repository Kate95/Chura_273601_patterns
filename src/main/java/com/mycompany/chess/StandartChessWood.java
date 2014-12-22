package com.mycompany.chess;

import com.mycompany.material.Material;

public class StandartChessWood extends Chess{
    public StandartChessWood(){
        name="Standard size wood chess";
        material=Material.WOOD;
        size=7;
    }  
    public void cut(){
        System.out.println("Cut pieces of wood");
    }
}
