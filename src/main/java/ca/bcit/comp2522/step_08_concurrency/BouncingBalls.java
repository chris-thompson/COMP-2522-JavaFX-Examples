package ca.bcit.comp2522.step_08_concurrency;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Random;

/**
 * BouncingBalls, an introduction to threading and JavaFX.
 *
 * @author BCIT
 * @author YOUR NAME GOES HERE
 * @version 2022
 */
public class BouncingBalls extends Application {

    /**
     * Demonstrates threading in JavaFX.
     * @param primaryStage contains the Scene
     */
    public void start(final Stage primaryStage) {
        Pane canvas = new Pane();
        Scene scene = new Scene(canvas, 500, 500);
        Ball ball = new Ball(250, 250);

        canvas.getChildren().add(ball);

        primaryStage.setTitle("Threads and Balls");
        primaryStage.setScene(scene);
        primaryStage.show();

        Thread bouncer = new Thread(ball);
        bouncer.setDaemon(true);
        bouncer.start();

        Random random = new Random();
        for (int i = 0; i < 50; ++i) {
            Ball anotherBall = new Ball(random.nextInt(250), random.nextInt(250));
            canvas.getChildren().add(anotherBall);
            Thread bouncingBall = new Thread(anotherBall);
            bouncingBall.setDaemon(true);
            bouncingBall.start();
        }
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
