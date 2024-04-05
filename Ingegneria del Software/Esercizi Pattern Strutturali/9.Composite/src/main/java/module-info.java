module it.demacs.Composite {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.demacs.Composite to javafx.fxml;
    exports it.demacs.Composite;
}
