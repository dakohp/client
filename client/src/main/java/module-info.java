module com.example.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.client to javafx.fxml;
    exports com.example.client;
    exports com.example.client.login;
    opens com.example.client.login to javafx.fxml;
    exports com.example.client.client;
    opens com.example.client.client to javafx.fxml;
}