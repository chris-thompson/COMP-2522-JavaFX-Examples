package ca.bcit.comp2522.step_06_fun_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * Demonstrates the use of a scroll pane.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class MapViewer extends Application {

    /**
     * Presents a scroll pane that allows the user to determine which section of
     * the underlying image (a map of Canada) is visible.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Image img = new Image("map.gif");
        ImageView imgView = new ImageView(img);

        ScrollPane root = new ScrollPane(imgView);
        root.setHbarPolicy(ScrollBarPolicy.ALWAYS);

        final int appWidth = 400;
        final int appHeight = 400;
        Scene scene = new Scene(root, appWidth, appHeight);

        primaryStage.setTitle("Map Viewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Launches the JavaFX application.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }
}

