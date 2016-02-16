import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class TriangleComponent extends JComponent
{
    private static final int x = 100;
    private static final int y = 100;
    
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;
    private Line2D line1;
    
    public TriangleComponent()
    {
        
    }
}