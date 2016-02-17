import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class TriangleComponent extends JComponent
{
    private Point2D.Double point1;
    private Point2D.Double point2;
    private Point2D.Double point3;
    private Line2D.Double line1;
    private Line2D.Double line2;
    private Line2D.Double line3;
    
    public TriangleComponent()
    {
        this.point1 = null;
        this.point2 = null;
        this.point3 = null;
        this.line1 = null;
        this.line2 = null;
        this.line3 = null;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //g2.draw(this.point1);
        //g2.draw(this.point2);
        //g2.draw(this.point3);
        g2.draw(this.line1);
        g2.draw(this.line2);
        g2.draw(this.line3);
    }
    
    public void drawNext(int x, int y)
    {
        if (this.point1 == null)
        {
            this.point1 = new Point2D.Double(x,y);
        }
        else if (this.point2 == null)
        {
            double x1 = this.point1.getX();
            double y1 = this.point1.getY();
            this.point2 = new Point2D.Double(x,y);
            this.line1 = new Line2D.Double(x1,y1,x,y);
        }
        else if (this.point3 == null)
        {
            double x1 = this.point1.getX();
            double y1 = this.point1.getY();
            double x2 = this.point2.getX();
            double y2 = this.point2.getY();
            this.point3 = new Point2D.Double(x,y);
            this.line2 = new Line2D.Double(x2,y2,x,y);
            this.line3 = new Line2D.Double(x,y,x1,y1);
        }
        else
        {
            this.point1 = null;
            this.point2 = null;
            this.point3 = null;
            this.line1 = null;
            this.line2 = null;
            this.line3 = null;
        }
        this.repaint();
    }
}