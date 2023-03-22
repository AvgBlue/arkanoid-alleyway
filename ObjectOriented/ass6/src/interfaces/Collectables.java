// 318844685 David Berkovits
package interfaces;

/**
 * The interface Collectables.
 *
 * @author David Berkovits ID : 318844685
 */
public interface Collectables {

    /**
     * Add a collectable.
     *
     * @param c the c
     */
    void addCollidable(Collidable c);

    /**
     * Remove collidable.
     *
     * @param c the c
     */
    void removeCollidable(Collidable c);


    /**
     * Add sprite.
     *
     * @param s the s
     */
    void addSprite(Sprite s);

    /**
     * Remove sprite.
     *
     * @param s the s
     */
    void removeSprite(Sprite s);
}
