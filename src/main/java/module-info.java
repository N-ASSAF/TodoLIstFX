module appli.todolistejx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens appli.todolistejx to javafx.fxml;
    exports appli.todolistejx;
    exports appli.todolistejx.Controllers;
    opens appli.todolistejx.Controllers to javafx.fxml;
}