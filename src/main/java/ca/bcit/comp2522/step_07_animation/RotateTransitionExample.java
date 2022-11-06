package ca.bcit.comp2522.step_07_animation;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * RotateTransitionExample, an introduction to rotation animation.
 *
 * @author BCIT
 * @version 2022
 */
public class RotateTransitionExample extends Application {

    /**
     * The start method is public and it returns nothing (void). We
     * create our JavaFX application here.
     */
    @Override
    public void start(final Stage stage) {
        //Creating a hexagon
        Polygon hexagon = new Polygon();

        //Adding coordinates to the hexagon
        hexagon.getPoints().addAll(200.0, 50.0,
                400.0, 50.0,
                450.0, 150.0,
                400.0, 250.0,
                200.0, 250.0,
                150.0, 150.0);
        //Setting the fill color for the hexagon
        hexagon.setFill(Color.BLUE);

        //Creating a rotate transition
        RotateTransition rotateTransition = new RotateTransition();

        //Setting the duration for the transition
        rotateTransition.setDuration(Duration.millis(1000));

        //Setting the node for the transition
        rotateTransition.setNode(hexagon);

        //Setting the angle of the rotation
        rotateTransition.setByAngle(360);

        //Setting the cycle count for the transition
        rotateTransition.setCycleCount(50);

        //Setting auto reverse value to false
        rotateTransition.setAutoReverse(false);

        //Playing the animation
        rotateTransition.play();

        //Creating a Group object
        Group root = new Group(hexagon);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        stage.setTitle("Rotate transition example ");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }


    /**
     * Launches the JavaFX application.  We still need a main method in our
     * JavaFX applications.  The main method must do one thing.  Pass
     * the command line arguments (args) to the launch method inherited from
     * the Application class.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
