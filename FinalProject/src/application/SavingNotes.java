package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.layout.GridPane;

public class SavingNotes {
	
	protected static File file = new File("savedNotes.txt");
	
	public static File getFile() {
		return file;
	}
	
	public static void setFile(File f) {
		file = f;
	}
	
	//saves notes into a text file with ;;; in between each note
	public static void saveNotes(ArrayList<Note> a) {
		try (PrintWriter out = new PrintWriter(file);) {
			for (int i = 0; i < a.size(); i++) {
				out.printf("%s;;;", a.get(i).getMessage());
			}
			System.out.println("--Notes saved--");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//finds all the saved notes and separates them into an array list of new notes
	public static ArrayList<Note> getNotesFromFile() {
		ArrayList<Note> a = new ArrayList<Note>();
		try (Scanner in = new Scanner(file)) {
			String[] arr = in.nextLine().split(";;;");
			for (int i = 0; i < arr.length; i++) {
				a.add(new Note(arr[i]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return a;
	}
	
	private static boolean checkEmpty() {
		boolean isEmpty = true;
		try (Scanner in = new Scanner(file)) {
			if (!in.nextLine().contains(";;;")) {
				isEmpty = false;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return isEmpty;
	}
	
	public static void loadNotes(GridPane g) {
		if (checkEmpty() == false) {
			try {
				ArrayList<Note> a = getNotesFromFile();
				for (int i = 0; i < a.size(); i++) {
					g.add(Note.createTextArea(a.get(i)), 0, 0);
				}
				System.out.println("--Notes loaded--");
			} catch (Exception e) {
				System.out.println("--Failed to load notes--");
			}
		}
	}
}
