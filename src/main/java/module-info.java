module com.scenebuilderproba.javafxdemobuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.scenebuilderproba.javafxdemobuilder to javafx.fxml;
    exports com.scenebuilderproba.javafxdemobuilder;
    exports com.scenebuilderproba.javafxdemobuilder.controller;
    opens com.scenebuilderproba.javafxdemobuilder.controller to javafx.fxml;
}