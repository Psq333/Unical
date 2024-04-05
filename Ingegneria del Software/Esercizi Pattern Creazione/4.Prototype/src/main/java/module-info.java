module it.demacs.unical.FormeGeometriceFX {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;

    opens it.demacs.unical.FormeGeometriceFX to javafx.fxml;
    exports it.demacs.unical.FormeGeometriceFX;
}