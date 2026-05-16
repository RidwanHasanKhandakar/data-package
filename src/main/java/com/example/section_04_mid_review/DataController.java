package com.example.section_04_mid_review;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class DataController {

    public TextField packageNameTextField;
    public TextField dataAmountTextField;
    public TextField priceTextField;
    public ComboBox <String> validityComboBox;
    public ComboBox <String> availabilityComboBox;
    public DatePicker offerEndsDatePIcker;
    public Label errorText;
    public TableColumn PackageNameCol;
    public TableColumn datAmountCol;
    public TableColumn priceCol;
    public TableColumn validityCol;
    public TableColumn availabilityCol;
    public TableColumn offerendsCol;

    public void handleCreatePackageButton(ActionEvent actionEvent) {
    }
}
