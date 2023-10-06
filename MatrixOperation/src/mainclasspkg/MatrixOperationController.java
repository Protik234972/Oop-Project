/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainclasspkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MatrixOperationController implements Initializable {

    @FXML private ComboBox<Integer> matrix1RowComboBox;
    @FXML private ComboBox<Integer> matrix1ColComboBox;
    @FXML private ComboBox<String> matrixOperationComboBox;
    @FXML private TextField matrix2RowTextField;
    @FXML private TextField matrix2ColTextField;
    @FXML private RadioButton matrix1RadioButton;
    @FXML private RadioButton matrix2RadioButton;
    @FXML private Label outputLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        matrix1RowComboBox.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        matrix1ColComboBox.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        matrixOperationComboBox.getItems().addAll("Addition", "Subtraction", "Multipliction", "Transpose", "Inverse");
    }    

    @FXML
    private void executeButtonOnClick(MouseEvent event) {
    }
    
}
