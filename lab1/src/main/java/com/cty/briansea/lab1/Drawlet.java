package com.cty.briansea.lab1;

import javafx.scene.layout.Region;

/**
 * The base of all Drawable elements
 * @author Brian Sea
 * @version 0.0.1
 * @since PSet 2
 */
public abstract class Drawlet extends Region implements Tool {
    private boolean isSelected;

    /**
     * Change the selection of this object
     * @param selectItem whether to select this object
     * @return true is selection is allowed, false otherwise
     */
    public boolean select(boolean selectItem){
        isSelected = selectItem;
        return selectItem;
    }

    /**
     * Detects if the object thinks it's selected
     * @return true if selected, false otherwise
     */
    public boolean isSelected(){
        return this.isSelected;
    }

    /**
     * Creates an instance specific interactable element so a user can
     * modify an already created Drawlet
     *
     * @return a new graphical element so that user can modify the Drawlet or null if there are no options
     */
    @Override
    public abstract Region getPalette();

    /**
     * Requests that the render happen immediately
     */
    public abstract void render();
}