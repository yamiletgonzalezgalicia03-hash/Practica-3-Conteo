module com.yamigg.practicaconteo3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.yamigg.practicaconteo3 to javafx.fxml;
    exports com.yamigg.practicaconteo3;
}
