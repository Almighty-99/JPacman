package nl.tudelft.jpacman.sprite;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import nl.tudelft.jpacman.PacmanConfigurationException;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.npc.ghost.GhostColor;
import nl.tudelft.jpacman.ui.Theme;



/**
 * Sprite Store containing the classic Pac-Man sprites.
 *
 * @author Jeroen Roosen 
 */
public class PacManSprites extends SpriteStore {

    Theme themeSelector;

    /**
     * The sprite files are vertically stacked series for each direction, this
     * array denotes the order.
     */
    private static final Direction[] DIRECTIONS = {
        Direction.NORTH,
        Direction.EAST,
        Direction.SOUTH,
        Direction.WEST
    };

    /**
     * The image size in pixels.
     */
    private static final int SPRITE_SIZE = 16;

    /**
     * The amount of frames in the pacman animation.
     */
    private static final int PACMAN_ANIMATION_FRAMES = 4;

    /**
     * The amount of frames in the pacman dying animation.
     */
    private static final int PACMAN_DEATH_FRAMES = 11;

    /**
     * The amount of frames in the ghost animation.
     */
    private static final int GHOST_ANIMATION_FRAMES = 2;

    /**
     * The delay between frames.
     */
    private static final int ANIMATION_DELAY = 200;

    /**
     * @return A map of animated Pac-Man sprites for all directions.
     */
    public Map<Direction, Sprite> getPacmanSprites() {
        if (themeSelector.getTheme_() == 1) {
            return directionSprite("/sprite/pacman.png", PACMAN_ANIMATION_FRAMES);
        }
        if (themeSelector.getTheme_() == 2) {
            return directionSprite("/sprite/Theme_Sea/monkey_sea.png", PACMAN_ANIMATION_FRAMES);
        }
        if (themeSelector.getTheme_() == 3) {
            return directionSprite("/sprite/Theme_Dinosaur/pacman_dinosaur.png", PACMAN_ANIMATION_FRAMES);
        }
        if (themeSelector.getTheme_() == 4) {
            return directionSprite("/sprite/Theme_Space/pacman_space.png", PACMAN_ANIMATION_FRAMES);
        }
        else  {
            return directionSprite("/sprite/Theme_CatDog/pacman_catdog.png", PACMAN_ANIMATION_FRAMES);
        }

    }

    /**
     * @return The animation of a dying Pac-Man.
     */
    public AnimatedSprite getPacManDeathAnimation() {


        String resource = "/sprite/dead.png";

        Sprite baseImage = loadSprite(resource);
        AnimatedSprite animation = createAnimatedSprite(baseImage, PACMAN_DEATH_FRAMES,
            ANIMATION_DELAY, false);
        animation.setAnimating(false);

        return animation;
    }

    /**
     * Returns a new map with animations for all directions.
     *
     * @param resource
     *            The resource name of the sprite.
     * @param frames
     *            The number of frames in this sprite.
     * @return The animated sprite facing the given direction.
     */
    private Map<Direction, Sprite> directionSprite(String resource, int frames) {
        Map<Direction, Sprite> sprite = new HashMap<>();

        Sprite baseImage = loadSprite(resource);
        for (int i = 0; i < DIRECTIONS.length; i++) {
            Sprite directionSprite = baseImage.split(0, i * SPRITE_SIZE, frames
                * SPRITE_SIZE, SPRITE_SIZE);
            AnimatedSprite animation = createAnimatedSprite(directionSprite,
                frames, ANIMATION_DELAY, true);
            animation.setAnimating(true);
            sprite.put(DIRECTIONS[i], animation);
        }

        return sprite;
    }

    /**
     * Returns a map of animated ghost sprites for all directions.
     *
     * @param color
     *            The colour of the ghost.
     * @return The Sprite for the ghost.
     */
    public Map<Direction, Sprite> getGhostSprite(GhostColor color) {
        assert color != null;
        if(themeSelector.getTheme_() == 1) {
            String resource = "/sprite/ghost_" + color.name().toLowerCase()
                + ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }
        if(themeSelector.getTheme_() == 2) {
            String resource = "/sprite/Theme_Sea/ghost_" + color.name().toLowerCase()
                +"_sea"+ ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }
        if(themeSelector.getTheme_() == 3) {
            String resource = "/sprite/Theme_Dinosaur/ghost_" + color.name().toLowerCase()
                +"_dinosaur"+ ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }
        if(themeSelector.getTheme_() == 4) {
            String resource = "/sprite/Theme_Space/ghost_" + color.name().toLowerCase()
                +"_space"+ ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }else{
            String resource = "/sprite/Theme_CatDog/ghost_" + color.name().toLowerCase()
                +"_catdog"+ ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }
    }

    /**
     * @return The sprite for the wall.
     */
    public Sprite getWallSprite() {
        if (themeSelector.getTheme_() == 1){
            return loadSprite("/sprite/wall.png");
        }
        if (themeSelector.getTheme_() == 2){
            return loadSprite("/sprite/Theme_Sea/wall_sea.png");
        }
        if (themeSelector.getTheme_() == 3){
            return loadSprite("/sprite/Theme_Dinosaur/wall_dinosour.png");
        }
        if (themeSelector.getTheme_() == 4){
            return loadSprite("/sprite/Theme_Space/wall_space.png");
        }
        else
        return loadSprite("/sprite/Theme_CatDog/wall_catdog.png");
    }

    /**
     * @return The sprite for the ground.
     */
    public Sprite getGroundSprite() {
        if (themeSelector.getTheme_() == 1){
            return loadSprite("/sprite/floor.png");
        }
        if (themeSelector.getTheme_() == 2){
            return loadSprite("/sprite/Theme_Sea/floor_sea.png");
        }
        if (themeSelector.getTheme_() == 3){
            return loadSprite("/sprite/Theme_Dinosaur/floor_dinosour.png");
        }
        if (themeSelector.getTheme_() == 4){
            return loadSprite("/sprite/Theme_Space/floor_space.png");
        }
        else
        return loadSprite("/sprite/Theme_CatDog/floor_catdog.png");
    }

    /**
     * @return The sprite for the
     */
    public Sprite getPelletSprite() {
        if (themeSelector.getTheme_() == 1){
            return loadSprite("/sprite/pellet.png");
        }
        if (themeSelector.getTheme_() == 2){
            return loadSprite("/sprite/Theme_Sea/pellet_sea.png");
        }
        if (themeSelector.getTheme_() == 3){
            return loadSprite("/sprite/Theme_Dinosaur/pellet_dinosour.png");
        }
        if (themeSelector.getTheme_() == 4){
            return loadSprite("/sprite/Theme_Space/pellet_space.png");
        }
        else
        return loadSprite("/sprite/Theme_CatDog/pellet_catdog.png");
    }

    /**
     * Overloads the default sprite loading, ignoring the exception. This class
     * assumes all sprites are provided, hence the exception will be thrown as a
     * {@link RuntimeException}.
     *
     * {@inheritDoc}
     */
    @Override
    public Sprite loadSprite(String resource) {
        try {
            return super.loadSprite(resource);
        } catch (IOException e) {
            throw new PacmanConfigurationException("Unable to load sprite: " + resource, e);
        }
    }
}
