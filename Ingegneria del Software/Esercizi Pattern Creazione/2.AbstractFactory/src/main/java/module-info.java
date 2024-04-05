module it.demacs.unical.AbstractFactory {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens it.demacs.unical.AbstractFactory to javafx.fxml;
    exports it.demacs.unical.AbstractFactory;
}
