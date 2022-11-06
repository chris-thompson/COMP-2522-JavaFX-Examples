package ca.bcit.comp2522.step_04_events_part_1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * A variation on the PushCounter program that uses a lambda
 * expression to define the event handler.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class PushCounter3 extends Application {
    // Records the number of times the button is pressed.
    private int count;

    // Displays the number of times the button is pressed.
    private Text countText;

    /**
     * Displays a GUI containing a button and text that displays how many times
     * the button is pushed.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {

        count = 0;
        countText = new Text("Pushes: 0");

        Button push = new Button("Push Me!");

        // A lambda is a simplified version of a functional interface
        // A functional interface is an interface that only has one
        // method
        push.setOnAction((event) -> { // Wow, a lambda expression!
            count++;
            countText.setText("Pushes: " + count);
        });

        FlowPane pane = new FlowPane(push, countText);
        pane.setAlignment(Pos.CENTER);

        final int horizontalGap = 20;
        pane.setHgap(horizontalGap);
        pane.setStyle("-fx-background-color: dimgrey");

        final int appWidth = 300;
        final int appHeight = 100;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("PushCounter Version 3");
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

