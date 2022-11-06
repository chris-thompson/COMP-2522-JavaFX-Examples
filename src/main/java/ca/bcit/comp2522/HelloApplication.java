package ca.bcit.comp2522;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * HelloApplication, an introduction to JavaFX.
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
public final class HelloApplication extends Application {

    /**
     * The start method is public and it returns nothing (void).  We
     * create our JavaFX application in two ways:
     *
     * 1. By loading an FXML file
     * 2. By manually instantiating Components, assembling them into Groups,
     * and then adding the root Group to a Scene.  Finally, we add the scene
     * to the Stage, and instruct the stage to display the Scene.
     *
     * Do you appreciate the theatre/stagecraft metaphors? :D
     *
     * @param stage contains the Scene
     */
    @Override
    public void start(final Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Launches the JavaFX application.  We still need a main method in our
     * JavaFX applications.  The main method must do one thing.  Invokes
     * the launch method inherited from the Application class.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        launch();
    }
}
