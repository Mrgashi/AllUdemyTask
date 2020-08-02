package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    private Label label;

    @FXML
    public void handleAction() {
        label.setText("Ok button, pressed");
    }

    @FXML
    public void removeText(ActionEvent actionEvent) {
        label.setText("This was removed.");
    }
}
