// 318844685 David Berkovits
package interfaces;

import sprites.Ball;
import sprites.Block;

/**
 * The interface Hit listener.
 *
 * @author David Berkovits ID : 318844685
 */
public interface HitListener {
    /**
     * This method is called whenever the beingHit object is hit.
     * The hitter parameter is the Ball that's doing the hitting.
     *
     * @param beingHit the being hit
     * @param hitter   the hitter
     */
    void hitEvent(Block beingHit, Ball hitter);
}
