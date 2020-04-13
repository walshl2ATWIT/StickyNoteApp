package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;

public class Note extends Main {
	
	private int size;
	private Color color;
	private String message = "";
	
	protected Note() {}
	
	protected Note(int s, Color c, String m) {
		size = s;
		color = c;
		message = m;
	}
	
	public void setColor(Color c) {
		color = c;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setSize(int s) {
		size = s;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setMessage(String m) {
		message = m;
	}
	
	public String getMessage() {
		return message;
	}
	
	//creates the note text area
	public TextArea createTextArea(Note n) {
		TextArea area = new TextArea(n.getMessage());
		area.setWrapText(true);
		area.setStyle("-fx-control-inner-background:white");
		area.setFont(Font.font(25));
		area.resize(size, size);
		area.setEditable(false);
		return area;
	}

}
