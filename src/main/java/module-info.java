module com.example.javabasicejerciciotema4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasicejerciciotema4 to javafx.fxml;
    exports com.example.javabasicejerciciotema4;
}