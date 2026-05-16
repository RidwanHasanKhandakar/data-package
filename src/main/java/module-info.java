module com.example.section_04_mid_review {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.section_04_mid_review to javafx.fxml;
    exports com.example.section_04_mid_review;
}