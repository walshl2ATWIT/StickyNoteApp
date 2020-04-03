package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;

public class Note extends Main {
	
	private int size;
	private Color color;
	private String message;
	private TextField field;
	
	protected Note() {}
	
	protected Note(int s, Color c, String m) {
		size = s;
		color = c;
		m = message;
		
		field = new TextField();
		/*
		try {
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,super.screenWidth,super.screenHeight);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
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

}
