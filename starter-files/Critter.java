/**
 * Critter.java
 * Charles Tianchen Yu, Emma Logomasini, Junshen (Kevin) Chen, 
 * Harsh Lal, Marty Stepp, Stuart Reges
 * 2019 April 25
 * Contains enums and class that defines a Critter object
 * 
 * DO NOT MODIFY THIS FILE
 */
import java.awt.*;

/**
 * enum Direction
 * defines the directions a Critter can Move
 */
enum Direction {
    NORTH, 
    SOUTH, 
    EAST, 
    WEST, 
    CENTER
};

/**
 * enum Attack
 * defines all possible attacks for a Critter
 */
enum Attack {
    POUNCE,
    ROAR,
    SCRATCH,	
    FORFEIT,
    ESCAPE
};


//If you have questions about why this is a abstract class, feel 
//free to ask a tutor about it; however, for the purpose of this 
//assignment, it shouldn't matter that this class is abstract. 
public abstract class Critter{

    protected int level = 0; 
    String displayName = null;

    public Critter(String name)
    {
        this.displayName = name;
    }

    public int getLevel()
    {
        return this.level;
    }

    // This function updates the level of the object
    protected void incrementLevel(int num)
    {
        level = level + num;
    }

    @Override
    public final String toString()
    {
        return this.displayName;
    }

    // These methods are provided to inform you about the result of fights,
    // sleeping, etc.
    // You can override these methods in your Critter to be informed of these 
    // events.

    public Direction getMove()
    {
        return Direction.CENTER;
    }

    public boolean eat()
    {
        return false;
    }

    public Attack getAttack(String opponent)
    {
        return Attack.FORFEIT;
    }

    // called when you win a fight against another animal
    public void win() {}

    // called when you lose a fight against another animal, and die
    public void lose() {}

    // called when your animal is put to sleep for eating too much food
    public void sleep() {}

    // called when your animal wakes up from sleeping
    public void wakeup() {}

    // called when the game world is reset
    public void reset() {}

    // called when your critter mates with another critter
    public void mate() {}

    // called when your critter is done mating with another critter
    public void mateEnd() {}

    public Color getColor()
    {
        return Color.BLACK;
    }

    public void buffBehavior(){}

    public void debuff(){}

    //========================================================================//

    // I use these fields to implement the methods below such as getX and
    // getNeighbor.
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean alive = true;
    private boolean awake = true;
    private final String[] neighbors = { " ", " ", " ", " ", " " };

    // The following methods are provided to get information about the critter.
    // Technically the critter could call setXxxx() on itself,
    // but the game model ignores this anyway, so it's useless to do so.
    // These methods are declared 'final' so you can't override them.

    // Returns the height of the game simulation world.
    protected final int getHeight()
    {
        return height;
    }

    // Returns the animal that is 1 square in the given direction away
    // from this animal. A blank space, " ", signifies an empty square.
    // A dot "." signifies food
    protected final String getNeighbor(Direction direction)
    {
        return neighbors[direction.ordinal()];
    }

    // Returns the width of the game simulation world.
    protected final int getWidth()
    {
        return width;
    }

    // Returns this animal's current x-coordinate.
    protected final int getX()
    {
        return x;
    }

    // Returns this animal's current y-coordinate.
    protected final int getY()
    {
        return y;
    }

    // Returns true if this animal is currently alive.
    // This will return false if this animal has lost a fight and died.
    protected final boolean isAlive()
    {
        return alive;
    }

    // Returns true if this animal is currently awake.
    // This will temporarily return false if this animal has eaten too much 
    // food and fallen asleep.
    protected final boolean isAwake()
    {
        return awake;
    }

    // Sets whether or not this animal is currently alive.
    // This method is called by the simulator and not by your animal itself.
    protected final void setAlive(boolean alive)
    {
        this.alive = alive;
    }

    // Sets whether or not this animal is currently awake.
    // This method is called by the simulator and not by your animal itself.
    protected final void setAwake(boolean awake)
    {
        this.awake = awake;
    }

    // Sets the height of the game simulation world to be the given value,
    // so that future calls to getHeight will return this value.
    // This method is called by the simulator and not by your animal itself.
    protected final void setHeight(int height)
    {
        this.height = height;
    }

    // Sets the neighbor of this animal in the given direction to be the given
    // value,
    // so that future calls to getNeighbor in that direction will return this 
    // value.
    // This method is called by the simulator and not by your animal itself.
    protected final void setNeighbor(Direction direction, String value)
    {
        neighbors[direction.ordinal()] = value;
    }

    // Sets the width of the game simulation world to be the given value.
    // so that future calls to getWidth will return this value.
    // This method is called by the simulator and not by your animal itself.
    protected final void setWidth(int width)
    {
        this.width = width;
    }

    // Sets this animal's memory of its x-coordinate to be the given value.
    // so that future calls to getX will return this value.
    // This method is called by the simulator and not by your animal itself.
    protected final void setX(int x)
    {
        this.x = x;
    }

    // Sets this animal's memory of its y-coordinate to be the given value.
    // so that future calls to getY will return this value.
    // This method is called by the simulator and not by your animal itself.
    protected final void setY(int y)
    {
        this.y = y;
    }

}




