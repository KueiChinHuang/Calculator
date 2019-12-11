package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    Label result;

    CalculatorModel calc = new CalculatorModel();

    @FXML
    private void initialize(){

        System.out.println("Success!");
        result.setText("");
    }

    /*
     * when gray button is clicked
     * put the number into label (append the value to the result label)
     * store number into a variable
     *
     * when orange button is clicked
     * calculate the variable
     * current number clears
     *
     * when green button is clicked
     * computation executes
     * show the result on label
     *
     * design the 3 methods
     *  ActionEvent
     *
     * */

    @FXML
    private void grey(ActionEvent event){

        Button button = (Button) (event.getSource());
        String buttonValue = button.getText();

        //append the buttonValue to result
        result.setText(result.getText() + buttonValue);
    }

    @FXML
    private void orange(ActionEvent event){
        calc.setOperand1(result.getText());

        Button button = (Button)event.getSource();
        calc.setOperator(button.getText());

        result.setText("");

        System.out.println(
                ((Button) event.getSource()).getText()
        );

    }

    @FXML
    private void green(ActionEvent event){
        calc.setOperand2(result.getText());

        // call on final process
        result.setText(String.valueOf(calc.calculate()));
    }

    @FXML
    private void red(ActionEvent event){
        result.setText("");
    }

}
