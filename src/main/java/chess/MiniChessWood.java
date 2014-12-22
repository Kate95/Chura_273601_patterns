package chess;

import constants.Constants;

public class MiniChessWood extends Chess{
    public MiniChessWood(){
        name="Mini-sized wood chess";
        material=Constants.MATERIAL_1;
        size=3;
    }  
    public void cut(){
        System.out.println("Cut pieces of wood");
    }
}
