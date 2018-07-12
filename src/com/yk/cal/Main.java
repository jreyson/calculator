package com.yk.cal;

import javax.swing.*;

/**
 * Created by zsyoung on 2017/8/7.
 */
public class Main {
    public static void main(String[] args){
        CalFrame f = new CalFrame();
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
