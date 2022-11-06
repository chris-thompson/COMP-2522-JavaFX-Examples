package ca.bcit.comp2522.step_06_fun_controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Demonstrates the use of slider controls and property binding.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class EllipseSliders extends Application {

    private static final int ELLIPSE_CENTRE_X = 250;
    private static final int ELLIPSE_CENTRE_Y = 150;
    private static final int ELLIPSE_RADIUS_X = 150;
    private static final int ELLIPSE_RADIUS_Y = 75;

    /**
     * Displays an ellipse with sliders that control the width and
     * height of the ellipse.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Ellipse ellipse = new Ellipse(ELLIPSE_CENTRE_X, ELLIPSE_CENTRE_Y,
                ELLIPSE_RADIUS_X, ELLIPSE_RADIUS_Y);
        ellipse.setFill(Color.SALMON);

        final int maxXValue = 200;
        final int initialXValue = 150;
        Slider xSlider = new Slider(0, maxXValue, initialXValue);
        xSlider.setShowTickMarks(true);
        final int narrowPadding = 20;
        final int midPadding = 30;
        final int widePadding = 80;
        xSlider.setPadding(new Insets(0, narrowPadding, narrowPadding, widePadding));
        ellipse.radiusXProperty().bind(xSlider.valueProperty());

        final int maxYValue = 100;
        final int initialYValue = 75;
        Slider ySlider = new Slider(0, maxYValue, initialYValue);
        ySlider.setOrientation(Orientation.VERTICAL);
        ySlider.setShowTickMarks(true);
        ySlider.setPadding(new Insets(narrowPadding, 0, 0, midPadding));

        ellipse.radiusYProperty().bind(ySlider.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setLeft(ySlider);
        pane.setBottom(xSlider);
        pane.setCenter(ellipse);
        pane.setStyle("-fx-background-color: grey");

        final int appWidth = 500;
        final int appHeight = 300;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Ellipse Sliders");
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

