package com.kremogen;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{

    private String path;


    protected MainWindow(){
        super("Фон");
        setLayout(new FlowLayout());
        setSize(640,480);
        setVisible(true); // /Users/kremogen/Desktop/labJava/kit.jpg
        // /Users/kremogen/Desktop/labJava/sabaka.jpg
    }

    public void setPath(String path) {
        this.path = path;
        this.setContent();
    }

    private void setContent() {
        setContentPane(new JLabel(new ImageIcon(path)));
    }
}
