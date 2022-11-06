package ca.bcit.comp2522.step_05_fonts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates the creation and use of fonts.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class FontDemo extends Application {

    /**
     * Displays three Text objects using various font styles.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        final int smallFont = 14;
        final int mediumFont = 28;
        final int largeFont = 36;

        Font font1 = new Font("Courier", largeFont);
        Font font2 = Font.font("Times", FontWeight.BOLD, FontPosture.ITALIC, mediumFont);
        Font font3 = Font.font("Arial", FontPosture.ITALIC, smallFont);

        final int dreamX = 30;
        final int dreamY = 55;
        Text text1 = new Text(dreamX, dreamY, "Dream Big");
        text1.setFont(font1);
        text1.setUnderline(true);

        final int knowX = 150;
        final int knowY = 110;
        Text text2 = new Text(knowX, knowY, "Know thyself!");
        text2.setFont(font2);
        text2.setFill(Color.GREEN);

        final int theoryX = 50;
        final int theoryY = 150;
        Text text3 =
            new Text(theoryX, theoryY, "In theory, there is no difference "
                + "between theory\nand practice, but in practice there is.");
        text3.setFont(font3);

        Group root = new Group(text1, text2, text3);
        final int appWidth = 400;
        final int appHeight = 200;
        Scene scene = new Scene(root, appWidth, appHeight, Color.LIGHTCYAN);

        primaryStage.setTitle("Font Demo");
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

