package com.medusa_calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.util.Objects;

public class MainForm {
    public JPanel contentPane;
    public JTextField textField;
    public JButton button9;
    public JButton button5;
    public JButton button7;
    public JButton buttonDivide;
    public JButton buttonMod;
    public JButton button8;
    public JButton button6;
    public JButton buttonMultiply;
    public JButton buttonSquare;
    public JButton button4;
    public JButton buttonRoot;
    public JButton buttonMinus;
    public JButton button3;
    public JButton button2;
    public JButton button1;
    public JButton buttonClear;
    public JButton buttonPlus;
    public JButton buttonEq;
    public JButton buttonPeriod;
    public JButton button0;

    private final int ACTION_ADD = 1;
    private final int ACTION_SUB = 2;
    private final int ACTION_MUL = 3;
    private final int ACTION_DIV = 4;
    private final int ACTION_MOD = 5;

    private int action;
    private double num1;
    private double num2;

    private void appendNum(String appendText){
        if (Objects.equals(textField.getText(), "0")){
            textField.setText(appendText);
        }else{
            textField.setText(textField.getText()+appendText);
        }
    }
    private void appendNum(String appendText,boolean override){
        if (override){
            textField.setText(textField.getText()+appendText);
        }
        else {
            appendNum(appendText);
        }
    }
    private void clearText(){
        textField.setText("");
    }
    public MainForm() {

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("0")){
                    appendNum("0");
                }
            }
        });
        buttonPeriod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().contains(".") && !textField.getText().isEmpty()){
                    appendNum(".",true);
                    buttonPeriod.setEnabled(false);
                }
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearText();
                buttonPeriod.setEnabled(true);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendNum("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendNum("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendNum("3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendNum("4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendNum("5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendNum("6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendNum("7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendNum("8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appendNum("9");
            }
        });
        buttonEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textField.getText());
                if(action == ACTION_ADD){
                    num1+=num2;
                    textField.setText(String.valueOf(num1));
                } else if (action == ACTION_SUB) {
                    num1-=num2;
                    textField.setText(String.valueOf(num1));
                } else if (action == ACTION_MUL) {
                    num1*=num2;
                    textField.setText(String.valueOf(num1));
                } else if (action == ACTION_DIV) {
                    num1/=num2;
                    textField.setText(String.valueOf(num1));
                } else if (action == ACTION_MOD) {
                    num1%=num2;
                    textField.setText(String.valueOf(num1));
                }
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                action=ACTION_ADD;
                clearText();
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                action=ACTION_SUB;
                clearText();
            }
        });
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                action=ACTION_MUL;
                clearText();
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                action=ACTION_DIV;
                clearText();
            }
        });
        buttonMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                action=ACTION_MOD;
                clearText();
            }
        });
        buttonSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(textField.getText());
                textField.setText(String.valueOf(Math.pow(x,2)));
            }
        });
        buttonRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(textField.getText());
                textField.setText(String.valueOf(Math.sqrt(x)));
            }
        });
    }
}
