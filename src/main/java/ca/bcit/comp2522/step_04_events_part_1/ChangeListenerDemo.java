package ca.bcit.comp2522.step_04_events_part_1;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates the ability to respond to property changes using change
 * listeners. Functionally equivalent to PropertyBindingDemo.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class ChangeListenerDemo extends Application {
    // Contains the components in the application
    private Scene scene;

    // The circle in the scene
    private Circle center;

    // Displays the app width
    private Text widthText;

    // Displays the app height
    private Text heightText;

    /**
     * Displays the width and height of the scene, as well as a circle in the
     * center of the scene. The scene is updated using a change listener as the
     * window is resized.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Group root = new Group();

        final int appWidth = 600;
        final int appHeight = 600;
        scene = new Scene(root, appWidth, appHeight, Color.SKYBLUE);

        // We add a listener to the Scene's properties
        scene.widthProperty().addListener(this::processResize);
        scene.heightProperty().addListener(this::processResize);

        final int circleRadius = 40;
        center = new Circle(circleRadius);
        center.setCenterX(scene.getWidth() / 2);
        center.setCenterY(scene.getHeight() / 2);

        final int textX = 20;
        final int textY = 30;
        widthText = new Text(textX, textY, "Width: " + scene.getWidth());
        heightText = new Text(textX, textY * 2, "Height: " + scene.getHeight());

        root.getChildren().addAll(center, widthText, heightText);

        primaryStage.setTitle("Change Listener Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Updates the position of the circle and the displayed width and height
     * when the window is resized.  This method implements the
     * ChangeListener<T> functional interface.
     *
     * @param property The property that changed
     * @param oldValue The old value
     * @param newValue The new value
     */
    public void processResize(final ObservableValue<? extends Number> property,
                              final Object oldValue,
                              final Object newValue) {
        center.setCenterX(scene.getWidth() / 2);
        center.setCenterY(scene.getHeight() / 2);
        widthText.setText("Width: " + scene.getWidth());
        heightText.setText("Height: " + scene.getHeight());
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

