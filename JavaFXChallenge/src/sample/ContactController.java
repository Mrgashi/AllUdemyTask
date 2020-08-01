package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import sample.datamodel.Contact;

// no verification done, primarily this is to learn javaFX.

public class ContactController {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField notesField;

    public void initialize() {
        phoneNumberField.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> {
            if (!("-0123456789".contains(keyEvent.getCharacter()))){
                keyEvent.consume();
            }
        });
    }

    @FXML
    public Contact getNewContact() {
        String firstName = firstNameField.getText();
        String lasName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String notes = notesField.getText();

        if (firstNameField.getText().isBlank()) {
            firstName = phoneNumber;
        }
        if (lastNameField.getText().isBlank()) {
            lasName = "XXXXX";
        }
        if (phoneNumberField.getText().isBlank()) {
            phoneNumber = "XXXXXXXX";
        }
        if (notesField.getText().isBlank()) {
            notes = "XXXXX";
        }

        return new Contact(firstName, lasName, phoneNumber, notes);
    }

    public void editContact(Contact selectedContact) {
        firstNameField.setText(selectedContact.getFirstName());
        lastNameField.setText(selectedContact.getLastName());
        phoneNumberField.setText(selectedContact.getPhoneNumber());
        notesField.setText(selectedContact.getNotes());
    }

    public void updateContact(Contact selectedContact) {
        selectedContact.setFirstName(firstNameField.getText());
        selectedContact.setLastName(lastNameField.getText());
        selectedContact.setPhoneNumber(phoneNumberField.getText());
        selectedContact.setNotes(notesField.getText());
    }
}

