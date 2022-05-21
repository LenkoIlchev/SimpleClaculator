package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static double a = 0;
    private static double b = 0;
    private static double result = 0;

    private JFrame frame;
    private JTextField textField;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAdd, bSubtract, bDivide, bMultiply, bDecimalPoint, bEquals, bDelete, bClear;
    private int operator;
    private int width;
    private int height;

    public App(int width, int height) {
        this.frame = new JFrame();
        this.textField = new JTextField();
        this.b1 = new JButton("1");
        this.b2 = new JButton("2");
        this.b3 = new JButton("3");
        this.b4 = new JButton("4");
        this.b5 = new JButton("5");
        this.b6 = new JButton("6");
        this.b7 = new JButton("7");
        this.b8 = new JButton("8");
        this.b9 = new JButton("9");
        this.b0 = new JButton("0");
        this.bAdd = new JButton("+");
        this.bSubtract = new JButton("-");
        this.bDivide = new JButton("/");
        this.bMultiply = new JButton("*");
        this.bDecimalPoint = new JButton(".");
        this.bEquals = new JButton("=");
        this.bDelete = new JButton("C");
        this.bClear = new JButton("Clear");
        this.width = width;
        this.height = height;
    }

    public void setUpApp() {
        this.frame.setSize(this.width, this.height);
        this.frame.setTitle("Calculator");

        this.textField.setBounds(30, 40, 280, 45);
        this.b7.setBounds(40, 100, 50, 50);
        this.b8.setBounds(110, 100, 50, 50);
        this.b9.setBounds(180, 100, 50, 50);
        this.bDivide.setBounds(250, 100, 50, 50);
        this.b4.setBounds(40, 170, 50, 50);
        this.b5.setBounds(110, 170, 50, 50);
        this.b6.setBounds(180, 170, 50, 50);
        this.bMultiply.setBounds(250, 170, 50, 50);
        this.b1.setBounds(40, 240, 50, 50);
        this.b2.setBounds(110, 240, 50, 50);
        this.b3.setBounds(180, 240, 50, 50);
        this.bSubtract.setBounds(250, 240, 50, 50);
        this.bDecimalPoint.setBounds(40, 310, 50, 50);
        this.b0.setBounds(110, 310, 50, 50);
        this.bEquals.setBounds(180, 310, 50, 50);
        this.bAdd.setBounds(250, 310, 50, 50);
        this.bDelete.setBounds(60, 380, 100, 50);
        this.bClear.setBounds(180, 380, 100, 50);
        this.frame.add(this.textField);
        this.frame.add(this.b7);
        this.frame.add(this.b8);
        this.frame.add(this.b9);
        this.frame.add(this.bDivide);
        this.frame.add(this.b4);
        this.frame.add(this.b5);
        this.frame.add(this.b6);
        this.frame.add(this.bMultiply);
        this.frame.add(this.b1);
        this.frame.add(this.b2);
        this.frame.add(this.b3);
        this.frame.add(this.bSubtract);
        this.frame.add(this.bDecimalPoint);
        this.frame.add(this.b0);
        this.frame.add(this.bEquals);
        this.frame.add(this.bAdd);
        this.frame.add(this.bDelete);
        this.frame.add(this.bClear);
        this.frame.setLayout(null);

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
    }

    public void setUpButtonListeners() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Object o = ae.getSource();

                if (o == b1) {
                    String text = textField.getText();
                    textField.setText(text += "1");
                }
                if (o == b2) {
                    String text = textField.getText();
                    textField.setText(text += "2");
                }
                if (o == b3) {
                    String text = textField.getText();
                    textField.setText(text += "3");
                }
                if (o == b4) {
                    String text = textField.getText();
                    textField.setText(text += "4");
                }
                if (o == b5) {
                    String text = textField.getText();
                    textField.setText(text += "5");
                }
                if (o == b6) {
                    String text = textField.getText();
                    textField.setText(text += "6");
                }
                if (o == b7) {
                    String text = textField.getText();
                    textField.setText(text += "7");
                }
                if (o == b8) {
                    String text = textField.getText();
                    textField.setText(text += "8");
                }
                if (o == b9) {
                    String text = textField.getText();
                    textField.setText(text += "9");
                }
                if (o == b0) {
                    String text = textField.getText();
                    textField.setText(text += "0");
                }
                if (o == bDecimalPoint) {
                    String text = textField.getText();
                    textField.setText(text += ".");
                }
                if (o == bAdd) {
                    String text = textField.getText();
                    textField.setText(text += " + ");
                    operator = 1;
//                    textField.setText("");
                }
                if (o == bSubtract) {
                    String text = textField.getText();
                    textField.setText(text += " - ");
                    operator = 2;
//                    textField.setText("");
                }
                if (o == bMultiply) {
                    String text = textField.getText();
                    textField.setText(text += " * ");
                    operator = 3;
//                    textField.setText("");
                }
                if (o == bDivide) {
                    String text = textField.getText();
                    textField.setText(text += " / ");
                    operator = 4;
//                    textField.setText("");
                }
                if (o == bEquals) {
                    String[] line = textField.getText().split("[-+ */]+");

                    a = Double.parseDouble(line[0]);
                    b = Double.parseDouble(line[1]);
                    switch (operator) {
                        case 1:
                            result = a + b;
                            break;
                        case 2:
                            result = a - b;
                            break;
                        case 3:
                            result = a * b;
                            break;
                        case 4:
                            result = a / b;
                            break;
                        default:
                            result = 0;
                    }

                    textField.setText("" + result);
                }
                if (o == bClear) {
                    textField.setText("");
                }
                if (o == bDelete) {
                    String s = textField.getText();
                    textField.setText("");
                    for (int i = 0; i < s.length() - 1; i++) {
                        textField.setText(textField.getText() + s.charAt(i));
                    }
                }
            }
        };

        textField.addActionListener(buttonListener);

        this.b1.addActionListener(buttonListener);
        this.b2.addActionListener(buttonListener);
        this.b3.addActionListener(buttonListener);
        this.b4.addActionListener(buttonListener);
        this.b5.addActionListener(buttonListener);
        this.b6.addActionListener(buttonListener);
        this.b7.addActionListener(buttonListener);
        this.b8.addActionListener(buttonListener);
        this.b9.addActionListener(buttonListener);
        this.b0.addActionListener(buttonListener);
        this.bAdd.addActionListener(buttonListener);
        this.bSubtract.addActionListener(buttonListener);
        this.bDivide.addActionListener(buttonListener);
        this.bMultiply.addActionListener(buttonListener);
        this.bDecimalPoint.addActionListener(buttonListener);
        this.bEquals.addActionListener(buttonListener);
        this.bDelete.addActionListener(buttonListener);
        this.bClear.addActionListener(buttonListener);
    }
}
