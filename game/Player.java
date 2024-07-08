package com.ludo.game;

public class Player {
    private int id;
    private boolean hasWon;

    public Player(int id) {
        this.id = id;
        this.hasWon = false;
    }

    public boolean hasWon() {
        return hasWon;
    }

    public int getId() {
        return id;
    }
}
