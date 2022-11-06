/*
 * Copyright (c) 2008, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package ca.bcit.comp2522.step_07_animation;

import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 * AnimationInterpolator, an introduction to interpolation.
 *
 * @author BCIT
 * @version 2022
 */
public class AnimationInterpolator extends Application {

    /**
     * The start method is public and it returns nothing (void).  We
     * create our JavaFX application here.
     */
   @Override public void start(final Stage stage) {
        stage.setTitle("Interpolator");
        final Group group = new Group();
        final Scene scene = new Scene(group, 600, 450);
        stage.setScene(scene);
        stage.show();

        final Rectangle rect = new Rectangle(100, 200, 100, 50);
        rect.setFill(Color.BROWN);

        group.getChildren().add(rect);

        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        final KeyValue keyValue1 = new KeyValue(rect.xProperty(), 300);
        AnimationBooleanInterpolator yPositionInterpolator = new AnimationBooleanInterpolator();
        final KeyValue keyValue2 = new KeyValue(rect.yProperty(), 0., yPositionInterpolator);


        final KeyFrame kf1 = new KeyFrame(Duration.millis(2000), keyValue1);
        final KeyFrame kf2 = new KeyFrame(Duration.millis(2000), keyValue2);
        timeline.getKeyFrames().add(kf1);
        timeline.getKeyFrames().add(kf2);
        timeline.play();
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
        Application.launch(args);
    }
}
