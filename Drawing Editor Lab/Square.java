import java.awt.geom.*;
import java.awt.*;

/**
 * A subclass of Shape that represents a square on the canvas
 * 
 * @author Justin Huang
 * @version 4 March 2016
 */
public class Square extends Shape
{
    /**
     * The constructor for Square objects
     * 
     * @param - Point2D.Double center - The center of the square
     *        - double radius - The "radius" of the square, or half its side length
     *        - Color color - The color of the square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    
    /**
     * Returns true if the square contains the point passed
     * in as a parameter, or false if it doesn't
     * 
     * @return - boolean - True if the square contains the point, false if not
     */
    public boolean isInside(Point2D.Double point)
    {
        //The coordinates of the point passed in as a parameter
        double x = point.getX();
        double y = point.getY();
        //The coordinates of the center of the square
        double xCenter = this.getCenter().getX();
        double yCenter = this.getCenter().getY();
        //The "radius" of the square, or half its length
        double radius = this.getRadius();
        //Uses the square's sides to determine whether or not the point is inside the square
        return ((x > xCenter - radius) && (x < xCenter + radius) && 
                (y > yCenter - radius) && (y < yCenter + radius));
    }
    
    /**
     * Draws the square
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        //Calculates the coordinates of the top left corner of the square
        double xTopLeft = this.getCenter().getX() - this.getRadius();
        double yTopLeft = this.getCenter().getY() - this.getRadius();
        
        //Calculates the "diameter" of the square, or its length
        double diameter = this.getRadius() * 2;
        
        //Initializes the square to a new rectangle
        Rectangle2D.Double square = new Rectangle2D.Double(xTopLeft, yTopLeft, diameter, diameter);
        
        //Sets the color
        g2.setColor(this.getColor());
        if (filled)
        {
            //If the square should be filled, fill it
            g2.fill(square);
        }
        
        //Draws the square
        g2.draw(square);
    }
}