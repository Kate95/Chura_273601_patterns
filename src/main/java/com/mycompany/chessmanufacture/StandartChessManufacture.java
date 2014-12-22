package com.mycompany.chessmanufacture;

import com.mycompany.chess.Chess;
import com.mycompany.chess.StandartChessIvory;
import com.mycompany.chess.StandartChessWood;
import com.mycompany.material.Material;
import com.mycompany.myexception.MyException;

public class StandartChessManufacture extends ChessManufacture {

    private static StandartChessManufacture uniqueInstance;

    private StandartChessManufacture() {
    }

    public static StandartChessManufacture getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new StandartChessManufacture();
        }
        return uniqueInstance;
    }

    public Chess createChess(String item) throws MyException {
        if (item.equals(Material.WOOD)) {
            return new StandartChessWood();
        } else if (item.equals(Material.IVORY)) {
            return new StandartChessIvory();
        } else {
            throw new MyException();
        }
    }
}
