package calculator;

/**
 *
 * @author Samyu
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class OrdinaryCalculator extends Calculator{ //Singleton
    private static OrdinaryCalculator Singleton = new OrdinaryCalculator();
    public OrdinaryCalculator() {
        super();
        mainFrame = new JFrame(Type.ORDINARY.toString());
    }
    public static OrdinaryCalculator  getInstance() {
        return Singleton;
        
    }


   




}
