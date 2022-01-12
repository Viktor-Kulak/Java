


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Bot extends JFrame {


    public JTextArea chatarea = new JTextArea();
    private JTextField chatbox = new JTextField();
    private JButton chatbutton = new JButton();


    public Bot() throws IOException {
        JFrame frame = new JFrame();

        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("AutoShop");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(chatarea);
        frame.add(chatbox);
        frame.add(chatbutton);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("530b6e62dcd0ee270342545c8db4d24a--fairy-tail.jpg"));
        frame.getContentPane().setBackground(Color.BLACK);

        chatarea.setBackground(Color.LIGHT_GRAY);
        chatarea.setForeground(Color.BLUE);
        chatbox.setBackground(Color.LIGHT_GRAY);
        chatbox.setForeground(Color.BLUE);

        ImageIcon icon1 = new ImageIcon("fb343bd745c9a587d9e28f6d7593c700c8a4b8e9_medium.jpg");

        chatarea.setSize(300, 300);
        chatarea.setLocation(0, 0);


        chatbox.setSize(300, 50);
        chatbox.setLocation(0, 405);

        chatbutton.setSize(60, 50);
        chatbutton.setLocation(320, 405);
        chatbutton.setIcon(icon1);


        chatbox.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                String gtext = chatbox.getText();


                chatarea.append("   KAMO  ->" + gtext + "\n");
                chatbox.setText(" ");
                if (gtext.contains("Ahoj")) {
                    bot("Ahoj kamo");

                }


                if (gtext.contains("Chci něco zajmaveho")) {
                    bot("Muzu tě předložit Film nebo Anime!");
                }

                if (gtext.contains(" Chci film")) {
                    bot("Jaky chceš žanr");

                }
                if (gtext.contains("chci nějaku zajmavu komedie")) {
                    bot("Tak se podivej Žhavé výstřely ");
                }
            }

            private void bot(String string) {
                chatarea.append("  Žora  -> " + string + "\n");
            }

        });


    }


}




