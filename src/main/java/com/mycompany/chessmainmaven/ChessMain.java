package com.mycompany.chessmainmaven;

import com.mycompany.chess.Chess;
import com.mycompany.chessmanufacture.ChessManufacture;
import com.mycompany.chessmanufacture.MiniChessManufacture;
import com.mycompany.chessmanufacture.StandartChessManufacture;
import com.mycompany.myexception.MyException;

public class ChessMain {

    public static void main(String[] args) {
        ChessManufacture standChessManufacture = StandartChessManufacture.getInstance();
        ChessManufacture miniChessManufacture = MiniChessManufacture.getInstance();
        try {
            Chess chess = standChessManufacture.orderChess("wood");
            System.out.println("Michael ordered " + chess.getName() + "\n");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Chess chess = miniChessManufacture.orderChess("ivory");
            System.out.println("John ordered " + chess.getName() + "\n");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Chess chess = miniChessManufacture.orderChess("asdf");
            System.out.println("Anne ordered " + chess.getName() + "\n");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
