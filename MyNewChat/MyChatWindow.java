import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyChatWindow  {

    public MyChatWindow() {
        JFrame frame = new JFrame();
        frame.setTitle("MyFirstChat");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(600, 200, 500, 500);
        frame.setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 120, 40);
        frame.add(field);
        JButton button = new JButton("Send");
        button.setBounds(20, 60, 120, 32);
        frame.add(button);
        JLabel label = new JLabel();
        label.setText("Sent messages");
        label.setBounds(120, 95, 100, 20);
        frame.add(label);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(120, 250, 250, 100);
        frame.add(textArea);
       JScrollPane scroll = new JScrollPane(textArea);
       scroll.setBounds(120,120,250,250);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scroll);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = field.getText();
                if (text.isEmpty()==false) {
                    textArea.append(text + "\n");
                    field.setText(null);
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyChatWindow();
    }
}
