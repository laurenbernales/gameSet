import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Graphics extends JPanel implements ActionListener {

    private JButton b1, b2, b3;

    public Graphics() {
        b1 = new JButton("Disable middle button");
        b1.setVerticalTextPosition(SwingConstants.CENTER);
        b1.setHorizontalTextPosition(SwingConstants.CENTER);
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("disable");
        b1.addActionListener(this);

        b2 = new JButton("Middle button");
        b2.setVerticalTextPosition(SwingConstants.CENTER);
        b2.setHorizontalTextPosition(SwingConstants.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);
        b2.addActionListener(this);

        b3 = new JButton("Enable middle button");
        b3.setVerticalTextPosition(SwingConstants.CENTER);
        b3.setHorizontalTextPosition(SwingConstants.CENTER);
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("enable");
        b3.addActionListener(this);
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI(){
        JFrame frame = new JFrame("Button Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(b1);
        add(b2);
        add(b3);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("disable".equals(e.getActionCommand())){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(true);
        } else {
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(false);
        }
    }
}
