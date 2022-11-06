package ca.bcit.comp2522.step_02_basic_shapes;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * Demonstrates the use of Image and ImageView objects.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class ImageDisplay extends Application {

    /**
     * Displays an image centered in a window.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {

        // Instantiate an image...
        Image image = new Image("ohdear.jpg");

        // ...and immediately wrap it in a view
        ImageView imageView = new ImageView(image);

        // Declare and initialize locals when we need them
        // Make sure they are final
        final int viewX = 0;
        final int viewY = 0;
        final int viewWidth = 500;
        final int viewHeight = 500;

        // Set the size of the ImageView using a Rectangle2D
        imageView.setViewport(new Rectangle2D(viewX, viewY, viewWidth, viewHeight));

        // Add the ImageView to a Group
        Group root = new Group(imageView);

        // Add the Group to a Scene
        final int appWidth = 500;
        final int appHeight = 500;
        Scene scene = new Scene(root, appWidth, appHeight);

        // Add the Scene to the Stage and display it.
        primaryStage.setTitle("Oh dear");
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

