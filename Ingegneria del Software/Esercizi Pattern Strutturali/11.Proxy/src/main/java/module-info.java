module it.demacs.Proxy {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;

    opens it.demacs.Proxy to javafx.fxml;
    exports it.demacs.Proxy;
}
