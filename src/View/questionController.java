package View;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.awt.*;

public class questionController {
    @FXML
    private TextField age;

    @FXML
    private TextField weight;

    @FXML
    private TextField hours;

    @FXML
    private TextField minutes;

    private Profile person;
    Alert warning = new Alert(Alert.AlertType.WARNING);

    public void setData(){
        String inputAge = age.getText();
        if(isNumber(inputAge)){
            int temp = Integer.parseInt(inputAge);

            if(temp < 1 || temp > 110){
                warning.setContentText("input a number between 1 - 110 for age");
                warning.show();
                return;
            }
            person.setAge(temp);
        }
        else{
            warning.setContentText("input a number 1 - 110 for age");
            warning.show();
            return;
        }

    }

    public boolean isNumber(String num){
        for(int i = 0; i < num.length(); i++){
            if(Character.isDigit(num.charAt(i))){
                continue;
            }
            else
                return false;
        }
        return true;
    }
}
