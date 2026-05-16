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
        //comboBox
        validityComboBox.getItems().addAll("3 days",
                "7 days",
                "15 days",
                "30 days",
                "Unlimited");
        availabilityComboBox.getItems().addAll("App only",
                "Recharge only",
                "App & recharge");
    }

    ArrayList<DataPackage> dataPackageList = new ArrayList<>();

    public void handleCreatePackageButton(ActionEvent actionEvent) {
        if(packageNameTextField.getText().trim().isEmpty()){
            errorText.setText("Plz Enter a package name!");
            return;
        }
        if(dataAmountTextField.getText().trim().isEmpty()){
            errorText.setText("PLZ Enter a data amount");
            return;
        }
        if(priceTextField.getText().trim().isEmpty()){
            errorText.setText("Enter a price");
            return;
        }
        if(validityComboBox.getValue()==null){
            errorText.setText("plz select a validity!");
            return;
        }
        if(availabilityComboBox.getValue()==null){
            errorText.setText("plz select a availability");
            return;
        }
        if(offerEndsDatePIcker.getValue()==null){
            errorText.setText("plz enter a date");
            return;
        }
        for(DataPackage dp : dataPackageList){
            if(dp.getPackageName().equals(packageNameTextField.getText())){
                errorText.setText("data package with same name!");
                return;
            }
        }
        String packageName = packageNameTextField.getText();
        double dataAmount = Double.parseDouble(dataAmountTextField.getText());
        String validity = validityComboBox.getValue();
        double price = Double.parseDouble(priceTextField.getText());
        String availability = availabilityComboBox.getValue();
        LocalDate offerEnds = offerEndsDatePIcker.getValue();
        errorText.setText("DataPackage Saved!");
    }
}
