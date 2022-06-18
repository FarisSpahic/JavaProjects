package swingassignment;

import java.awt.SystemTray;
import java.lang.reflect.InvocationTargetException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class SwingAssignment {

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        Runnable myGUI = new Runnable() {
            @Override
            public void run() {
                int choice = JOptionPane.showOptionDialog(null, "", "Countdown", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Settings", "Close"}, this);
                switch (choice) {
                    case JOptionPane.NO_OPTION:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
                guiClass f = new guiClass();
                f.setSize(400, 800);
                f.setLocation(200, 200);
                f.setVisible(true);
            }
        };
        SwingUtilities.invokeAndWait(myGUI);

    }

}
