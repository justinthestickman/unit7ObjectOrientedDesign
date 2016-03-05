import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

/**
 * A subclass of JPanel that contains the shapes added to the drawing panel by the
 * user and allows the user to move their added shapes, using mouse listeners
 * 
 * @author Justin Huang
 * @version 4 March 2016
 */
public class DrawingPanel extends JPanel
{
    //The list of all shapes added to the drawing panel by the user
    private ArrayList<Shape> shapes;
    //The "active shape" -- the shape that the user last interacted with -- added,
    //clicked, or moved
    private Shape activeShape;
    //The current drawing color
    private Color currDrawingColor;
    //The preferred size of the drawing panel
    private Dimension preferredSize = new Dimension(1000, 750);
        
    /**
     * The constructor for the Drawing Editor's drawing panel
     */
    public DrawingPanel()
    {
        //Sets the background color of the drawing panel to
        //white
        this.setBackground(Color.WHITE);
        
        //Sets the current drawing color to blue
        this.currDrawingColor = Color.BLUE;
        
        //Adds a mouse listener and a mouse motion listener
        //to the drawing panel
        this.addMouseListener(new MousePressListener());
        this.addMouseMotionListener(new MouseDragListener());
        
        //Initializes the shapes list to an empty ArrayList
        this.shapes = new ArrayList<Shape>();
        
        //Initializes the active shape to null
        this.activeShape = null;
        
        //Sets the size of the drawing panel to the
        //preferred size
        this.setSize(this.preferredSize);
    }
    
    /**
     * Returns the current drawing color
     * 
     * @return - Color currDrawingColor - The current drawing color
     */
    public Color getColor()
    {
        return this.currDrawingColor;
    }
    
    /**
     * Returns the preferred dimensions of the drawing panel
     * 
     * @return - Dimension - The preferred size of the drawing panel
     */
    public Dimension getPreferredSize()
    {
        return this.preferredSize;
    }
    
    /**
     * Opens a JColorChooser that allows the user to choose a drawing color
     */
    public void pickColor()
    {
        this.currDrawingColor = JColorChooser.showDialog(null, "Choose a Color", Color.BLUE);
    }
    
    /**
     * Creates a circle, adds it, and sets it as the active shape
     */
    public void addCircle()
    {
         //Sets the center of the circle to the center of the
         //drawing panel
         double xCenter = this.getPreferredSize().getWidth() / 2;
         double yCenter = this.getPreferredSize().getHeight() / 2;
         Point2D.Double center = new Point2D.Double(xCenter, yCenter);
         
         //Sets the radius of the circle to a random value
         //between 50 and 100
         Random rand = new Random();
         double radius = rand.nextInt(50) + 50;
         
         //Creates the new circle, adds it to the shapes list,
         //and sets the active shape to it
         Circle newCircle = new Circle(center, radius, this.currDrawingColor);
         this.shapes.add(newCircle);
         this.activeShape = newCircle;
         
         //Repaints the drawing panel
         repaint();
    }
    
    /**
     * Creates a square, adds it, and sets it as the active shape
     */
    public void addSquare()
    {
         //Sets the center of the square to the center of the
         //drawing panel
         double xCenter = this.getPreferredSize().getWidth() / 2;
         double yCenter = this.getPreferredSize().getHeight() / 2;
         Point2D.Double center = new Point2D.Double(xCenter, yCenter);
         
         //Sets the radius of the square to a random value
         //between 50 and 100
         Random rand = new Random();
         double radius = rand.nextInt(100);
         
         //Creates the new square, adds it to the shapes list,
         //and sets the active shape to it
         Square newSquare = new Square(center, radius, this.currDrawingColor);
         this.shapes.add(newSquare);
         this.activeShape = newSquare;
         
         //Repaints the drawing panel
         repaint();
    }
    
    /**
     * Draws / redraws all shapes the user has added to the drawing panel, active shape last
     */
    public void paintComponent(Graphics g)
    {
        //Casts the Graphics object passed in as a parameter to a Graphics g2 object
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        //Loops through the shapes list from beginning to end, which is the same as looping 
        //through all of the shapes added by the user to the drawing panel from bottom to top
        for (Shape shape : this.shapes)
        {
            if (shape.equals(this.activeShape) == false)
            {
                //If the shape is not the active shape, draw it
                shape.draw(g2, true);
            }
        }
        
        if (this.activeShape != null)
        {
            //If there is an active shape, draw it last
            this.activeShape.draw(g2, false);
        }
    }
    
    /**
     * A listener that implements the MouseListener interface
     * 
     * Sets the active shape to the topmost shape that was pressed if a
     * shape was pressed, or to null if the background was pressed
     * 
     * @author Justin Huang
     * @version 4 March 2016
     */
    public class MousePressListener implements MouseListener
    {
        /**
         * The method that is executed whenever the mouse is pressed
         */
        public void mousePressed(MouseEvent event)
        {
            //First, sets the active shape to null
            activeShape = null;
            //Creates a point using the coordinates of the location
            //where the mouse was pressed
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
            
            //Loops through the shapes list from beginning to end, which
            //is the same as looping through all of the shapes added by
            //the user to the drawing panel from bottom to top
            for (Shape shape : shapes)
            {
                if (shape.isInside(point))
                {
                    //If the point is inside the current shape, set
                    //the active shape to the current shape
                    activeShape = shape;
                }
            }
            
            //Repaints the drawing panel
            repaint();
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
    
    /**
     * A listener that implements the MouseMotionListener interface
     * 
     * Moves the shape that was dragged if a shape was dragged,
     * or does nothing if the background was dragged
     * 
     * @author Justin Huang
     * @version 4 March 2016
     */
    public class MouseDragListener implements MouseMotionListener
    {
        /**
         * The method that is executed whenever the mouse is pressed and dragged
         */
        public void mouseDragged(MouseEvent event)
        {
            if (activeShape != null)
            {
                 //If there is an active shape, that means the user pressed and
                 //dragged a shape, so move the shape where the user dragged it
                 
                 //Initializes a point to the center of the active shape
                 Point2D.Double center = activeShape.getCenter();
                 
                 //Calculates the changes in x and y
                 double dx = event.getX() - center.getX();
                 double dy = event.getY() - center.getY();
                 
                 //Moves the shape by the calculated changes in x and y
                 activeShape.move(dx, dy);
            }
            
            //Repaints the drawing panel
            repaint();
        }
        
        //Unused method
        public void mouseMoved(MouseEvent event)
        {
            
        }
    }
}