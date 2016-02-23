import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel
{
    private JButton pickColorButton;
    private JPanel currColorDisplay;
    private JButton addCircleButton;
    private JButton addSquareButton;
    
    public ControlPanel(DrawingPanel canvas)
    {
        this.pickColorButton = new JButton("Pick Color");
        this.currColorDisplay = new JPanel();
        this.addCircleButton = new JButton("Add Circle");
        this.addSquareButton = new JButton("Add Square");
        
        ClickListener listener = new ClickListener();
        this.pickColorButton.addActionListener(listener);
        this.addCircleButton.addActionListener(listener);
        this.addSquareButton.addActionListener(listener);
    }
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand().equals("Pick Color"))
            {
                
            }
            else if (event.getActionCommand().equals("Add Circle"))
            {
                
            }
            else if (event.getActionCommand().equals("Add Square"))
            {
                
            }
        }
    }
}