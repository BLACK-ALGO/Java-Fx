module com.jih {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jih to javafx.fxml;
    exports com.jih;
}
