package com.ludo.game;

import com.ludo.gui.LudoGUI;

public class Game {
    private GameBoard board;
    private Player[] players;
    private Dice dice;
    private GameController controller;

    public Game(int numPlayers) {
        board = new GameBoard();
        players = new Player[numPlayers];
        dice = new Dice();
        controller = new GameController(this);
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player(i + 1);
        }
    }

    public void startGame() {
        LudoGUI gui = new LudoGUI(this);
        gui.show();
    }

    public void rollDice() {
        int roll = dice.roll();
        controller.movePiece(roll);
    }

    public boolean isGameOver() {
        for (Player player : players) {
            if (player.hasWon()) {
                return true;
            }
        }
        return false;
    }

    public GameBoard getBoard() {
        return board;
    }

    public Player[] getPlayers() {
        return players;
    }
}
