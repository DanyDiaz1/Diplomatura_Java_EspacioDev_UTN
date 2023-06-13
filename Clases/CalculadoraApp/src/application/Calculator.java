package application;

public class Calculator {
	public static double evaluate(String expression) {
        // Aquí puedes implementar la lógica de evaluación de la expresión
        // Este es solo un ejemplo simple que evalúa expresiones aritméticas básicas
        String[] parts = expression.split("");
        // [5, +, 5]
        double operand1 = Double.parseDouble(parts[0]);
        double operand2 = Double.parseDouble(parts[2]);
        String operator = parts[1];
        double result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    throw new IllegalArgumentException("División entre cero");
                }
                break;
        }

        return result;
    }
}
