import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class DrawingPanel extends JPanel
{
    private ArrayList<Shape> shapes;
    private Shape activeShape;
    private boolean picked;
    private boolean moved;
    private boolean stretched;
        
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        
        this.shapes = new ArrayList<Shape>();
    }
    
    public Color getColor()
    {
        return Color.WHITE;
    }
    
    public Dimension getPreferredSize()
    {
        Dimension asdf = new Dimension();
        return asdf;
    }
    
    public void pickColor()
    {
        
    }
    
    public void addCircle()
    {
        
    }
    
    public void addSquare()
    {
        
    }
    
    public void paintComponent(Graphics g)
    {
        
    }
    
    public class MousePressListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            
        }
        public void mousePressed(MouseEvent event)
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
    
    public class MouseMoveListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            
        }
        public void mouseMoved(MouseEvent event)
        {
            
        }
    }
}