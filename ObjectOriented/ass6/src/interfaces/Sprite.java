// 318844685 David Berkovits
package interfaces;

import biuoop.DrawSurface;

/**
 * The interface interfaces.Sprite.
 *
 * @author David Berkovits ID : 318844685
 */
public interface Sprite {
    /**
     * draw the sprite to the screen.
     *
     * @param d the DrawSurface
     */
    void drawOn(DrawSurface d);

    /**
     * draw the sprite to the screen with screen manager.
     */
    void timePassed();
}