package ca.bcit.comp2522.step_04_events_part_1;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 * Demonstrates the use of a TextField and a GridPane.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class FahrenheitPane extends GridPane {

    // Holds the converted temperature in degrees Celsius
    private final Label result;

    // Holds a string representing a temperature in degrees Fahrenheit
    private final TextField fahrenheit;

    /**
     * Constructs a FahrenheitPane object that contains a labeled text field for
     * converting temperatures in Fahrenheit to Celsius.
     */
    public FahrenheitPane() {
        final int fontSize = 18;
        final int fieldWidth = 50;
        final int horizontalGap = 50;
        final int verticalGap = 10;

        // We can create Font objects!
        Font font = new Font(fontSize);

        Label inputLabel = new Label("Fahrenheit:");
        inputLabel.setFont(font);
        GridPane.setHalignment(inputLabel, HPos.RIGHT);

        Label outputLabel = new Label("Celsius:");
        outputLabel.setFont(font);
        GridPane.setHalignment(outputLabel, HPos.RIGHT);

        result = new Label("---");
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);

        fahrenheit = new TextField();
        fahrenheit.setFont(font);
        fahrenheit.setPrefWidth(fieldWidth);
        fahrenheit.setAlignment(Pos.CENTER);

        // Here's where we set our action listener
        fahrenheit.setOnAction(this::processReturn); // Wow!

        setAlignment(Pos.CENTER);
        setHgap(horizontalGap);
        setVgap(verticalGap);
        setStyle("-fx-background-color: dimgrey");

        add(inputLabel, 0, 0);
        add(fahrenheit, 1, 0);
        add(outputLabel, 0, 1);
        add(result, 1, 1);
    }

    /**
     * Computes and displays the converted temperature when the user presses the
     * return key while in the text field.
     *
     * @param event invokes this method
     */
    public void processReturn(final ActionEvent event) {
        final int freezingFahrenheit = 32;

        // We acquire the value of the text field...
        int fahrenheitTemp = Integer.parseInt(fahrenheit.getText());
        double celsiusTemp =
                (fahrenheitTemp - freezingFahrenheit) * (5.0 / 9.0);

        // ...and then we change the value of the next field.
        result.setText(celsiusTemp + "");
    }
}

