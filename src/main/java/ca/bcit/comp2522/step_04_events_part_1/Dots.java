package ca.bcit.comp2522.step_04_events_part_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates the use of an array of Color objects and the capture of a double
 * mouse click.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class Dots extends Application {
    // Colours used
    private final Color[] colorList = {Color.RED, Color.CYAN,
                                 Color.MAGENTA, Color.YELLOW,
                                 Color.LIME, Color.WHITE
                                };

    // Stores the index of the current colour
    private int colorIndex;

    // Stores the number of circles
    private int count;

    // Displays the number of circles
    private Text countText;

    // Contains the contents of the app
    private Group root;

    /**
     * Displays a scene on which the user can add colored dots with mouse
     * clicks.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        final int textXCoord = 20;
        final int textYCoord = 30;
        countText = new Text(textXCoord, textYCoord, "Count: 0");

        final int fontSize = 18;
        countText.setFont(new Font(fontSize));
        countText.setFill(Color.WHITE);

        root = new Group(countText);

        final int appWidth = 600;
        final int appHeight = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);

        // Register the listener here
        scene.setOnMouseClicked(this::processMouseClick);

        primaryStage.setTitle("Dots");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Processes a mouse click by adding a circle to that location. Circle
     * colors rotate through a set list of colors. A double click clears the
     * dots and resets the counter.
     *
     * @param event invokes this method
     */
    public void processMouseClick(final MouseEvent event) {
        final int circleRadius = 10;
        if (event.getClickCount() == 2) {
            count = 0;
            colorIndex = 0;
            root.getChildren().clear();
            countText.setText("Count: 0");
            root.getChildren().add(countText);
        } else {
            Circle circle = new Circle(event.getX(), event.getY(), circleRadius);
            circle.setFill(colorList[colorIndex]);
            root.getChildren().add(circle);
            colorIndex = (colorIndex + 1) % colorList.length;
            count++;
            countText.setText("Count: " + count);
        }
    }

    /**
     * Launches the JavaFX application.
     *
     * @param args
     *            command line arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }
}

