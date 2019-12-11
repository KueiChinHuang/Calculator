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

    public CalculatorModel(){}

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
        setOperand1(convert(operand1));
    }

    public void setOperand2(String operand2) {
        double value = convert(operand2);
        if(value == 0){
            setOperand2(1);
        }
        else{
            setOperand2(convert(operand2));
        }

    }

    public void setOperator(String operator) {
        setOperator(operator.toCharArray()[operator.length()-1]);
    }

    private double convert(String number){
        double value = 1;
        try{
            value = Double.parseDouble(number);
        }
        catch (Exception e){
            System.out.println(e);
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
