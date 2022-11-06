package ca.bcit.comp2522.step_02_basic_shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * An introduction to basic JavaFX shapes.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class Einstein extends Application {

    /**
     * Creates and displays several shapes.
     *
     * @param primaryStage contains the scene
     */
    public void start(final Stage primaryStage) {

        Line line = new Line(35, 60, 150, 170);

        Circle circle = new Circle(100, 65, 20);
        circle.setFill(Color.BLUE);

        Rectangle rect = new Rectangle(60, 70, 250, 60);
        rect.setStroke(Color.RED);
        rect.setStrokeWidth(2);
        rect.setFill(null); // No fill at all

        Ellipse ellipse = new Ellipse(200, 100, 150, 50);
        ellipse.setFill(Color.PALEGREEN);

        Text quote = new Text(120, 100, "Out of clutter, find "
                + "simplicity.\n-- Albert Einstein");

        Group root = new Group(ellipse, rect, circle, line, quote);
        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Albert Einstein");
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

