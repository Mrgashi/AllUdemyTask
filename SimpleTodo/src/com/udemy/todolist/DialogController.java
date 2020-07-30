package com.udemy.todolist;

import com.udemy.todolist.datamodel.TodoData;
import com.udemy.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults() {
        String shortdescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        TodoItem newItem = new TodoItem(shortdescription, details, deadlineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;

    }

     public void adoptItemDetails(TodoItem edited) {
        shortDescriptionField.setText(edited.getShortDesc());
        detailsArea.setText(edited.getDetails());
        deadlinePicker.setValue(edited.getDeadline());
     }

     public void modifyItemDetails(TodoItem item) {
        item.setShortDesc(shortDescriptionField.getText());
        item.setDetails(detailsArea.getText());
        item.setDeadline(deadlinePicker.getValue());
     }

}