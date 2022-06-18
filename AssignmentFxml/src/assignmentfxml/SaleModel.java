package assignmentfxml;

import controllers.FormUIController;
import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SaleModel {
    
    private final StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    private final StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
    private final StringProperty address = new SimpleStringProperty(this, "adress", "");
    private final ObjectProperty<TrajanjeUgovora> trajanjeUgovora = new SimpleObjectProperty<>(this, "trajanjeUgovora", TrajanjeUgovora.NONE);
    private final ObjectProperty<String> protok = new SimpleObjectProperty<>(this, "protok", null);
    private final ObjectProperty<Integer> brzinaProtoka = new SimpleObjectProperty<>(this, "brzinaProtoka", null);
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id", 0);
    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());
    
    public SaleModel() {
    }
    
    public SaleModel(String firstName, String lastName, String address, TrajanjeUgovora trajanjeUgovora, String protok, Integer brzinaProtoka) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.address.set(address);
        this.protok.set(protok);
        this.trajanjeUgovora.set(trajanjeUgovora);
        this.brzinaProtoka.set(brzinaProtoka);
    }
    
    public IntegerProperty idProperty() {
        return this.id;
    }
    
    public Integer getId() {
        return this.id.get();
    }
    
    public void setId(Integer val) {
        this.id.set(val);
    }
    
    public StringProperty firstNameProperty() {
        return firstName;
    }
    
    public String getFirstName() {
        return firstName.get();
    }
    
    public void setFirstName(String newName) {
        this.firstName.set(newName);
    }
    
    public StringProperty lastNameProperty() {
        return lastName;
    }
    
    public String getLastName() {
        return lastName.get();
    }
    
    public void setLastName(String newName) {
        this.firstName.set(newName);
    }
    
    public StringProperty adressProperty() {
        return address;
    }
    
    public String getAdress() {
        return address.get();
    }
    
    public void setAdress(String newName) {
        this.address.set(newName);
    }
    
    public ObjectProperty trajanjeUgovoraProperty() {
        return trajanjeUgovora;
    }
    
    public Object getTrajanjeUgovora() {
        return trajanjeUgovora.get();
    }
    
    public void setTrajanjeUgovora(TrajanjeUgovora duration) {
        this.trajanjeUgovora.set(duration);
    }
    
    public ObjectProperty<ArrayList<String>> errorListProperty() {
        return errorList;
    }
    
    public ObjectProperty protokProperty() {
        return protok;
    }
    
    public String getProtok() {
        return protok.get();
    }
    
    public void setProtok(String p) {
        this.protok.set(p);
    }
    
    public ObjectProperty brzinaProtokaProperty() {
        return brzinaProtoka;
    }
    
    public Object getBrzinaProtoka() {
        return brzinaProtoka.get();
    }
    
    public void setBrzinaProtoka(Integer num) {
        this.brzinaProtoka.set(num);
    }
    
    public void removeListOfErrors() {
        errorList.getValue().clear();
    }
    
    public boolean isValid() {
        boolean valid = true;
        
        if (firstName.get().equals("")) {
            errorList.getValue().add("First name is empty!");
            valid = false;
            return valid;
        }
        if (lastName.get().equals("")) {
            errorList.getValue().add("Last name cannot empty!");
            valid = false;
            return valid;
        }
        if (address.get().equals("")) {
            errorList.getValue().add("Address cannot empty!");
            valid = false;
            return valid;
        }
        if (trajanjeUgovora.getValue() == TrajanjeUgovora.NONE) {
            errorList.getValue().add("Trajanje ugovora cannot empty!");
            valid = false;
            return valid;
        }
        if (protok.getValue() == null) {
            errorList.getValue().add("Protok cannot empty!");
            valid = false;
            return valid;
        }
        if (brzinaProtoka.getValue() == null) {
            errorList.getValue().add("Trajanje ugovora cannot empty!");
            valid = false;
            return valid;
        }
        return valid;
    }
    ArrayList<SaleModel> sales = new ArrayList<>();
    
    public boolean save() {
        if (isValid()) {
            
            FormUIController.lista.setNewSale(this);
            
            System.out.println("Person " + this.getFirstName() + " " + this.getLastName() + " is saved!\n");
            
            return true;
        }
        return false;
    }
    
}
