package com.example.quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.sql.SQLOutput;

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

    private String fullInputString = "";

    @FXML
    private Label inputLabelResult;

    private String inputResultString = "";
    // ----------------------------------------------------------------------------------------

    // ----------------------------------- DISPLAY FUNCTIONS ----------------------------------

    @FXML
    protected void addZero() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + "0");
        inputLabelResult.setText(inputLabelResult.getText() + "0");

        fullInputString = fullInputString + "0";
        inputResultString = inputResultString + "0";
    }

    @FXML
    private void addOne() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + "1");
        inputLabelResult.setText(inputLabelResult.getText() + "1");

        fullInputString = fullInputString + "1";
        inputResultString = inputResultString + "1";
    }

    @FXML
    private void addTwo() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + "2");
        inputLabelResult.setText(inputLabelResult.getText() + "2");

        fullInputString = fullInputString + "2";
        inputResultString = inputResultString + "2";
    }

    @FXML
    private void addThree() {
        inputLabelFullInput.setText(inputLabelFullInput.getText() + "3");
        inputLabelResult.setText(inputLabelResult.getText() + "3");

        fullInputString = fullInputString + "3";
        inputResultString = inputResultString + "3";
    }

    // ----------------------------------------------------------------------------------------

    // ----------------------------------- BUTTON FUNCTIONS -----------------------------------
    @FXML
    private void OnPlusButtonClick() {
        actionCount++;
        DoMathCheck();
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " + ");
        inputLabelResult.setText(inputLabelResult.getText() + " + ");

        action1 = " plus ";

        fullInputString = fullInputString + " plus ";
        inputResultString = inputResultString + " plus ";
    }

    @FXML
    private void OnMinusButtonClick() {
        actionCount++;
        DoMathCheck();
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " - ");
        inputLabelResult.setText(inputLabelResult.getText() + " - ");

        action1 = " minus ";

        fullInputString = fullInputString + " minus ";
        inputResultString = inputResultString + " minus ";
    }

    @FXML
    private void OnMultButtonClick() {
        actionCount++;
        DoMathCheck();
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " * ");
        inputLabelResult.setText(inputLabelResult.getText() + " * ");

        action1 = " mult ";

        fullInputString = fullInputString + " mult ";
        inputResultString = inputResultString + " mult ";
    }

    @FXML
    private void OnDivButtonClick() {
        actionCount++;
        DoMathCheck();
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " ÷ ");
        inputLabelResult.setText(inputLabelResult.getText() + " ÷ ");

        action1 = " div ";

        fullInputString = fullInputString + " div ";
        inputResultString = inputResultString + " div ";
    }

    @FXML
    private void OnSqRtButtonClick() {
        //TODO : create sqrt function for numbers & set result label to result of function
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " √ |");
        //inputLabelResult.setText(inputLabelResult.getText() + " √ |");
        //action1 = "√";
        inputLabelResult.setText(oneNum.quaternarySquareRoot(num1));
    }

    @FXML
    private void OnSquareButtonClick() {
        //TODO : create square function for numbers & set result label to result of function
        inputLabelFullInput.setText(inputLabelFullInput.getText() + " ² |");
        //inputLabelResult.setText(inputLabelResult.getText() + " ² |");
        inputLabelResult.setText(oneNum.quaternarySquare(num1));
    }
    // ----------------------------------------------------------------------------------------

    @FXML
    private void equalPress(){
        actionCount++;
        inputLabelFullInput.setText("");
        DoMathCheck();
    }

    @FXML
    private void cPress(){
        inputLabelFullInput.setText("");
        inputLabelResult.setText("");
        inputResultString = "";
        fullInputString = "";
    }

    @FXML
    private void backSpacePress(){
        String fullInput = inputLabelFullInput.getText();
        String resultLabel = inputLabelResult.getText();

        //System.out.println(fullInput);
        //System.out.println(resultLabel);

        inputLabelFullInput.setText(fullInput.substring(0, fullInput.length() - 1));
        inputLabelResult.setText(resultLabel.substring(0, resultLabel.length() - 1));

        //inputLabelFullInput.setText(inputLabelFullInput.toString().substring(0, inputLabelFullInput.length() - 1));
        //inputLabelResult.setText(inputLabelResult.toString().substring(0, inputLabelResult.length() - 1));
    }


    private void DoMathCheck() {
        // if num of action presses is greater than 0 & even
        if(actionCount > 0 && actionCount % 2 == 0){
            System.out.println("Action1: " + action1);

            System.out.println("inputResultString: " + inputResultString);
            String[] parts = inputResultString.split(action1);
            num1 = parts[0].trim();
            System.out.println("1st number: " + num1);

            num2 = parts[1].trim();
            System.out.println("2nd number: " + num2);

            switch (action1.trim()){
                case "plus":
                    String addedNums = MultiNumOperations.add(num1, num2);

                    System.out.println("Added Result: " + addedNums);
                    inputLabelResult.setText(addedNums);
                    inputResultString = addedNums;
                    break;

                case "minus":
                    String subNums = MultiNumOperations.subtract(num1, num2);

                    System.out.println("Subtracted Result: " + subNums);
                    inputLabelResult.setText(subNums);
                    inputResultString = subNums;
                    break;

                case "div":
                    String divNums = MultiNumOperations.divide(num1, num2);

                    System.out.println("Divided Result: " + divNums);
                    inputLabelResult.setText(divNums);
                    inputResultString = divNums;
                    break;

                case "mult":
                    String multNums = MultiNumOperations.multiply(num1, num2);

                    System.out.println("Multiplied Result: " + multNums);
                    inputLabelResult.setText(multNums);
                    inputResultString = multNums;
                    break;
            }
        }
    }
}
