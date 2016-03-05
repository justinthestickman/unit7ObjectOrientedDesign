import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * A subclass of JFrame that contains the main method for the program
 * and contains the control panel and the drawing panel
 * 
 * @author Justin Huang
 * @version 4 March 2016
 */
public class DrawingEditor extends JFrame
{
    //The width and height of the frame
    private static int fw;
    private static int fh;
    
    //The drawing panel to which shapes will be added and the control
    //panel with which shapes will be added
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    /**
     * The constructor for the Drawing Editor frame
     */
    public DrawingEditor()
    {
        //Initializes the canvas and the controls
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(canvas);
        
        //Initializes the dimensions of the frame, using the
        //preferred width and height set by the canvas
        this.fw = (int) canvas.getPreferredSize().getWidth();
        this.fh = (int) canvas.getPreferredSize().getHeight();
        
        //Adds the canvas and controls to the
        //appropriate regions of the frame
        this.add(this.canvas, BorderLayout.CENTER);
        this.add(this.controls, BorderLayout.SOUTH);
        
        //Sets the title, size, default close
        //operation, and visibility
        this.setTitle("Drawing Editor");
        this.setSize(fw, fh);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    /**
     * The main method for the program
     */
    public static void main(String[] args)
    {
        //Creates the frame that contains
        //the canvas and the controls
        DrawingEditor scene = new DrawingEditor();
    }
}