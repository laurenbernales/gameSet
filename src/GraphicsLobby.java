import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GraphicsLobby extends JFrame {

    private JButton joinButton, leaveButton;
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

        ButtonPane buttonPane = new ButtonPane();
        TextPane textPane = new TextPane();

        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;


        setContentPane(buttonPane);
        add(textPane);

        pack();
        setVisible(true);
    }

    public class ButtonPane extends JPanel implements ActionListener {
        public ButtonPane() {
        	super (new GridBagLayout());
        	
        		GridBagConstraints c = new GridBagConstraints();
            	Dimension buttonDimension = new Dimension(150, 100);

            	joinButton = new JButton("Join Game");
            	joinButton.setPreferredSize(buttonDimension);
            	joinButton.setMnemonic(KeyEvent.VK_D);
            	joinButton.setActionCommand(JOIN);
            	joinButton.addActionListener(this);
            	c.gridx = 0;
            	c.gridy = 0;
            	add(joinButton,c);

            	leaveButton = new JButton("Leave Game");
            	leaveButton.setPreferredSize(buttonDimension);
            	leaveButton.setMnemonic(KeyEvent.VK_M);
            	leaveButton.addActionListener(this);
            	c.gridx = 0;
            	c.gridy = 1;
            	add(leaveButton, c);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOIN.equals(e.getActionCommand())) {
            } else {
            }
        }
    }

    public class TextPane extends JPanel implements ActionListener {
        protected JTextField textField;
        protected JTextArea textArea;
        private final static String NEW_LINE = "\n";

        public TextPane() {
            super(new GridBagLayout());

            textField = new JTextField(20);
            textField.addActionListener(this);

            textArea = new JTextArea(5, 20);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);

            //Add Components to this panel.
            GridBagConstraints c = new GridBagConstraints();
            c.gridwidth = GridBagConstraints.REMAINDER;

            c.fill = GridBagConstraints.HORIZONTAL;
            add(textField, c);

            c.fill = GridBagConstraints.BOTH;
            c.weightx = 1.0;
            c.weighty = 1.0;
            add(scrollPane, c);
        }

        public void actionPerformed(ActionEvent evt) {
            String text = textField.getText();
            textArea.append(text + NEW_LINE);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }
}
