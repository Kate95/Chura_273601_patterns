package chess;

import constants.Constants;

public class StandartChessWood extends Chess{
    public StandartChessWood(){
        name="Standard size wood chess";
        material=Constants.MATERIAL_1;
        size=7;
    }  
    public void cut(){
        System.out.println("Cut pieces of wood");
    }
}
