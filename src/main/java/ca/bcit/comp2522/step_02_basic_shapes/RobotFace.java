package ca.bcit.comp2522.step_02_basic_shapes;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Draws a robot face.  Note this class is a subclass of the
 * Group class.  We can do this!
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class RobotFace extends Group {

    /**
     * Constructs the elements that make up the robots face, positioned in the
     * upper left corner of the coordinate system.
     */
    public RobotFace() {
        Rectangle head = new Rectangle(5, 0, 100, 70);
        head.setFill(Color.SILVER);
        head.setArcHeight(10);
        head.setArcWidth(10);

        Rectangle ears = new Rectangle(0, 20, 110, 30);
        ears.setFill(Color.DARKBLUE);
        ears.setArcHeight(10);
        ears.setArcWidth(10);

        Rectangle eye1 = new Rectangle(25, 15, 20, 10);
        eye1.setFill(Color.GOLD);

        Rectangle eye2 = new Rectangle(65, 15, 20, 10);
        eye2.setFill(Color.GOLD);

        Rectangle nose = new Rectangle(52, 25, 6, 15);
        nose.setFill(Color.BLACK);

        Rectangle mouth = new Rectangle(35, 45, 40, 10);
        mouth.setFill(Color.RED);

        // We need to ask the Group object to give us its collection
        // of children, and once we have it, we immediately add
        // the robot's elements (order matters!)
        getChildren().addAll(ears, head, eye1, eye2, nose, mouth);
    }
}

