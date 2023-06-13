package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;



public class CalculadoraApp extends Application {
	
	  private TextField display;

	    public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Calculadora");

	        GridPane gridPane = new GridPane();
	        gridPane.setPadding(new Insets(10));
	        gridPane.setHgap(5);
	        gridPane.setVgap(5);

	        display = new TextField();
	        display.setPrefWidth(200);
	        display.setEditable(false);
	        gridPane.add(display, 0, 0, 4, 1);

	        String[] buttons = {
	                "7", "8", "9", "/",
	                "4", "5", "6", "*",
	                "1", "2", "3", "-",
	                "0", ".", "=", "+"
	        };

	        int row = 1;
	        int col = 0;
	        for (String button : buttons) {
	            Button btn = createButton(button);
	            gridPane.add(btn, col, row);
	            col++;

	            if (col > 3) {
	                col = 0;
	                row++;
	            }
	        }

	        Scene scene = new Scene(gridPane);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    private Button createButton(String text) {
	        Button button = new Button(text);
	        button.setPrefWidth(50);
	        button.setOnAction(e -> handleButtonAction(text));
	        return button;
	    }

	    private void handleButtonAction(String text) {
	        if (text.equals("=")) {
	            evaluateExpression();
	        } else {
	            display.setText(display.getText() + text);
	        }
	    }

	    private void evaluateExpression() {
	        String expression = display.getText();
	        expression.toCharArray();
	        try {
	            double result = Calculator.evaluate(expression);
	            display.setText(String.valueOf(result));
	        } catch (IllegalArgumentException e) {
	            display.setText("Error");
	        }
	    }
}
