package appli.todolistejx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText1;

    @FXML
    private Label welcomeText11;

    @FXML
    void Inscription(ActionEvent event) {
        System.out.println("inscription");
    }

    @FXML
    void connexion(ActionEvent event) {
        System.out.println("connexion");
    }

    @FXML
    void mail(ActionEvent event) {
        System.out.println("mail");

    }

    @FXML
    void mdp(ActionEvent event) {
        System.out.println("mdp");

    }

    @FXML
    void mdpoublié(ActionEvent event) {
        System.out.println("mdpoublié");

    }

}
