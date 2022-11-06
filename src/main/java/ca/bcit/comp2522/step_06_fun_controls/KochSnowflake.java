package ca.bcit.comp2522.step_06_fun_controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates the use of recursion to draw a fractal.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class KochSnowflake extends Application {

    // The minimum order of the fractal
    private static final int MIN_ORDER = 1;

    // The maximum order of the fractal
    private static final int MAX_ORDER = 6;

    // Current order
    private int order;

    // Up button
    private Button up;

    // Down button
    private Button down;

    // Displays the current fractal order
    private Text orderText;

    // Displays the snowflake
    private KochPane fractalPane;

    /**
     * Displays two buttons that control the order of the fractal shown in the
     * pane below the buttons.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Image upImage = new Image("up.png");
        up = new Button();
        up.setGraphic(new ImageView(upImage));
        up.setOnAction(this::processUpButtonPress);

        Image downImage = new Image("down.png");
        down = new Button();
        down.setGraphic(new ImageView(downImage));
        down.setOnAction(this::processDownButtonPress);
        down.setDisable(true);

        order = 1;
        orderText = new Text("Order: 1");

        HBox toolbar = new HBox();
        toolbar.setStyle("-fx-background-color: darksalmon");
        toolbar.setAlignment(Pos.CENTER);
        final int height = 50;
        final int spacing = 40;
        toolbar.setPrefHeight(height);
        toolbar.setSpacing(spacing);
        toolbar.getChildren().addAll(up, orderText, down);

        fractalPane = new KochPane();

        VBox root = new VBox();
        root.setStyle("-fx-background-color: white");
        root.getChildren().addAll(toolbar, fractalPane);

        final int appWidth = 400;
        final int appHeight = 450;
        Scene scene = new Scene(root, appWidth, appHeight);

        primaryStage.setTitle("Koch Snowflake");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Increments the fractal order when the up button is pressed. Disables the
     * up button if the maximum order is reached.
     *
     * @param event invoked this method
     */
    public void processUpButtonPress(final ActionEvent event) {
        order++;
        orderText.setText("Order: " + order);
        fractalPane.makeFractal(order);

        down.setDisable(false);
        if (order == MAX_ORDER) {
            up.setDisable(true);
        }
    }

    /**
     * Decrements the fractal order when the down button is pressed.
     * Disables the down button if the minimum order is reached.
     *
     * @param event invoked this method
     */
    public void processDownButtonPress(final ActionEvent event) {
        order--;
        orderText.setText("Order: " + order);
        fractalPane.makeFractal(order);

        up.setDisable(false);
        if (order == MIN_ORDER) {
            down.setDisable(true);
        }
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

