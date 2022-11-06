package ca.bcit.comp2522.step_06_fun_controls;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates use of color picker and date picker controls.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class PickerDemo extends Application {
    // Stores the message
    private Text message;

    // Lets the user pick a date
    private DatePicker datePicker;

    // Lets the user pick a colour
    private ColorPicker colorPicker;

    /**
     * Allows the user to select a date and a color. A Text object displays the
     * day of the week in the color specified.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        datePicker = new DatePicker(LocalDate.now());

        // Register a listener for the DatePicker object
        datePicker.setOnAction(this::processDateChoice);

        colorPicker = new ColorPicker(Color.BLACK);

        // Register a listener for the ColorPicker object
        colorPicker.setOnAction(this::processColorChoice);

        final int fontSize = 24;
        message = new Text("HAPPY " + LocalDate.now().getDayOfWeek());
        message.setFont(
            Font.font("Helvetica", FontWeight.BOLD,
                    FontPosture.REGULAR, fontSize));

        HBox pickers = new HBox(datePicker, colorPicker);
        final int hBoxSpacing = 15;
        pickers.setSpacing(hBoxSpacing);
        pickers.setAlignment(Pos.CENTER);

        VBox root = new VBox();
        root.setStyle("-fx-background-color: white");
        final int vBoxSpacing = 20;
        root.setSpacing(vBoxSpacing);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(pickers, message);

        final int appWidth = 400;
        final int appHeight = 150;
        Scene scene = new Scene(root, appWidth, appHeight);

        primaryStage.setTitle("Picker Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Gets the value of the date from the date picker and updates the
     * message with the corresponding day of the week.
     *
     * @param event invokes this method
     */
    public void processDateChoice(final ActionEvent event) {
        LocalDate date = datePicker.getValue();
        message.setText("HAPPY " + date.getDayOfWeek());
    }

    /**
     * Gets the color specified in the color picker and sets the
     * color of the displayed message.
     *
     * @param event invokes this method
     */
    public void processColorChoice(final ActionEvent event) {
        message.setFill(colorPicker.getValue());
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

