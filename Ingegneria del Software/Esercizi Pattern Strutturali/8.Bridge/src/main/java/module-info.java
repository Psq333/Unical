module it.demacs.Bridge {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.demacs.Bridge to javafx.fxml;
    exports it.demacs.Bridge;
}
