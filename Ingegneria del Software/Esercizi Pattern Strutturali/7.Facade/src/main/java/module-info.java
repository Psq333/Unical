module it.demacs.Facade {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens it.demacs.Facade to javafx.fxml;
    exports it.demacs.Facade;
}
