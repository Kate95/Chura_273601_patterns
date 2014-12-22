package com.mycompany.chess;

import com.mycompany.material.Material;

public class MiniChessWood extends Chess{
    public MiniChessWood(){
        name="Mini-sized wood chess";
        material=Material.WOOD;
        size=3;
    }  
    public void cut(){
        System.out.println("Cut pieces of wood");
    }
}
