import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.*;

public class ControlPanel extends JPanel
{
    private JButton pickColorButton;
    private JPanel currColorDisplay;
    private JButton circleButton;
    private JButton squareButton;
    private DrawingPanel canvas;
    
    public ControlPanel(DrawingPanel canvas)
    {
        this.canvas = canvas;
        
        this.pickColorButton = new JButton("Pick Color");
        this.currColorDisplay = new JPanel();
        this.circleButton = new JButton("Add Circle");
        this.squareButton = new JButton("Add Square");
        
        this.add(pickColorButton);
        this.add(currColorDisplay);
        this.add(circleButton);
        this.add(squareButton);
        
        Color bg = canvas.getColor();
        this.currColorDisplay.setBackground(bg);
        
        PickColorListener pcListener = new PickColorListener();
        this.pickColorButton.addActionListener(pcListener);
        
        AddCircleListener acListener = new AddCircleListener();
        this.circleButton.addActionListener(acListener);
        
        AddSquareListener asListener = new AddSquareListener();
        this.squareButton.addActionListener(asListener);
    }
    
    public class PickColorListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.pickColor();
        }
    }
    
    public class AddCircleListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.addCircle();
        }
    }
    
    public class AddSquareListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.addSquare();
        }
    }
}