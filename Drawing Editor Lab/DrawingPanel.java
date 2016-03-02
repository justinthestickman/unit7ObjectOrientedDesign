import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.util.Random;

public class DrawingPanel extends JPanel
{
    private ArrayList<Shape> shapes;
    private Shape activeShape;
    private Color currDrawingColor;
        
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        
        MousePressListener pressListener = new MousePressListener();
        this.addMouseListener(pressListener);
        
        MouseMovementListener moveListener = new MouseMovementListener();
        this.addMouseMotionListener(moveListener);
        
        this.shapes = new ArrayList<Shape>();
        
        this.currDrawingColor = Color.BLUE;
    }
    
    public Color getColor()
    {
        return this.currDrawingColor;
    }
    
    public Dimension getPreferredSize()
    {
        Dimension dimension = new Dimension(1000, 750);
        return dimension;
    }
    
    public void pickColor()
    {
        JColorChooser colorChooser = new JColorChooser(Color.BLUE);
        
    }
    
    public void addCircle()
    {
         double x = this.getPreferredSize().getWidth() / 2;
         double y = this.getPreferredSize().getHeight() / 2;
         Point2D.Double center = new Point2D.Double(x, y);
         Random random = new Random();
         int radius = random.nextInt();
         Circle newCircle = new Circle(center, radius, this.currDrawingColor);
         this.shapes.add(newCircle);
    }
    
    public void addSquare()
    {
         double x = this.getPreferredSize().getWidth() / 2;
         double y = this.getPreferredSize().getHeight() / 2;
         Point2D.Double center = new Point2D.Double(x, y);
         Random random = new Random();
         int radius = random.nextInt();
         Square newSquare = new Square(center, radius, this.currDrawingColor);
         this.shapes.add(newSquare);
    }
    
    public void paintComponent(Graphics g)
    {
        
    }
    
    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
            activeShape = null;
            for (Shape shape : shapes)
            {
                if (shape.isInside(point))
                {
                    activeShape = shape;
                }
            }
        }
        
        //Unused methods
        public void mouseClicked(MouseEvent event)
        {
            
        }
        public void mouseReleased(MouseEvent event)
        {
            
        }
        public void mouseEntered(MouseEvent event)
        {
            
        }
        public void mouseExited(MouseEvent event)
        {
            
        }
    }
    
    public class MouseMovementListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
            activeShape = null;
            for (Shape shape : shapes)
            {
                if (shape.isInside(point))
                {
                    activeShape = shape;
                }
            }
            if (activeShape != null)
            {
                Point2D.Double center = activeShape.getCenter();
                double x = center.getX();
                double y = center.getY();
                activeShape.move(x, y);
            }
        }
        
        //Unused methods
        public void mouseMoved(MouseEvent event)
        {
            
        }
    }
}