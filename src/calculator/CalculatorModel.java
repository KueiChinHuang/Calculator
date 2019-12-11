package calculator;

public class CalculatorModel {
    /*
     * constructors
     *   keep only default
     *
     * methods
     *   getOperand1
     *   getOperand2
     *   setOperator
     *   calculate
     *
     *
     * instance variables
     *   operand1
     *   operand2
     *   operator
     *   result
     *
     * */

    private double operand1;
    private double operand2;
    private char operator;
    private double result;

    public CalculatorModel(){

    }

    public CalculatorModel(double operand1, double operand2, char operator, double result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
        this.result = result;
    }

    private void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    private void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    private void setOperator(char operator) {
        this.operator = operator;
    }

    public void setOperand1(String operand1) {
        // convert
        this.operand1 = convert(operand1);
    }

    public void setOperand2(String operand2) {
        double value = convert(operand2);
        if(value == 0){
            this.operand2 = 1;
        }
        else{
            this.operand2 = convert(operand2);
        }

    }

    public void setOperator(String operator) {
        if(operator.length() == 1){
            setOperator(operator.toCharArray()[0]);
        }
        else{

        }
    }

    private double convert(String number){
        double value = 1;
        try{
            value = Double.parseDouble(number);
        }
        catch (Exception e){
            value = 1;
        }
        return value;
    }

    public double calculate(){
        double result;
        switch(operator){
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                result = operand2;
                break;
        }
        return result;
    }

}
