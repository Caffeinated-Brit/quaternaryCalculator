module com.example.quaternarycalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quaternarycalculator to javafx.fxml;
    exports com.example.quaternarycalculator;
}