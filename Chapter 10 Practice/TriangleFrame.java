// import java.awt.event.MouseListener;
// import java.awt.event.MouseEvent;
// import javax.swing.JFrame;
// import java.awt.Graphics;
// import java.awt.Graphics2D;
// import java.awt.Rectangle;
// import javax.swing.JComponent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 750;
    
    
    
    public TriangleFrame()
    {
        
        
        MouseListener listener = new MousePressListener();
        
        
    }
    

    
    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            
        }
        
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
}