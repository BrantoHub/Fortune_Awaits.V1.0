//Packages and Imports
//====================================
package GUI;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
//====================================



//Class that will instruct the player what kind of game this is along with some
//basic instructions
public class Starting_Screen extends JFrame
{
    //Attributes for class
    //================================
    private JLabel title; //This will just be the main title of the game
    private JButton btn_next; //This will be the button to progress to the next GUI
    //================================

    //Constructor
    //================================
    public Starting_Screen()
    {
        set_IntialGUI();
        center_Window();
        //set_Next();
        set_Game_Information();
        this.setSize(500,600); //Setting the default window size
        this.setVisible(true); //Setting the actual GUI to true
    }
    //================================

    //Methods
    //================================
    public void center_Window() //This function is setting the screen to the middle of the GUI
    {
        Dimension object_Dimension = getToolkit().getDefaultToolkit().getScreenSize();
        int cord_x = (object_Dimension.width - this.getWidth()) / 3;
        int cord_y = (object_Dimension.height - this.getHeight()) / 8;
    }

    private void set_Game_Information() //Sets the information to the middle of the screen
    {
        //Creating a new JPanel to be used for the text
        JPanel Center_Panel = new JPanel();
        //Going to be using a mixture of c++ and html in order to format text a little more neatly
        String info_for_Game = "<html><p><Welcome to the Kingdom of Avalon!></p>"+
                "<p>In this game you will start as a simple husk of a human on the brink of death.</p>"+
                "<p>While your starting stats are low and conflict is a major threat, through intelligent choices and leveling you can pick a class to focus on" +
                " or simply create a custom character with stats unique to yourself. Not choosing a class though is much harder since the allotted stat boots will not be present.</p>" +
                "<ul><li> You start with nothing, besides a single starting item</li>"+
                "<li>The stats that are available in the game are Vitality (Health & Resistance), Strength, Dexterity, Intelligence, Faith, and Luck</li>" +
                "<li>Each level you gain allots a certain amount of points to increase your stats. This can allow new weapons or skills to be used</li>" +
                "<li>The main game consists of you fighting monsters, bartering with merchants, and gaining experience to become a better hero</li></ul></html>";
        //Adding the information string to the previously created JLabel
        JLabel label_Info = new JLabel(info_for_Game);
        //Setting the text color (Can be changed to whatever works with the background)
        label_Info.setForeground(Color.white);
        //Setting the Panel's Layout as a box layout so it can be lined up on the axis
        Center_Panel.setLayout(new BoxLayout(Center_Panel,BoxLayout.Y_AXIS));
        //Setting the background color of the panel
        Center_Panel.setBackground(Color.BLACK);
        //Setting the padding for the panel
        Center_Panel.setBorder(new EmptyBorder(10,10,10,10));
        //Adding the actual label to the center panel
        Center_Panel.add(label_Info);
        //Adding the center panel to the Center of the Frame
        this.add(Center_Panel, BorderLayout.CENTER);
    }

    public void set_IntialGUI()
    {
        //Setting the actual logo image on the GUI
        ImageIcon icon = new ImageIcon("Pics/Await_Opener.jpg");
        Image image = icon.getImage(); //Transforming the image
        Image new_Image = image.getScaledInstance(500,300, Image.SCALE_SMOOTH);
        icon = new ImageIcon(new_Image);
       JLabel Title_Image = new JLabel(icon);
        this.setResizable(false);
        this.setTitle("Fortune Awaits");
        this.getContentPane().setBackground(new Color(61,65,71));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(Title_Image, BorderLayout.NORTH);
    }
    //================================
}
