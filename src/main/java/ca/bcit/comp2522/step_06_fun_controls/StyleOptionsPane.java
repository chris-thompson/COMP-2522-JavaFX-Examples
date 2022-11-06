package ca.bcit.comp2522.step_06_fun_controls;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * Demonstrates the use of check boxes.
 *  * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class StyleOptionsPane extends VBox {

    /** Font size. */
    public static final int FONT_SIZE = 24;

    private final Text phrase;
    private final CheckBox boldCheckBox;
    private final CheckBox italicCheckBox;

    /**
     * Constructs this pane with a Text object and check boxes that
     * determine the style of the text font.
     */
    public StyleOptionsPane() {
        phrase = new Text("Say it with style!");
        phrase.setFont(new Font("Serif", FONT_SIZE));

        boldCheckBox = new CheckBox("Bold");
        boldCheckBox.setOnAction(this::processCheckBoxAction);
        italicCheckBox = new CheckBox("Italic");
        italicCheckBox.setOnAction(this::processCheckBoxAction);

        HBox options = new HBox(boldCheckBox, italicCheckBox);
        options.setAlignment(Pos.CENTER);

        final int checkBoxSpacing = 20;
        options.setSpacing(checkBoxSpacing); // between the check boxes

        final int componentSpacing = 20;
        setSpacing(componentSpacing); // between the text and the check boxes
        getChildren().addAll(phrase, options);
    }

    /**
     * Updates the font style of the displayed text.
     * @param event invoked this method
     */
    public void processCheckBoxAction(final ActionEvent event) {
        FontWeight weight = FontWeight.NORMAL;
        FontPosture posture = FontPosture.REGULAR;

        if (boldCheckBox.isSelected()) {
            weight = FontWeight.BOLD;
        }

        if (italicCheckBox.isSelected()) {
            posture = FontPosture.ITALIC;
        }
        System.out.println(posture + " " + weight);
        phrase.setFont(Font.font("Serif", weight, posture, FONT_SIZE));
    }
}

