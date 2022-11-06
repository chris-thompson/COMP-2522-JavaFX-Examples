package ca.bcit.comp2522.step_04_events_part_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Demonstrates the handling of keyboard events.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class AlienDirection extends Application {

    /**
     * Distance in pixels that the alien moves when a key is pressed.
     */
    public static final int JUMP = 10;

    // Contains the image of the alien
    private ImageView imageView;

    /**
     * Displays an image that can be moved using the arrow keys.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Image alien = new Image("alien.png", true);
        imageView = new ImageView(alien);

        final int alienStartCoordinate = 20;
        imageView.setX(alienStartCoordinate);
        imageView.setY(alienStartCoordinate);

        Group root = new Group(imageView);

        final int appWidth = 600;
        final int appHeight = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);

        // Register the key listener here
        scene.setOnKeyPressed(this::processKeyPress);

        primaryStage.setTitle("AlienDirection");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Modifies the position of the image view when an arrow key is pressed.
     *
     * @param event invoked this method
     */
    public void processKeyPress(final KeyEvent event) {
        switch (event.getCode()) {
            case UP -> imageView.setY(imageView.getY() - JUMP);
            case DOWN -> imageView.setY(imageView.getY() + JUMP);
            case RIGHT -> imageView.setX(imageView.getX() + JUMP);
            case LEFT -> imageView.setX(imageView.getX() - JUMP);
            default -> {
            } // Does nothing if it's not an arrow key
        }
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

