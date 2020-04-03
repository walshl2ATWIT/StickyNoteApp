package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SampleController extends Main {

    @FXML
    private TextField noteMessage;

    @FXML
    private Button newNoteBtn;

    @FXML
    void makeNote(ActionEvent event) {
    	if (!noteMessage.getText().isBlank()) {
    		super.notes.add(new Note(20, Color.LIGHTPINK, noteMessage.getText()));
    		System.out.println(noteMessage.getText());	
    	}
    	noteMessage.clear();
	}

}
