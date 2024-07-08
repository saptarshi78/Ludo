package com.ludo.gui;

import com.ludo.game.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LudoGUI extends Application {
    private Game game;

    public LudoGUI(Game game) {
        this.game = game;
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        BoardView boardView = new BoardView(game);
        root.setCenter(boardView);
    }

    public void show() {
        launch();
    }

    public void updateBoardView() {
        // Update the 3D board view
    }
}
