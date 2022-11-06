package ca.bcit.comp2522.step_02_basic_shapes;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Demonstrates the use of loops and conditionals to draw.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class Boxes extends Application {

    /**
     * Displays multiple rectangles with random width and height in random
     * locations. Narrow and short boxes are highlighted with a fill color
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Group root = new Group();
        Random gen = new Random();

        final int numberOfBoxes = 50;
        final int boxMaximumSize = 50;
        final int boxMaxCoordinate = 600;
        final int colourBoundary = 10;

        for (int count = 0; count < numberOfBoxes; count++) {
            int x = gen.nextInt(boxMaxCoordinate) + 1;
            int y = gen.nextInt(boxMaxCoordinate) + 1;

            int width = gen.nextInt(boxMaximumSize) + 1;
            int height = gen.nextInt(boxMaximumSize) + 1;

            Color fill = null;
            if (width < colourBoundary) {
                fill = Color.YELLOW;
            } else if (height < colourBoundary) {
                fill = Color.GREEN;
            }

            Rectangle box = new Rectangle(x, y, width, height);
            box.setStroke(Color.WHITE);
            box.setFill(fill);

            root.getChildren().add(box);
        }

        final int appWidth = 600;
        final int appHeight = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);

        primaryStage.setTitle("Boxes");
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

