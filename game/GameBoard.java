package com.ludo.game;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private List<Piece> pieces;
    private int[][] boardLayout;

    public GameBoard() {
        pieces = new ArrayList<>();
        boardLayout = new int[15][15]; // 15x15 board layout
    }

    public void movePiece(Piece piece, int steps) {
        piece.move(steps);
    }

    public List<Piece> getPieces() {
        return pieces;
    }
}
