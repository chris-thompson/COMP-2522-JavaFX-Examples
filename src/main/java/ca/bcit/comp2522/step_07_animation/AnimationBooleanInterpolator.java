package ca.bcit.comp2522.step_07_animation;

import javafx.animation.Interpolator;

/**
 * AnimationBooleanInterpolator overrrides the abstract curve method inherited
 * from the abstract class Interpolator.
 *
 * We use these to calculate interpolated values.
 *
 * An interpolated value is an estimate of a value based on how much time has elapsed.
 *
 * @author BCIT
 * @version 2022
 */
public class AnimationBooleanInterpolator extends Interpolator {

    /**
     * Interpolates a position on a curve based on how much time has elapsed when
     * time is normalized to the range [0.0, 1.0].
     *
     * @param time
     *            time, but normalized to the range [0.0..1.0], where 0.0 is the
     *            start of the current interval, while 1.0 is the end of the
     *            current interval. Usually a function that increases
     *            monotonically.
     * @return position as a double (does this look like a parabola to you?)
     */
    @Override
    protected double curve(final double time) {
        return Math.abs(0.5 - time) * 2;
    }

}
