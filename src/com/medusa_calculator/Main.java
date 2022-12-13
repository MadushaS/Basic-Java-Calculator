package com.medusa_calculator;
import javax.swing.*;
import java.awt.*;

public class Main {
    private static  void setDarkTheme(MainForm mf){
        Color numberButtonBg = new Color(70,70,70);
        Color actionButtonBg = new Color(50,50,50);
        Color white = new Color(255,255,255);

        mf.button0.setBackground(numberButtonBg);
        mf.button1.setBackground(numberButtonBg);
        mf.button2.setBackground(numberButtonBg);
        mf.button3.setBackground(numberButtonBg);
        mf.button4.setBackground(numberButtonBg);
        mf.button5.setBackground(numberButtonBg);
        mf.button6.setBackground(numberButtonBg);
        mf.button7.setBackground(numberButtonBg);
        mf.button8.setBackground(numberButtonBg);
        mf.button9.setBackground(numberButtonBg);
        mf.buttonPeriod.setBackground(numberButtonBg);

        mf.buttonClear.setBackground(actionButtonBg);
        mf.buttonDivide.setBackground(actionButtonBg);
        mf.buttonMinus.setBackground(actionButtonBg);
        mf.buttonMod.setBackground(actionButtonBg);
        mf.buttonMultiply.setBackground(actionButtonBg);
        mf.buttonPlus.setBackground(actionButtonBg);
        mf.buttonRoot.setBackground(actionButtonBg);
        mf.buttonSquare.setBackground(actionButtonBg);

        mf.button0.setForeground(white);
        mf.button1.setForeground(white);
        mf.button2.setForeground(white);
        mf.button3.setForeground(white);
        mf.button4.setForeground(white);
        mf.button5.setForeground(white);
        mf.button6.setForeground(white);
        mf.button7.setForeground(white);
        mf.button8.setForeground(white);
        mf.button9.setForeground(white);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        MainForm mf= new MainForm();
        mf.textField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        frame.setContentPane(mf.contentPane);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setDarkTheme(mf);
        frame.pack();
        frame.setVisible(true);
    }
}

