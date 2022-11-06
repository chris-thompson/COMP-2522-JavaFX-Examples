package ca.bcit.comp2522.step_03_layouts;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates how to use a GridPane.
 * <a href="https://openjfx.io/javadoc/18/javafx.graphics/javafx/scene/layout/GridPane.html">GridPane</a>
 *
 * @author BCIT
 * @version 2022
 */
public class GridPaneDemo extends Application {

    /**
     * Creates the GridPane.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: white");
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(20);
        gridPane.setVgap(10);

        // gridPane.setGridLinesVisible(true);

        ImageView logo = new ImageView(new Image("gull.jpg"));

        // Add takes 5 parameters:
        // 1. What we're adding
        // 2. Column index
        // 3. Row index
        // 4. Column span
        // 5. Row span
        gridPane.add(logo, 0, 0, 1, 3);

        // Text object!
        Text title = new Text("Welcome to Emotiful!");
        GridPane.setHalignment(title, HPos.CENTER);
        title.setFont(new Font(18));
        gridPane.add(title, 1, 0, 2, 1);

        Label userLabel = new Label("User name:");
        userLabel.setFont(new Font(18));

        // We can set alignment (horizontal and vertical)
        // Note we are using a static constant from the HPos class
        GridPane.setHalignment(userLabel, HPos.RIGHT);
        gridPane.add(userLabel, 1, 1);

        TextField userName = new TextField();
        // If spans are always 1, we can omit them when adding a Node
        gridPane.add(userName, 2, 1);

        Label pwLabel = new Label("Password:");
        pwLabel.setFont(new Font(18));
        GridPane.setHalignment(pwLabel, HPos.RIGHT);
        gridPane.add(pwLabel, 1, 2);

        TextField password = new TextField();
        gridPane.add(password, 2, 2);

        Text greeting = new Text("Have an emotiful day!");
        greeting.setFont(new Font(18));
        GridPane.setHalignment(greeting, HPos.CENTER);
        gridPane.add(greeting, 1, 3, 2, 1);

        Scene scene = new Scene(gridPane, 900, 450);

        primaryStage.setTitle("GridPane Demo");
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
