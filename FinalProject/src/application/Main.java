package application;
	
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	static public int screenWidth = 650;
	static public int screenHeight = 635;
	static public Scene scene = null;
	static public ArrayList<Note> notes = new ArrayList<Note>();
	static public VBox root;
	
	@Override
	public void start(Stage primaryStage) throws IOException{
		root = (VBox)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		scene = new Scene(root,screenWidth,screenHeight);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Notes");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}
