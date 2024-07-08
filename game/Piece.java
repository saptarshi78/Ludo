package com.ludo.game;

public class Piece {
    private int x, y, z; // 3D coordinates
    private Player owner;

    public Piece(Player owner, int startX, int startY, int startZ) {
        this.owner = owner;
        this.x = startX;
        this.y = startY;
        this.z = startZ;
    }

    public void move(int steps) {
        // Example movement logic
        x += steps;
        y += steps;
        z += steps;
    }

    public boolean isColliding(Piece otherPiece) {
        return MathUtils.distance(x, y, z, otherPiece.x, otherPiece.y, otherPiece.z) < 1.0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Player getOwner() {
        return owner;
    }
}
