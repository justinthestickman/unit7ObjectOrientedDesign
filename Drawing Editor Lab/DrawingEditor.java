import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingEditor extends JFrame
{
    private static final int FRAME_WIDTH = 250;
    private static final int FRAME_HEIGHT = 75;
    
    private JPanel panel;
    
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    public DrawingEditor()
    {
        this.panel = new JPanel();
        
        this.canvas = new DrawingPanel();
        this.panel.add(canvas);
        
        this.controls = new ControlPanel(canvas);
        this.panel.add(controls);
        
        this.add(this.panel);
        
        this.setTitle("Drawing Editor");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor drawingEditor = new DrawingEditor();
    }
}