import java.awt.*;
import java.util.*;

public class Starfish extends Critter{
    /**
     * Default constructor - creates critter with name patrick
     */
    public Starfish() {
        super("Patrick");
    }

    /**
     * Returns the color of the Starfish
     * 
     * @return pink
     */
    @Override 
    public Color getColor() {
        return Color.PINK;
    }

    /**
     * Implements the buff behavior of the Starfish. Will turn its 
     * name into an empty string while buffed. 
     */
    @Override
    public void buffBehavior(){
    	// A very humble animal, making the manager thinks there's no
    	// starfish at all!!!
    	this.displayName = "";
    }

    /**
     * Implements the debuff behavior of the Starfish. Will revert 
     * its name back to Patrick.
     */
    @Override
    public void debuff(){
    	this.displayName = "Patrick";
    }

    //Student TODO
    //Starfish is able to teleport to another place
    //To do that, reset the position in currentLocation and remove
    //previous location from the arena
    public void teleport(Point currentLocation, Critter[][] arena){
      //TODO
    }
}
