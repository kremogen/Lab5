package com.kremogen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MainWindow mainWindow = new MainWindow();
        mainWindow.setPath(scan.next());
    }
}
