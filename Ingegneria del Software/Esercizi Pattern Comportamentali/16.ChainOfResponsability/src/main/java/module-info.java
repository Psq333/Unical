module it.demacs.ChainOfResponsability {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.demacs.ChainOfResponsability to javafx.fxml;
    exports it.demacs.ChainOfResponsability;
}
