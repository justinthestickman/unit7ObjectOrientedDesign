import java.awt.geom.*;
import java.awt.*;
import java.lang.Math;

/**
 * A subclass of Shape that represents a circle on the canvas
 * 
 * @author Justin Huang
 * @version 4 March 2016
 */
public class Circle extends Shape
{
    /**
     * The constructor for Circle objects
     * 
     * @param - Point2D.Double center - The center of the circle
     *        - double radius - The radius of the circle
     *        - Color color - The color of the circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    
    /**
     * Returns true if the circle contains the point passed
     * in as a parameter, or false if it doesn't
     * 
     * @return - boolean - True if the circle contains the point, false if not
     */
    public boolean isInside(Point2D.Double point)
    {
        //The coordinates of the point passed in as a parameter
        double x = point.getX();
        double y = point.getY();
        //The coordinates of the center of the circle
        double xCenter = this.getCenter().getX();
        double yCenter = this.getCenter().getY();
        //The radius of the circle
        double radius = this.getRadius();
        //Uses the equation of a circle to determine whether or not the point is inside the circle
        return (Math.pow((x - xCenter), 2) + Math.pow((y - yCenter), 2)) < (Math.pow(radius, 2));
    }
    
    /**
     * Draws the circle
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        //Calculates the coordinates of the top left corner
        //of the rectangular frame that contains the circle
        double xTopLeft = this.getCenter().getX() - this.getRadius();
        double yTopLeft = this.getCenter().getY() - this.getRadius();
        
        //Calculates the diameter of the circle
        double diameter = this.getRadius() * 2;
        
        //Initializes the circle to a new ellipse
        Ellipse2D.Double circle = new Ellipse2D.Double(xTopLeft, yTopLeft, diameter, diameter);
        
        //Sets the color
        g2.setColor(this.getColor());
        
        if (filled)
        {
            //If the circle should be filled, fill it
            g2.fill(circle);
        }
        
        //Draws the circle
        g2.draw(circle);
    }
}