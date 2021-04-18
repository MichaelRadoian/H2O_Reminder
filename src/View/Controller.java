package View;

import java.awt.*;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class Controller {
    Profile profile = new Profile();
    @FXML
    private TextField name1;

    QuestionController questionController;
    private Stage questionStage;

    public void initialize(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/questions.fxml"));
            Parent root1 = loader.load();
            questionController = loader.getController();

            questionStage = new Stage();
            questionStage.setTitle("");
            questionStage.setScene(new Scene(root1,600,950));


        }catch (Exception ex){

        }
    }

    public void buttonAction() {
        profile.setNickName(name1.getText());

        questionStage.show();
        questionController.setMainController(this);
    }

    public void updateAge(int age){
        profile.setAge(age);
    }

    public void updateWeight(float weight){
        profile.setWeight(weight);
    }

    public void updateExersizeTime(int min,int hour){
        profile.setExcerciseHours(hour);
        profile.setExcerciseMinutes(min);
    }

}
