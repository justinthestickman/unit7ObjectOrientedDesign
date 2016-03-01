import javax.swing.JFrame;
import java.awt.BorderLayout;

public class DrawingEditor extends JFrame
{
    private static final int FW = 1000;
    private static final int FH = 750;
    
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    public DrawingEditor()
    {
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(canvas);
        
        this.add(this.canvas, BorderLayout.CENTER);
        this.add(this.controls, BorderLayout.SOUTH);
        
        this.setTitle("Drawing Editor");
        this.setSize(FW, FH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor scene = new DrawingEditor();
    }
}