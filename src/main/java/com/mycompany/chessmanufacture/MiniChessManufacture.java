package com.mycompany.chessmanufacture;

import com.mycompany.chess.Chess;
import com.mycompany.chess.MiniChessIvory;
import com.mycompany.chess.MiniChessWood;
import com.mycompany.material.Material;
import com.mycompany.myexception.MyException;

public class MiniChessManufacture extends ChessManufacture {

    private static MiniChessManufacture uniqueInstance;

    private MiniChessManufacture() {
    }

    public static MiniChessManufacture getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MiniChessManufacture();
        }
        return uniqueInstance;
    }

    public Chess createChess(String item) throws MyException{
        if (item.equals(Material.WOOD)) {
            return new MiniChessWood();
        } else if (item.equals(Material.IVORY)) {
            return new MiniChessIvory();
        } else {
                throw new MyException();
        }
    }
}
