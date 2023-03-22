// 318844685 David Berkovits
package interfaces;

import biuoop.DrawSurface;

/**
 * The interface Animation.
 *
 * @author David Berkovits ID : 318844685
 */
public interface Animation {
    /**
     * Do one frame.
     *
     * @param d the d
     */
    void doOneFrame(DrawSurface d);

    /**
     * Should stop boolean.
     *
     * @return the boolean
     */
    boolean shouldStop();
}