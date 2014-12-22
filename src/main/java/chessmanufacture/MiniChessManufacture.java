package chessmanufacture;

import chess.Chess;
import chess.MiniChessIvory;
import chess.MiniChessWood;
import constants.Constants;
import myexception.MyException;

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
        if (item.equals(Constants.MATERIAL_1)) {
            return new MiniChessWood();
        } else if (item.equals(Constants.MATERIAL_2)) {
            return new MiniChessIvory();
        } else {
                throw new MyException();
        }
    }
}
