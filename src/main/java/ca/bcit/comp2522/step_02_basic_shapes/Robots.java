package ca.bcit.comp2522.step_02_basic_shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Demonstrates graphical transformations.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class Robots extends Application {

    /**
     * Displays three robot faces, applying various transformations.
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        RobotFace robot1 = new RobotFace();
        robot1.setTranslateX(70);
        robot1.setTranslateY(40);

        RobotFace robot2 = new RobotFace();
        robot2.setTranslateX(300);
        robot2.setTranslateY(40);
        robot2.setRotate(20);

        RobotFace robot3 = new RobotFace();
        robot3.setTranslateX(200);
        robot3.setTranslateY(200);
        robot3.setScaleX(2.5);
        robot3.setScaleY(2.5);

        Group root = new Group(robot1, robot2, robot3);

        final int appWidth = 500;
        final int appHeight = 380;
        Scene scene = new Scene(root, appWidth, appHeight, Color.WHITE);

        primaryStage.setTitle("Robots");
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

