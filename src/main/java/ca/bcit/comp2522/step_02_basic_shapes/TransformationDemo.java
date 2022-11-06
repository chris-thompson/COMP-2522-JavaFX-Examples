package ca.bcit.comp2522.step_02_basic_shapes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

/**
 * Demonstrates graphic transformations.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class TransformationDemo extends Application {

    /**
     * Creates and presents the program window.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        // TRANSLATION
        Rectangle rec1 = new Rectangle(100, 100, 200, 50);
        rec1.setFill(Color.STEELBLUE);

        Rectangle rec2 = new Rectangle(100, 100, 200, 50);
        rec2.setFill(Color.ORANGE);
        rec2.setTranslateX(70);
        rec2.setTranslateY(10);

        // SCALING
        Image img = new Image("water lily.jpg");
        ImageView imgView = new ImageView(img);
        imgView.setX(100);
        imgView.setScaleX(0.7);
        imgView.setScaleY(0.7);

        // ROTATION
        Rectangle rec = new Rectangle(50, 100, 200, 50);
        rec.setFill(Color.STEELBLUE);
        rec.setRotate(40);

        Text text = new Text(270, 125, "Tilted Text!");
        text.setFont(new Font("Courier", 24));
        text.setRotate(-15);

        // SHEARING
        Image img2 = new Image("water lily.jpg");
        ImageView imgView2 = new ImageView(img2);
        imgView2.getTransforms().add(new Shear(0.4, 0.2));

        // Add and remove from root to observe changes
        Group root = new Group(rec1, rec2, imgView, rec, text, imgView2);
        final int appWidth = 500;
        final int appHeight = 250;
        Scene scene = new Scene(root, appWidth, appHeight);

        primaryStage.setTitle("Transformation Demo");
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

