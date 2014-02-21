import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GraphicsLobby extends JFrame {

    private JButton joinButton, leaveButton;
    private JTextField textField;
    private JTextArea textArea;
    private final String JOIN = "join";

    public GraphicsLobby() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 600));
        setTitle("Game Set");

//        try {
//            getContentPane().add(new ImageSet());
//        } catch (IOException e) {
//            System.out.println("Image not found");
//        }

        ButtonPane buttonPane = new ButtonPane();
        TextPane textPane = new TextPane();

        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 0;
        constraints.gridy = 0;

        add(buttonPane, constraints);

        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 2;
        constraints.gridy = 0;

        add(textPane, constraints);

        pack();
        setVisible(true);
    }

    public class ButtonPane extends JPanel implements ActionListener {
        public ButtonPane() {
            setLayout(new GridBagLayout());

            GridBagConstraints constraints = new GridBagConstraints();
            Dimension buttonDimension = new Dimension(120, 50);

            // Parameters for the layout of the joinButton

            joinButton = new JButton("Join Game");
            joinButton.setPreferredSize(buttonDimension);
            joinButton.setMnemonic(KeyEvent.VK_D);
            joinButton.setActionCommand(JOIN);
            joinButton.addActionListener(this);

            constraints.insets = new Insets(5, 5, 5, 5);
            constraints.gridx = 0;
            constraints.gridy = 0;

            add(joinButton, constraints);

            // Parameters for the layout of the leaveButton

            leaveButton = new JButton("Leave Game");
            leaveButton.setPreferredSize(buttonDimension);
            leaveButton.setMnemonic(KeyEvent.VK_M);
            leaveButton.addActionListener(this);

            constraints.gridx = 0;
            constraints.gridy = 1;

            add(leaveButton, constraints);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOIN.equals(e.getActionCommand())) {
                String text = textField.getText();
                if(text.trim().length() == 0) {
                    textField.setText("");

                } else {
                    textArea.append(text + "\n");
                    textField.setText("");
                }
            } else {
            }
        }
    }

    public class TextPane extends JPanel implements ActionListener {
        private final static String NEW_LINE = "\n";

        public TextPane() {
            setLayout(new GridBagLayout());

            textField = new JTextField(20);
            textField.addActionListener(this);

            textArea = new JTextArea(5, 20);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);

            //Add Components to this panel.
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridwidth = GridBagConstraints.REMAINDER;

            constraints.fill = GridBagConstraints.HORIZONTAL;
            add(textField, constraints);

            constraints.fill = GridBagConstraints.BOTH;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            add(scrollPane, constraints);
        }

        public void actionPerformed(ActionEvent evt) {
            String text = textField.getText();
            textArea.append(text + NEW_LINE);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }
}
