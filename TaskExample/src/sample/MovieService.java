package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class MovieService extends Service<ObservableList<String>> {
    @Override
    protected Task<ObservableList<String>> createTask() {
        return new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {

                String[] names = {
                        "12 Angry Men\n",
                        "12 Years a Slave\n",
                        "13 Going on 30\n",
                        "13 Hours: The Secret Soldiers of Benghazi\n",
                        "13th Warrior, The\n",
                        "14 Carrot Rabbit\n",
                        "17 Again\n",
                        "20th Century Women\n",
                        "21 Grams\n",
                        "25th Hour\n",
                        "27 Dresses\n",
                        "28 Days Later"
                };

                ObservableList<String> movieNames = FXCollections.observableArrayList();

                for (int i = 0; i < names.length; i++) {
                    movieNames.add(names[i]);
                    updateMessage("Adding " + names[i] + " to the movie list");
                    updateProgress(i + 1, names.length);
                    Thread.sleep(200);
                }
                return movieNames;
            }
        };
    }
}
