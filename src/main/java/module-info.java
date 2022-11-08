module uz.bakhromjon.javafxlogout {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxlogout to javafx.fxml;
    exports uz.bakhromjon.javafxlogout;
}