package ca.bcit.comp2522.step_02_basic_shapes;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

/**
 * An introduction to translating JavaFX shapes and groups.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class Snowman extends Application {

    /**
     * Creates and displays a *yuck* snowy *yuck* scene.
     *
     * @param primaryStage contains the scene
     */
    public void start(final Stage primaryStage) {
        Ellipse base = new Ellipse(80, 210, 80, 60);
        base.setFill(Color.WHITE);

        Ellipse middle = new Ellipse(80, 130, 50, 40);
        middle.setFill(Color.WHITE);

        Circle head = new Circle(80, 70, 30);
        head.setFill(Color.WHITE);

        Circle rightEye = new Circle(70, 60, 5);
        Circle leftEye = new Circle(90, 60, 5);
        Line mouth = new Line(70, 80, 90, 80);

        Circle topButton = new Circle(80, 120, 6);
        topButton.setFill(Color.RED);

        Circle bottomButton = new Circle(80, 140, 6);
        bottomButton.setFill(Color.RED);

        Line leftArm = new Line(110, 130, 160, 130);
        leftArm.setStrokeWidth(3);

        Line rightArm = new Line(50, 130, 0, 100);
        rightArm.setStrokeWidth(3);

        Rectangle stovepipe = new Rectangle(60, 0, 40, 50);
        Rectangle brim = new Rectangle(50, 45, 60, 5);
        Group hat = new Group(stovepipe, brim);
        hat.setTranslateX(10);
        hat.setRotate(15);

        Group snowman = new Group(base, middle, head, leftEye, rightEye, mouth,
                topButton, bottomButton, leftArm, rightArm, hat);
        snowman.setTranslateX(170);
        snowman.setTranslateY(50);

        Circle sun = new Circle(50, 50, 30);
        sun.setFill(Color.GOLD);

        Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.STEELBLUE);

        Group root = new Group(ground, sun, snowman);
        Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);

        primaryStage.setTitle("I'm so tired of snow(man)");
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

