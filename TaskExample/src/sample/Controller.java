package sample;

import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;

public class Controller {

    @FXML
    private ListView listView;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private ListView movieList;
    @FXML
    private ProgressBar movieProgressBar;
    @FXML
    private Label progressLabel;
    @FXML
    private Label movieProgressBarLabel;

    private Service<ObservableList<String>> employeeService;
    private Service<ObservableList<String>> movieService;

    public void initialize() {

        employeeService = new EmployeeService();
        progressLabel.textProperty().bind(employeeService.messageProperty());
        listView.itemsProperty().bind(employeeService.valueProperty());
        progressBar.progressProperty().bind(employeeService.progressProperty());

        movieService = new MovieService();
        movieProgressBarLabel.textProperty().bind(movieService.messageProperty());
        movieList.itemsProperty().bind(movieService.valueProperty());
        movieProgressBar.progressProperty().bind(movieService.progressProperty());

        progressLabel.visibleProperty().bind(employeeService.runningProperty());
        progressBar.visibleProperty().bind(employeeService.runningProperty());

        movieProgressBar.visibleProperty().bind(movieService.runningProperty());
        movieProgressBarLabel.visibleProperty().bind(movieService.runningProperty());
    }

    @FXML
    public void buttonPressed() {
        if (employeeService.getState() == Worker.State.RUNNING) {
            employeeService.restart();
        } else if (employeeService.getState() == Worker.State.SUCCEEDED) {
            employeeService.restart();
        } else {
            employeeService.start();
        }

        if(movieService.getState() == Worker.State.RUNNING) {
            movieService.restart();
        } else if (movieService.getState() == Worker.State.SUCCEEDED) {
            movieService.restart();
        } else {
            movieService.start();
        }
    }
}
