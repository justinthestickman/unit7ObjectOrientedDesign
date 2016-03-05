import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

/**
 * A subclass of JPanel that contains the buttons that allow the user
 * to pick the drawing color and add shapes, using action listeners
 * 
 * @author Justin Huang
 * @version 4 March 2016
 */
public class ControlPanel extends JPanel
{
    //The drawing panel which the control panel controls
    private DrawingPanel canvas;
    //The button that allows the user to pick the drawing color
    private JButton pickColorButton;
    //The small panel that displays the current drawing color
    private JPanel currColorDisplay;
    //The button that allows the user to add circles and squares to
    //the canvas
    private JButton addCircleButton;
    private JButton addSquareButton;
    
    /**
     * The constructor for the Drawing Editor's control panel
     * 
     * @param - DrawingPanel canvas - The canvas which the control panel controls
     */
    public ControlPanel(DrawingPanel canvas)
    {
        //Initializes the canvas to the DrawingPanel passed in as a parameter
        this.canvas = canvas;
        
        //Initializes the pick color button, with a label
        this.pickColorButton = new JButton("Pick Color");
        //Initializes the current color display panel
        this.currColorDisplay = new JPanel();
        //Initializes the add shape buttons, with labels
        this.addCircleButton = new JButton("Add Circle");
        this.addSquareButton = new JButton("Add Square");
        
        //Adds the initialized components to the control panel
        this.add(pickColorButton);
        this.add(currColorDisplay);
        this.add(addCircleButton);
        this.add(addSquareButton);
        
        //Sets the background color of the current color display panel to the
        //current drawing color
        this.currColorDisplay.setBackground(this.canvas.getColor());
        
        //Adds action listeners to the buttons
        this.pickColorButton.addActionListener(new ButtonListener());
        this.addCircleButton.addActionListener(new ButtonListener());
        this.addSquareButton.addActionListener(new ButtonListener());
    }
    
    /**
     * A listener that implements the ActionListener interface
     * 
     * Executes a different task depending on which button was clicked
     * 
     * @author Justin Huang
     * @version 4 March 2016
     */
    public class ButtonListener implements ActionListener
    {
        /**
         * The method that is executed whenever a button is clicked
         */
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource().equals(pickColorButton))
            {
                //If the "Pick Color" button was clicked, allow the 
                //user to pick a drawing color
                canvas.pickColor();
                currColorDisplay.setBackground(canvas.getColor());
            }
            else if (event.getSource().equals(addCircleButton))
            {
                //If the "Add Circle" button was clicked, add a 
                //circle to the canvas
                canvas.addCircle();
            }
            else if (event.getSource().equals(addSquareButton))
            {
                //If the "Add Square" button was clicked, add a 
                //square to the canvas
                canvas.addSquare();
            }
        }
    }
}