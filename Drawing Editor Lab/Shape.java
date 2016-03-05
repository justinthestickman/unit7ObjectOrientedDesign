import java.awt.geom.Point2D;
import java.awt.*;

/**
 * An abstract class that represents a shape on the canvas
 * 
 * @author Justin Huang
 * @version 4 March 2016
 */
public abstract class Shape
{
    //The center of the shape
    private Point2D.Double center;
    //The radius of the shape
    private double radius;
    //The color of the shape
    private Color color;
    
    /**
     * The constructor for Shape objects
     * 
     * @param - Point2D.Double center - The center of the shape
     *        - double radius - The radius of the shape
     *        - Color color - The color of the shape
     */
    public Shape(Point2D.Double center, double radius, Color color)
    {
        //Initializes the center, radius, and color of the
        //shape to the Point2D.Double, double, and Color passed
        //in as parameters
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    /**
     * Returns the shape's center
     * 
     * @return - Point2D.Double center - The shape's center
     */
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    /**
     * Returns the shape's radius
     * 
     * @return - double radius - The shape's radius
     */
    public double getRadius()
    {
        return this.radius;
    }
    
    /**
     * Returns the shape's color
     * 
     * @return - Color color - The shape's color
     */
    public Color getColor()
    {
        return this.color;
    }
    
    /**
     * Moves the shape by the doubles passed in as parameters,
     * which represent changes in x and y
     */
    public void move(double x, double y)
    {
        //Calculates the new coordinates of the center
        double newX = this.center.getX() + x;
        double newY = this.center.getY() + y;
        
        //Sets the center's location to the new coordinates
        this.center.setLocation(newX, newY);
    }
    
    /**
     * Sets the shape's radius to the double passed in as a parameter
     */
    public void setRadius(double r)
    {
        this.radius = r;
    }
    
    //Abstract methods defined in the Square and Circle classes
    //Returns true if the shape contains the point passed in 
    //as a parameter, or false if it doesn't
    abstract boolean isInside(Point2D.Double point);
    //Draws the shape
    abstract void draw(Graphics2D g2, boolean filled);
}