package ca.bcit.comp2522.step_04_events_part_1;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Illustrates how to bind one property to another.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class PropertyBindingDemo extends Application {

    /**
     * Displays the width and height of the scene, as well as a circle
     * in the center of the scene. The scene is updated using property
     * bindings when the window is resized.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Group root = new Group();
        final int appWidth = 600;
        final int appHeight = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BISQUE);

        final int circleRadius = 40;
        Circle center = new Circle(circleRadius);

        // Here is where the binding takes place.  Neat-o!
        center.centerXProperty().bind(scene.widthProperty().divide(2));
        center.centerYProperty().bind(scene.heightProperty().divide(2));

        // We can wrap a String value with a property so it can be
        // modified without using events.
        StringProperty width = new SimpleStringProperty("Width: ");
        StringProperty height = new SimpleStringProperty("Height: ");

        final int textX = 20;
        final int textY = 30;
        Text widthText = new Text(textX, textY, "");

        // Binding the text to the scene size too
        widthText.textProperty().bind(width.concat(scene.widthProperty()));
        Text heightText = new Text(textX, textY * 2, "");
        heightText.textProperty().bind(height.concat(scene.heightProperty()));

        root.getChildren().addAll(center, widthText, heightText);

        primaryStage.setTitle("Property Binding Demo");
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

