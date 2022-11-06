module com.mycompany.javafxmlmodule5labb {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafxmlmodule5labb to javafx.fxml;
    exports com.mycompany.javafxmlmodule5labb;
}
