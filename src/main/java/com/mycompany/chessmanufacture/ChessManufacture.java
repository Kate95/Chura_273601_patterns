package com.mycompany.chessmanufacture;

import com.mycompany.chess.Chess;
import com.mycompany.myexception.MyException;

public abstract class ChessManufacture {

    public Chess orderChess(String type) throws MyException{
        Chess chess;
            chess = createChess(type);
            chess.cut();
            chess.paint();
            chess.dry();
            chess.varnish();
            chess.dry();
            chess.box();
            return chess;
    }

    protected abstract Chess createChess(String type) throws MyException;
}
