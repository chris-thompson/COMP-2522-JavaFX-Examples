package ca.bcit.comp2522.step_06_fun_controls;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

/**
 * Demonstrates the use of radio buttons.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class QuoteOptionsPane extends HBox {

    // Contains the quote
    private final Text quote;

    // Fixed philosophy quote
    private final String philosophyQuote;

    // Fixed carpentry quote
    private final String carpentryQuote;

    // Fixed comedy quote
    private final String comedyQuote;

    // Button to select philosophy quote
    private final RadioButton philosophyButton;

    // Button to select carpentry quote
    private final RadioButton carpentryButton;

    /**
     * Constructs this pane with a Text object and radio buttons that
     * determine which phrase is displayed.
     */
    public QuoteOptionsPane() {
        philosophyQuote = "I think, therefore I am.";
        carpentryQuote = "Measure twice. Cut once.";
        comedyQuote = "Waka, waka, waka!";

        quote = new Text(philosophyQuote);
        final int fontSize = 24;
        quote.setFont(new Font("Helvetica", fontSize));

        StackPane quotePane = new StackPane(quote);

        final int appWidth = 300;
        final int appHeight = 100;
        quotePane.setPrefSize(appWidth, appHeight);

        ToggleGroup group = new ToggleGroup();

        philosophyButton = new RadioButton("Philosophy");
        philosophyButton.setSelected(true);
        philosophyButton.setToggleGroup(group);
        philosophyButton.setOnAction(this::processRadioButtonAction); // Neat!

        carpentryButton = new RadioButton("Carpentry");
        carpentryButton.setToggleGroup(group);
        carpentryButton.setOnAction(this::processRadioButtonAction);

        // Buttom to select comedy quote
        RadioButton comedyButton = new RadioButton("Comedy");
        comedyButton.setToggleGroup(group);
        comedyButton.setOnAction(this::processRadioButtonAction);

        VBox options = new VBox(philosophyButton, carpentryButton, comedyButton);
        options.setAlignment(Pos.CENTER_LEFT);
        final int optionSpacing = 10;
        options.setSpacing(optionSpacing);

        final int componentSpacing = 20;
        setSpacing(componentSpacing);
        getChildren().addAll(options, quotePane);
    }

    /**
     * Updates the content of the displayed text.
     * @param event invoked this method
     */
    public void processRadioButtonAction(final ActionEvent event) {
        if (philosophyButton.isSelected()) {
            quote.setText(philosophyQuote);
        } else if (carpentryButton.isSelected()) {
            quote.setText(carpentryQuote);
        } else {
            quote.setText(comedyQuote);
        }
    }
}

