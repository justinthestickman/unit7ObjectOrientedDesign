import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

public class Square extends Shape
{
    private Point2D.Double center;
    private double radius;
    private Color color;
    
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public void move(double x, double y)
    {

    }
    
    public void setRadius(double r)
    {
        this.radius = r;
    }
    
    public boolean isInside(Point2D.Double point)
    {
        return false;
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        return false;
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        
    }
}