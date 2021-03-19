package de.thunderfrog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnNumbersListener implements ActionListener {

    private CalculatorGUI calculatorGUI;

    public BtnNumbersListener(CalculatorGUI calculatorGUI) {
        this.calculatorGUI = calculatorGUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.charAt(0) == 'C') {
            calculatorGUI.txtResult.setText("");
        }else if (command.charAt(0) == '=') {
            calculatorGUI.txtResult.setText(evaluate(calculatorGUI.txtResult.getText()));
        }else {
            calculatorGUI.txtResult.setText(calculatorGUI.txtResult.getText() + command);
        }
    }

    private String evaluate(String expression) {
        char[] arr = expression.toCharArray();

        String operand1 = "";
        String operand2 = "";
        String operator = "";

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
                if(operator.isEmpty()){
                    operand1 += arr[i];
                }else{
                    operand2 += arr[i];
                }
            }

            if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
                operator += arr[i];
            }
        }

        if (operator.equals("+"))
            result = (Integer.parseInt(operand1) + Integer.parseInt(operand2));
        else if (operator.equals("-"))
            result = (Integer.parseInt(operand1) - Integer.parseInt(operand2));
        else if (operator.equals("/"))
            result = (Integer.parseInt(operand1) / Integer.parseInt(operand2));
        else
            result = (Integer.parseInt(operand1) * Integer.parseInt(operand2));
        return String.valueOf(result);
    }
}
