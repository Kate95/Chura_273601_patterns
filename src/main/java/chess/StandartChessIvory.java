package chess;

import constants.Constants;

public class StandartChessIvory extends Chess{
        public StandartChessIvory(){
        name="Standard size ivory chess";
        material=Constants.MATERIAL_2;
        size=7;
    }  
    public void cut(){
        System.out.println("Cut pieces of ivory");
    }
}
