import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graphics {

    private JButton b1, b2, b3;

    public Graphics() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Button Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CheckPane buttonPane = new CheckPane();
        buttonPane.setOpaque(true);
        frame.setContentPane(buttonPane);

        frame.pack();
        frame.setVisible(true);
    }

    public class ButtonPane extends JPanel implements ActionListener {
        public ButtonPane() {
            b1 = new JButton("Disable middle button");
            b1.setVerticalTextPosition(SwingConstants.CENTER);
            b1.setHorizontalTextPosition(SwingConstants.LEADING);
            b1.setMnemonic(KeyEvent.VK_D);
            b1.setActionCommand("disable");
            b1.addActionListener(this);

            b2 = new JButton("Middle button");
            b2.setVerticalTextPosition(SwingConstants.CENTER);
            b2.setHorizontalTextPosition(SwingConstants.CENTER);
            b2.setMnemonic(KeyEvent.VK_M);
            b2.addActionListener(this);

            b3 = new JButton("Enable middle button");
            b3.setMnemonic(KeyEvent.VK_E);
            b3.setActionCommand("enable");
            b3.addActionListener(this);

            add(b1);
            add(b2);
            add(b3);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("disable".equals(e.getActionCommand())) {
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

    public class CheckPane extends JPanel implements ItemListener {

        JCheckBox chinButton;
        JCheckBox glassesButton;
        JCheckBox hairButton;
        JCheckBox teethButton;

        StringBuffer choices;

        public CheckPane() {
//            super(new BorderLayout());

            chinButton = new JCheckBox("Chin");
            chinButton.setMnemonic(KeyEvent.VK_C);
            chinButton.setSelected(true);

            glassesButton = new JCheckBox("Glasses");
            glassesButton.setMnemonic(KeyEvent.VK_G);
            glassesButton.setSelected(true);

            hairButton = new JCheckBox("Hair");
            hairButton.setMnemonic(KeyEvent.VK_H);
            hairButton.setSelected(true);

            teethButton = new JCheckBox("Teeth");
            teethButton.setMnemonic(KeyEvent.VK_T);
            teethButton.setSelected(true);

            chinButton.addItemListener(this);
            glassesButton.addItemListener(this);
            hairButton.addItemListener(this);
            teethButton.addItemListener(this);

            choices = new StringBuffer("cght");

            JPanel checkPanel = new JPanel(new GridLayout(0, 1));
            checkPanel.add(chinButton);
            checkPanel.add(glassesButton);
            checkPanel.add(hairButton);
            checkPanel.add(teethButton);

            add(checkPanel, BorderLayout.LINE_START);
            setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            int index = 0;
            char c = '-';
            Object source = e.getItemSelectable();

            if (source == chinButton) {
                index = 0;
                c = 'c';
            } else if (source == glassesButton) {
                index = 1;
                c = 'g';
            } else if (source == hairButton) {
                index = 2;
                c = 'h';
            } else if (source == teethButton) {
                index = 3;
                c = 't';
            }

            if (e.getStateChange() == ItemEvent.DESELECTED) {
                c = '-';
            }

            choices.setCharAt(index, c);
        }
    }
}
