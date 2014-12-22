package chessmanufacture;

import chess.Chess;
import chess.StandartChessIvory;
import chess.StandartChessWood;
import constants.Constants;
import myexception.MyException;

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
        if (item.equals(Constants.MATERIAL_1)) {
            return new StandartChessWood();
        } else if (item.equals(Constants.MATERIAL_2)) {
            return new StandartChessIvory();
        } else {
            throw new MyException();
        }
    }
}
