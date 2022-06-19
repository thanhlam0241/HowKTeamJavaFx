module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.test to javafx.fxml;
    exports com.example.test;

    opens com.example.TreeView to javafx.fxml;
    exports com.example.TreeView;

    opens com.example.ComboBox to javafx.fxml;
    exports com.example.ComboBox;

    opens com.example.Process to javafx.fxml;
    exports com.example.Process;

    opens com.example.Slider to javafx.fxml;
    exports com.example.Slider;

    opens com.example.Menu to javafx.fxml;
    exports com.example.Menu;

    opens com.example.ImageView to javafx.fxml;
    exports com.example.ImageView;
}