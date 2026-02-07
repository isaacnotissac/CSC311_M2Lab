package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField num1Field;

    @FXML
    private TextField num2Field;

    @FXML
    protected void onCalculateButtonClick() {
        try {
            // Accept only numeric values
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            double sum = num1 + num2;
            welcomeText.setText("Sum: " + sum);

        } catch (NumberFormatException e) {
            welcomeText.setText("Please enter valid numeric values!");
        }
    }
}
