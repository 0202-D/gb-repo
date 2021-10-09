import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyChatWindow extends JFrame {
    public MyChatWindow() {
        setTitle("MyFirstChat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600, 200, 500, 500);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 120, 40);
        add(field);
        JButton button = new JButton("Send");
        button.setBounds(20, 60, 120, 32);
        add(button);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(120, 250, 250, 100);
        add(textArea);
        JLabel label = new JLabel();
        label.setText("Sent messages");
        label.setBounds(120,220,100,20);
        add(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText(field.getText());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyChatWindow();
    }
}
