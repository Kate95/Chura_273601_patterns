package com.mycompany.chess;

import com.mycompany.material.Material;

public class MiniChessIvory extends Chess{
    public MiniChessIvory(){
        name="Mini-sized ivory chess";
        material=Material.IVORY;
        size=3;
    }  
    public void cut(){
        System.out.println("Cut pieces of ivory");
    }
}
