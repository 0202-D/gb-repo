import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyChatWindow extends JFrame {
    public MyChatWindow(){
    setTitle("Test Window");
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
        textArea.setBounds(120,250,250 ,100);
        add(textArea);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText(field.getText());
            }
        });








        setVisible(true);
}

    public static void main(String[] args) {
      new  MyChatWindow();
    }
}
