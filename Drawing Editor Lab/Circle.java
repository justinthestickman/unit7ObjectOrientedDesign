import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape
{
    private Ellipse2D.Double circle;
    private Point2D.Double center;
    private double radius;
    private Color color;
    
    public Circle(Point2D.Double center, double radius, Color color)
    {
        this.circle = new Ellipse2D.Double(center.getX(), center.getY(), radius*2, radius*2);
        this.center = center;
        this.radius = radius;
        this.color = Color.BLUE;
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
    
    //public boolean isOnBorder(Point2D.Double point)
    //{
    //    return false;
    //}
    
    public void draw(Graphics2D g2, boolean filled)
    {
        
    }
}