import javax.swing.JFrame;
import java.awt.BorderLayout;

public class DrawingEditor extends JFrame
{
    private static int fw;
    private static int fh;
    
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    public DrawingEditor()
    {
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(canvas);
        
        this.fw = (int) canvas.getPreferredSize().getWidth();
        this.fh = (int) canvas.getPreferredSize().getHeight();
        
        this.add(this.canvas, BorderLayout.CENTER);
        this.add(this.controls, BorderLayout.SOUTH);
        
        this.setTitle("Drawing Editor");
        this.setSize(fw, fh);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor scene = new DrawingEditor();
    }
}