package ca.bcit.comp2522.step_06_fun_controls;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Demonstrates a split pane and a list view.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class FoodImages extends Application {

    // The food images
    private Image[] foodImages;

    // Displays the selected image
    private ImageView imgView;

    // Displays the list of image names
    private ListView<String> listView;

    /**
     * Displays a split pane with a list of food items on the left and an
     * image of the selected food item on the right.
     *
     * @param primaryStage a Stage
     */
    public void start(final Stage primaryStage) {
        final String[] food = {"apples", "asparagus", "bacon",
                               "bread", "carrots", "cheesecake",
                               "eggs", "hamburger", "muffins",
                               "onions", "oranges", "pancakes",
                               "peanuts", "pizza", "potatoes",
                               "pretzels", "spaghetti", "sushi",
                               "watermelon" };

        foodImages = new Image[food.length];
        for (int i = 0; i < food.length; i++) {
            foodImages[i] = new Image(food[i] + ".jpg");
        }

        imgView = new ImageView(foodImages[0]);
        StackPane imgPane = new StackPane(imgView);
        final int imageWidth = 300;
        imgPane.setMinWidth(imageWidth);

        imgView.setPreserveRatio(true);

        // Binding properties...
        imgView.fitWidthProperty().bind(imgPane.widthProperty());

        // Fancy.
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll(food);
        listView = new ListView<String>(list);
        final int listWidth = 100;
        listView.setMinWidth(listWidth);
        listView.getSelectionModel().select(0);
        listView.getSelectionModel().selectedItemProperty().
                            addListener(this::processListSelection);

        SplitPane root = new SplitPane();
        final double dividerPositions = 0.25;
        root.setDividerPositions(dividerPositions);
        root.getItems().addAll(listView, imgPane);

        final int appWidth = 600;
        final int appHeight = 350;
        Scene scene = new Scene(root, appWidth, appHeight);

        primaryStage.setTitle("Food Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Processes a list view selection by getting the index of the selected item
     * and displaying the corresponding image.
     *
     * @param val The value that changed
     * @param oldValue The old value
     * @param newValue The new value
     */
    public void processListSelection(final ObservableValue<? extends String> val,
                                     final String oldValue,
                                     final String newValue) {
        int index = listView.getSelectionModel().getSelectedIndex();
        imgView.setImage(foodImages[index]);
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

