module com.example.quaternarycalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.quaternarycalculator to javafx.fxml;
    exports com.example.quaternarycalculator;

}