package controllers;

import assignmentfxml.SaleModel;
import assignmentfxml.SalesList;
import assignmentfxml.TrajanjeUgovora;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class FormUIController implements Initializable {
    
    @FXML
    private Label naslov;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField adress;
    @FXML
    private RadioButton yr1;
    @FXML
    private ToggleGroup years;
    @FXML
    private RadioButton yr2;
    @FXML
    private ChoiceBox<?> cbP;
    @FXML
    private ChoiceBox<?> cbBP;
    @FXML
    private Button submitBtn;
    @FXML
    private Button backBtn;
    @FXML
    private Button printBtn;
    
    TrajanjeUgovora tUVal;
    
    SaleModel person = new SaleModel();
    public static SalesList lista = new SalesList();
    ChangeListener<Toggle> toggleListener = new ChangeListener<Toggle>() {
        @Override
        public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
            if (newValue != null) {
                
                ToggleButton selected = (ToggleButton) newValue;
                
                switch (selected.getId()) {
                    case "yr1":
                        tUVal = TrajanjeUgovora.JEDNA_GODINA;
                        person.setTrajanjeUgovora(TrajanjeUgovora.JEDNA_GODINA);
                        break;
                    case "yr2":
                        tUVal = TrajanjeUgovora.DVIJE_GODINE;
                        person.setTrajanjeUgovora(TrajanjeUgovora.DVIJE_GODINE);
                        break;
                }
            }
        }
    };
    @FXML
    private TextField idxInputField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        person = new SaleModel();
        
        bindAllProperties(person);
        
    }
    
    @FXML
    private void onSubmit(ActionEvent event) {
        
        if (person.isValid()) {
            person.save();
            unbindAllProperties(person);
            person = new SaleModel();
            bindAllProperties(person);
            
        } else {
            ArrayList<String> arr = person.errorListProperty().getValue();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            StringBuilder sb = new StringBuilder();
            for (String string : arr) {
                sb.append(string).append("\n");
            }
            alert.setContentText(sb.toString());
            alert.showAndWait();
            arr.clear();
            person.removeListOfErrors();
        }
        
    }
    
    @FXML
    private void onDelete(ActionEvent event) {
        Integer indexValue = null;
        try {
            indexValue = Integer.parseInt(idxInputField.getText());
            
            lista.removeSale(indexValue);
        } catch (Exception e) {
           
        }
        
        System.out.println("Index that is chosen for deletion: " + indexValue);
        
        
    }
    
    @FXML
    private void onPrint(ActionEvent event) {
        lista.printAllSales();
    }
    
    public void bindAllProperties(SaleModel model) {
        firstName.textProperty().bindBidirectional(model.firstNameProperty());
        lastName.textProperty().bindBidirectional(model.lastNameProperty());
        adress.textProperty().bindBidirectional(model.adressProperty());
        years.selectedToggleProperty().addListener(toggleListener);        
        cbP.valueProperty().bindBidirectional(model.protokProperty());
        cbBP.valueProperty().bindBidirectional(model.brzinaProtokaProperty());
        
    }

    public void unbindAllProperties(SaleModel model) {
        firstName.textProperty().unbindBidirectional(person.firstNameProperty());
        lastName.textProperty().unbindBidirectional(person.lastNameProperty());
        adress.textProperty().unbindBidirectional(person.adressProperty());
        years.selectedToggleProperty().removeListener(toggleListener);
        cbP.valueProperty().unbindBidirectional(person.protokProperty());
        cbBP.valueProperty().unbindBidirectional(person.brzinaProtokaProperty());
        
    }
}
