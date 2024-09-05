package com.example.quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class CalculatorUIController {

    // -------------------------------------- INDICATORS --------------------------------------

    private String num1;
    private String num2;

    private String action1;
    private String action2;

    private int actionCount;

    private boolean equalPress = false;

    @FXML
    private Label inputLabelFullInput;

    @FXML
    private Label inputLabelResult;

    // ----------------------------------------------------------------------------------------

    // ----------------------------------- DISPLAY FUNCTIONS ----------------------------------

    @FXML
    protected void addZero() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + "0");
        inputLabelResult.setText(inputLabelResult.getText() + "0");
    }

    @FXML
    private void addOne() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + "1");
        inputLabelResult.setText(inputLabelResult.getText() + "1");
    }

    @FXML
    private void addTwo() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + "2");
        inputLabelResult.setText(inputLabelResult.getText() + "2");
    }

    @FXML
    private void addThree() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + "3");
        inputLabelResult.setText(inputLabelResult.getText() + "3");
    }

    // ----------------------------------------------------------------------------------------

    // ----------------------------------- BUTTON FUNCTIONS -----------------------------------
    @FXML
    private void OnPlusButtonClick() {
        actionCount++;
        DoMathCheck();
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " + ");
        inputLabelResult.setText(inputLabelResult.getText() + " + ");
        action1 = "+";
    }

    @FXML
    private void OnMinusButtonClick() {
        actionCount++;
        DoMathCheck();
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " - ");
        inputLabelResult.setText(inputLabelResult.getText() + " - ");
        action1 = "-";
    }

    @FXML
    private void OnMultButtonClick() {
        actionCount++;
        DoMathCheck();
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " * ");
        inputLabelResult.setText(inputLabelResult.getText() + " * ");
        action1 = "*";
    }

    @FXML
    private void OnDivButtonClick() {
        actionCount++;
        DoMathCheck();
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " ÷ ");
        inputLabelResult.setText(inputLabelResult.getText() + " ÷ ");
        action1 = "÷";
    }

    @FXML
    private void OnSqRtButtonClick() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " √ |");
        inputLabelResult.setText(inputLabelResult.getText() + " √ |");
        //action1 = "√";
        //inputLabelResult.setText(MultiNumOperations.squareRoot(num1));
    }

    @FXML
    private void OnSquareButtonClick() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " ² |");
        inputLabelResult.setText(inputLabelResult.getText() + " ² |");
        //inputLabelResult.setText(MultiNumOperations.square(num1));
    }
    // ----------------------------------------------------------------------------------------

    @FXML
    private void equalPress(){
        actionCount++;
        DoMathCheck();
    }

    @FXML
    private void cPress(){
        inputLabelFullInput.setText("");
        inputLabelResult.setText("");
    }

    private void ActionCountManage(){

    }

    private void DoMathCheck() {
        // if num of action presses is greater than 0 & even
        if(actionCount > 0 && actionCount % 2 == 0){
            String[] parts = inputLabelResult.toString().split(action1);
            num1 = parts[0].trim();
            num2 = parts[1].trim();

            switch (action1){
                case "+":
                    inputLabelResult.setText(MultiNumOperations.add(num1, num2));
                    break;

                case "-":
                    inputLabelResult.setText(MultiNumOperations.subtract(num1, num2));
                    break;

                case "÷":
                    inputLabelResult.setText(MultiNumOperations.divide(num1, num2));
                    break;

                case "*":
                    inputLabelResult.setText(MultiNumOperations.multiply(num1, num2));
                    break;
            }
        }
    }
}
