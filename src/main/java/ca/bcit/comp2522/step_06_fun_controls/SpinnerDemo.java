package ca.bcit.comp2522.step_06_fun_controls;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates the use of spinner controls and property binding.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class SpinnerDemo extends Application {

    /**
     * Presents an integer spinner and a string spinner, updating some
     * text when either value changes.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        final int maxSpinnerValue = 10;
        final int initialSpinnerValue = 5;
        IntegerSpinnerValueFactory svf =
                new IntegerSpinnerValueFactory(
                        1, maxSpinnerValue, initialSpinnerValue);
        // Numerical spinner
        Spinner<Integer> intSpinner = new Spinner<>(svf);

        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Grumpy", "Happy", "Sneezy", "Sleepy", "Dopey", "Bashful", "Doc");
        // Word spinner
        Spinner<String> stringSpinner = new Spinner<>(list);
        stringSpinner.getStyleClass().add(
                Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);

        StringProperty textString = new SimpleStringProperty("");

        // Displays the selections
        Text text = new Text();
        final int fontSize = 24;
        text.setFont(new Font("Helvetica", fontSize));
        text.textProperty().bind(
                textString.concat(intSpinner.valueProperty()).
                concat(" and ").concat(stringSpinner.valueProperty()));

        VBox pane = new VBox(intSpinner, stringSpinner, text);
        pane.setStyle("-fx-background-color: skyblue");
        pane.setAlignment(Pos.CENTER);
        final int spacing = 25;
        pane.setSpacing(spacing);

        final int appWidth = 300;
        final int appHeight = 250;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Spinner Demo");
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

