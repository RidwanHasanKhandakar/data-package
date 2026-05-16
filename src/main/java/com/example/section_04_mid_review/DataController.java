package com.example.section_04_mid_review;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataController {

    public TextField packageNameTextField;
    public TextField dataAmountTextField;
    public TextField priceTextField;
    public ComboBox <String> validityComboBox;
    public ComboBox <String> availabilityComboBox;
    public DatePicker offerEndsDatePIcker;
    public Label errorText;
    public TableColumn <DataPackage,String> PackageNameCol;
    public TableColumn <DataPackage,Double> datAmountCol;
    public TableColumn <DataPackage,Double> priceCol;
    public TableColumn <DataPackage,String> validityCol;
    public TableColumn <DataPackage,String> availabilityCol;
    //public TableColumn <DataPackage, LocalDate> offerendsCol;
    public TableColumn <DataPackage,LocalDate> offerEndsCol;
    public TableView <DataPackage> dataPackageTableView;



    public void initialize(){

    }

    ArrayList<DataPackage> dataPackageList = new ArrayList<>();

    public void handleCreatePackageButton(ActionEvent actionEvent) {
        if(packageNameTextField.getText().isEmpty()){
            errorText.setText("Plz Enter a package name!");
            return;
        }
        if(dataAmountTextField.getText().isEmpty()){
            errorText.setText("PLZ Enter a data amount");
            return;
        }
        errorText.setText("DataPackage Saved!");
    }
}
