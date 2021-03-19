package de.thunderfrog;

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {

    private JFrame frame = new JFrame();

    //  Result Box
    protected JTextField txtResult = new JTextField(12);

    //  Number Buttons
    private JButton btnZero = new JButton("0");
    private JButton btnOne = new JButton("1");
    private JButton btnTwo = new JButton("2");
    private JButton btnThree = new JButton("3");
    private JButton btnFour = new JButton("4");
    private JButton btnFive = new JButton("5");
    private JButton btnSix = new JButton("6");
    private JButton btnSeven = new JButton("7");
    private JButton btnEight = new JButton("8");
    private JButton btnNine = new JButton("9");

    //  Math Operatoren
    private JButton btnAddi = new JButton("+");
    private JButton btnSubt = new JButton("-");
    private JButton btnMult = new JButton("*");
    private JButton btnDivi = new JButton("/");

    //  Other Button
    private JButton btnEquals = new JButton("=");
    private JButton btnCancel = new JButton("C");

    public CalculatorGUI(){

        //  Layout
        frame.setLayout(new BorderLayout());

        //  Result Box (NORTH)
        txtResult.setText("");
        txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResult.setFont(new Font("Verdana",Font.BOLD,15));
        txtResult.setEditable(false);
        frame.add(txtResult,BorderLayout.NORTH);

        //  Button Panel (CENTER)
        JPanel centerPanel = new JPanel(new GridLayout(4,4,2,2));

        //  GridRow1
        centerPanel.add(btnSeven);
        centerPanel.add(btnEight);
        centerPanel.add(btnNine);
        centerPanel.add(btnAddi);

        //  GridRow2
        centerPanel.add(btnFour);
        centerPanel.add(btnFive);
        centerPanel.add(btnSix);
        centerPanel.add(btnSubt);

        //  GridRow3
        centerPanel.add(btnOne);
        centerPanel.add(btnTwo);
        centerPanel.add(btnThree);
        centerPanel.add(btnMult);

        //  GridRow4
        centerPanel.add(btnCancel);
        centerPanel.add(btnZero);
        centerPanel.add(btnEquals);
        centerPanel.add(btnDivi);

        //  Numbers Button ActionListener
        btnZero.addActionListener(new BtnNumbersListener(this));
        btnOne.addActionListener(new BtnNumbersListener(this));
        btnTwo.addActionListener(new BtnNumbersListener(this));
        btnThree.addActionListener(new BtnNumbersListener(this));
        btnFour.addActionListener(new BtnNumbersListener(this));
        btnFive.addActionListener(new BtnNumbersListener(this));
        btnSix.addActionListener(new BtnNumbersListener(this));
        btnSeven.addActionListener(new BtnNumbersListener(this));
        btnEight.addActionListener(new BtnNumbersListener(this));
        btnNine.addActionListener(new BtnNumbersListener(this));

        //  Operand Button ActionListener
        btnAddi.addActionListener(new BtnNumbersListener(this));
        btnSubt.addActionListener(new BtnNumbersListener(this));
        btnMult.addActionListener(new BtnNumbersListener(this));
        btnDivi.addActionListener(new BtnNumbersListener(this));

        //  Other Buttons ActionListener
        btnEquals.addActionListener(new BtnNumbersListener(this));

        //  Cancel Button ActionListener
        btnCancel.addActionListener(a -> {
            txtResult.setText("");
        });

        //  ADD Buttons to Frame
        frame.add(centerPanel,BorderLayout.CENTER);

        //  Frame Config
        frame.setTitle("Super Calli | Version 1.0");
        frame.setSize(325,250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
