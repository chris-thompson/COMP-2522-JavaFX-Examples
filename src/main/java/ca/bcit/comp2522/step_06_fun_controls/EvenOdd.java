package ca.bcit.comp2522.step_06_fun_controls;

import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * Demonstrates the use of information and confirmation alerts and
 * text input dialog boxes.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class EvenOdd extends Application {

    /**
     * Prompts the user for an integer, informs the user if that value is even
     * or odd, then asks if the user would like to process another value.
     *
     * All interaction is performed using dialog boxes!
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        boolean doAnother = true;

        while (doAnother) {
            TextInputDialog inputDialog = new TextInputDialog();
            inputDialog.setHeaderText(null);
            inputDialog.setTitle(null);
            inputDialog.setContentText("Enter an integer:");

            // An optional container object.  We'll look at this
            // closely when we examine generics.
            Optional<String> numString = inputDialog.showAndWait(); // Neato!
            if (numString.isPresent()) {
                int num = Integer.parseInt(numString.get());

                String result = "That number is "
                        + ((num % 2 == 0) ? "even." : "odd.");

                Alert answerDialog = new Alert(AlertType.INFORMATION);
                answerDialog.setHeaderText(null);
                answerDialog.setContentText(result);
                answerDialog.showAndWait();

                Alert confirmDialog = new Alert(AlertType.CONFIRMATION);
                confirmDialog.setHeaderText(null);
                confirmDialog.setContentText("Do another?");
                Optional<ButtonType> another = confirmDialog.showAndWait();

                if (another.get() != ButtonType.OK) {
                    doAnother = false;
                }
            } else {
                doAnother = false;
            }
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

