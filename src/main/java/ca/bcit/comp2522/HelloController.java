package ca.bcit.comp2522;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Hello controller.
 *
 * @author BCIT
 * @version 2022
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected final void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
