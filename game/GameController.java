package com.ludo.game;

public class GameController {
    private Game game;

    public GameController(Game game) {
        this.game = game;
    }

    public void movePiece(int steps) {
        // Example: move the first piece of the first player
        Piece piece = game.getBoard().getPieces().get(0);
        game.getBoard().movePiece(piece, steps);
        // Add game state update logic here
    }

    public void capturePiece(Piece piece) {
        // Capture logic
    }
}
