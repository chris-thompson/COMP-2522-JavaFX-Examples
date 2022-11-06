package ca.bcit.comp2522.step_03_layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates how to use a BorderPane.
 * <a href="https://openjfx.io/javadoc/18/javafx.graphics/javafx/scene/layout/BorderPane.html">BorderPane</a>
 *
 * @author BCIT
 * @version 2022
 */
public class BorderPaneDemo extends Application {

    /**
     * Creates the BorderPane.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        Text title = new Text("BorderPaneDemo");
        title.setFont(Font.font(24));
        title.setFill(Color.RED);

        // Instantiate a StackPane
        StackPane titlePane = new StackPane(title);

        // Add multiple styles to it at once
        titlePane.setStyle("-fx-padding: 20px; -fx-background-color: black");


        ImageView imageView = new ImageView(new Image("bacon.jpg"));

        Rectangle rect = new Rectangle(600, 600, null);
        rect.setStroke(Color.ORANGE);
        rect.setStrokeWidth(6);

        StackPane imagePane = new StackPane(imageView, rect);
        imagePane.setStyle("-fx-background-color: white");

        // Check these out!
        RadioButton sepiaButton = new RadioButton("Sepia");
        RadioButton monoButton = new RadioButton("Monochrome");
        RadioButton colorButton = new RadioButton("Full Color");

        // There's a Separator class too!
        Separator separator = new Separator();

        // And a Label class...
        Label colorLabel = new Label("Frame:");

        // And a very neat colour picker called ColorPicker
        ColorPicker colorPicker = new ColorPicker(Color.ORANGE);

        // A VBox is a vertical column
        VBox colorControls =
                new VBox(sepiaButton, monoButton, colorButton, separator, colorLabel, colorPicker);
        colorControls.setStyle("-fx-padding: 20px 10px; " + "-fx-background-color: skyblue");
        colorControls.setSpacing(10);

        Button prev = new Button("Prev");
        Button next = new Button("Next");

        // Let's throw an AnchorPane in there while we're at it
        AnchorPane navPane = new AnchorPane(prev, next);
        navPane.setStyle("-fx-background-color: black");
        navPane.setPrefHeight(70);

        AnchorPane.setBottomAnchor(prev, 20.0);
        AnchorPane.setLeftAnchor(prev, 30.0);
        AnchorPane.setBottomAnchor(next, 20.0);
        AnchorPane.setRightAnchor(next, 30.0);

        // And finally, our BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(titlePane);
        borderPane.setLeft(colorControls);
        borderPane.setCenter(imagePane);
        borderPane.setBottom(navPane);

        Scene scene = new Scene(borderPane, 1000, 900);

        primaryStage.setTitle("This is a hot mess.");
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
