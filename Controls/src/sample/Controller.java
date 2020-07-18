package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloBtn;
    @FXML
    private Button byeBtn;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;
    @FXML
    private ImageView pick;
    @FXML
    private Label minLabel;
    @FXML
    private Image image;

    @FXML
    public void initialize() {
        helloBtn.setDisable(true);
        byeBtn.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(helloBtn)) {
            System.out.println("Hello, " + nameField.getText());
        } else if (e.getSource().equals(byeBtn)) {
            System.out.println("Bye, " + nameField.getText());
        }
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("I am going to sleep on the : " + s );
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("I am updating the label on the : " + s);
                            ourLabel.setText("We did something!");
                        }
                    });
                } catch (InterruptedException e) {
                    // we dont care
                }
            }
        };

        Runnable makeImage = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            Image image1 = new Image("/toolbarButtonGraphics/general/Cut24.gif");
                            pick.setImage(image1);
                            minLabel.setText("Noe skjedde her ;)... !!! ");
                        }
                    });
                } catch (InterruptedException e1) {
                    // we dont care
                }
            }
        };

        new Thread(task).start();
        new Thread(makeImage).start();

        // this is to show what happens if a thread sleeps with the UI.
        // try {
        //     Thread.sleep(10000);
        // } catch (InterruptedException event) {
        //     // we dont care about this...
        // }
        if (ourCheckBox.isSelected()) {
            nameField.clear();
            helloBtn.setDisable(true);
            byeBtn.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloBtn.setDisable(disableButtons);
        byeBtn.setDisable(disableButtons);
    }

    @FXML
    public void handleChange() {
        System.out.println("The checkBox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }
}
