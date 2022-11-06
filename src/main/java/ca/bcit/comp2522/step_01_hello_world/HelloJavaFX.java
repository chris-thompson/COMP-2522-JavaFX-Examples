package ca.bcit.comp2522.step_01_hello_world;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * HelloJavaFX, an introduction to JavaFX.
 *
 * Note that this class extends javafx.application.Application.
 *
 * Every JavaFX application is a subclass of the Application class. The
 * Application class is an abstract class.  It contains an abstract method
 * called start(Stage primaryStage).  This abstract method must be
 * implemented.  This is where we assemble our interface.
 *
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class HelloJavaFX extends Application {

    /**
     * Creates and displays two Text objects in a JavFX Window.
     *
     * The start method is public and it returns nothing (void).  We
     * create our JavaFX application by instantiating Components,
     * assembling them into Groups, and then adding the root Group
     * to a Scene.  Finally, we add the scene to the Stage, and
     * instruct the stage to display the Scene.
     *
     * Do you appreciate the theatre/stagecraft metaphors? :D
     *
     * @param primaryStage contains the Scene
     */
    public void start(final Stage primaryStage) {
        Text hello = new Text(50, 50, "Hello, JavaFX!");
        Text question = new Text(120, 80, "How's it going?");

        Group root = new Group(hello, question);
        Scene scene = new Scene(root, 300, 120, Color.LIGHTGREEN);

        primaryStage.setTitle("A JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Launches the JavaFX application.  We still need a main method in our
     * JavaFX applications.  The main method must do one thing.  Pass
     * the command line arguments (args) to the launch method inherited from
     * the Application class.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
