module it.demacs.Adapter {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens it.demacs.Adapter to javafx.fxml;
    exports it.demacs.Adapter;
}
