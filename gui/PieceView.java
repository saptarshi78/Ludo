package com.ludo.gui;

import com.ludo.game.Piece;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class PieceView extends Sphere {
    private Piece piece;

    public PieceView(Piece piece) {
        super(1); // Radius of 1 unit
        this.piece = piece;
        setMaterial(new PhongMaterial(Color.RED)); // Example color
        setTranslateX(piece.getX());
        setTranslateY(piece.getY());
        setTranslateZ(piece.getZ());
    }

    public void updateView() {
        setTranslateX(piece.getX());
        setTranslateY(piece.getY());
        setTranslateZ(piece.getZ());
    }
}
