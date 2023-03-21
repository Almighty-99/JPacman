package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Theme {

    private static int theme_;

    public static  int getTheme_(){
        return  theme_;
    }

    public static void setTheme_(int theme_) {
        Theme.theme_ = theme_;
    }

    public static void main(String s[]){
        JFrame frame = new JFrame("Theme");
        Color bgColor = Color.BLACK;
        frame.getContentPane().setBackground(bgColor);
        frame.setLayout(new GridBagLayout());

        JLabel headerLabel = new JLabel("Theme");
        headerLabel.setFont(new Font("UglyByte.otf", Font.TYPE1_FONT, 50));
        frame.add(headerLabel, new GridBagConstraints());
        Color headerTextColor = Color.WHITE;
        headerLabel.setForeground(headerTextColor);

        JButton level1Button = new JButton(new ImageIcon("src/main/resources/assets/og.png"));
        JButton level2Button = new JButton(new ImageIcon("src/main/resources/assets/sea.png"));
        JButton level3Button = new JButton(new ImageIcon("src/main/resources/assets/dinosaur.png"));
        JButton level4Button = new JButton(new ImageIcon("src/main/resources/assets/space.png"));
        JButton level5Button = new JButton(new ImageIcon("src/main/resources/assets/catdog.png"));
        JButton quitButton = new JButton(new ImageIcon("src/main/resources/assets/quitButton.png"));

        level1Button.setBorderPainted(false);
        level1Button.setOpaque(false);
        level1Button.setContentAreaFilled(false);


        level2Button.setBorderPainted(false);
        level2Button.setOpaque(false);
        level2Button.setContentAreaFilled(false);

        level3Button.setBorderPainted(false);
        level3Button.setOpaque(false);
        level3Button.setContentAreaFilled(false);

        level4Button.setBorderPainted(false);
        level4Button.setOpaque(false);
        level4Button.setContentAreaFilled(false);

        level5Button.setBorderPainted(false);
        level5Button.setOpaque(false);
        level5Button.setContentAreaFilled(false);

        quitButton.setBorderPainted(false);
        quitButton.setOpaque(false);
        quitButton.setContentAreaFilled(false);



        level1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setTheme_(1);
                frame.dispose();
                try {
                    Launcher.main(null);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        level2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setTheme_(2);
                frame.dispose();
                try {
                    Launcher.main(null);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        level3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setTheme_(3);
                frame.dispose();
                try {
                    Launcher.main(null);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        level4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setTheme_(4);
                frame.dispose();
                try {
                    Launcher.main(null);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        level5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setTheme_(5);
                frame.dispose();
                try {
                    Launcher.main(null);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
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
        frame.add(headerLabel, gbc);

        gbc.gridy = 1;
        gbc.weighty = 0.5;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        frame.add( level1Button, gbc);


        gbc.gridy = 1;
        gbc.weighty = 0.5;
        gbc.anchor = GridBagConstraints.PAGE_START;
        frame.add(level2Button, gbc);

        gbc.gridy = 1;
        gbc.weighty = 0.5;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        frame.add(level3Button, gbc);

        gbc.gridy = 3;
        gbc.weighty = 0.5;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        frame.add(level4Button, gbc);

        gbc.gridy = 3;
        gbc.weighty = 0.5;
        gbc.anchor = GridBagConstraints.LAST_LINE_END;
        frame.add(level5Button, gbc);

        gbc.gridy = 4;
        gbc.weighty = 0.5;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(quitButton, gbc);

        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
