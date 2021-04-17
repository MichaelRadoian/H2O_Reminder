package View;

import java.awt.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField name;

    public void getName(){
        name.getText();
    }
}
