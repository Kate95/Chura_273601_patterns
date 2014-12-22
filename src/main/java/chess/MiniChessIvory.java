package chess;

import constants.Constants;

public class MiniChessIvory extends Chess{
    public MiniChessIvory(){
        name="Mini-sized ivory chess";
        material=Constants.MATERIAL_2;
        size=3;
    }  
    public void cut(){
        System.out.println("Cut pieces of ivory");
    }
}
