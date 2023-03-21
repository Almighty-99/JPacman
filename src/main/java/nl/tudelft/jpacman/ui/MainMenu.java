package nl.tudelft.jpacman.ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MainMenu {
    public static void main(String s[]) {
        JFrame frame = new JFrame("Menu");
        Color bgColor = Color.YELLOW;
        frame.getContentPane().setBackground(bgColor);
        frame.setLayout(new GridBagLayout());
        //try {
        //    frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("src/main/resources/assets/pacmanbg.png")))));
        //} catch (IOException e) {
           // e.printStackTrace();
        //}
        //frame.pack();
        //frame.setVisible(true);

        JButton startButton = new JButton(new ImageIcon("src/main/resources/assets/startButton.png"));
        JButton quitButton = new JButton(new ImageIcon("src/main/resources/assets/quitButton.png"));

        startButton.setBorderPainted(false);
        startButton.setOpaque(false);
        startButton.setContentAreaFilled(false);

        quitButton.setBorderPainted(false);
        quitButton.setOpaque(false);
        quitButton.setContentAreaFilled(false);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Map.main(null);
            }
        });

        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridy = 1;
        gbc.weighty = 0.5;
        frame.add(startButton, gbc);

        gbc.gridy = 2;
        gbc.weighty = 0.5;
        frame.add(quitButton, gbc);

        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setVisible(true);



    }

}
