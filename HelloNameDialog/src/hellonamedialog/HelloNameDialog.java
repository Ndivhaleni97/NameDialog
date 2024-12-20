package hellonamedialog;

/**
 *
 * @author Oscar
 */
import javax.swing.JOptionPane;

public class HelloNameDialog {

    public static void main(String[] args) {

        String result;
        result = JOptionPane.showInputDialog(null, "Enter your name");
        JOptionPane.showMessageDialog(null,"Hello, " + result+ "!" );
    
    }
}
