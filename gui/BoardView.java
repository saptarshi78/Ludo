package com.ludo.gui;

import com.ludo.game.Game;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;

public class BoardView extends Group {
    private Game game;

    public BoardView(Game game) {
        this.game = game;

        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setNearClip(0.1);
        camera.setFarClip(100.0);
        camera.setTranslateZ(-20);

        Box boardBox = new Box(15, 15, 0.5);
        boardBox.setMaterial(new PhongMaterial(Color.WHITE));
        getChildren().add(boardBox);

        for (Piece piece : game.getBoard().getPieces()) {
            PieceView pieceView = new PieceView(piece);
            getChildren().add(pieceView);
        }
    }
}
