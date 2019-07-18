//Author: Mitchell Bisson

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
//Version 1 -- learning how to take events from a button
public class PigLatinTranslator extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public static String toPig(String transWord) {
		//creating characters for vowels
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		//splitting the sentence given into seperate words based on the spaces between words
		String[] words = transWord.split(" ");
		//pig String, which will be what the final sentence is added to
		String pig = "";
		//this loop iterates through each of the words in the list
		for(int j = 0; j < words.length; j++) {
			int first = 0;
			int firstVowel = 0;
			int last = words[j].length();
			//this loop iterates through each letter of the word until a vowel is found
			for(int x = 0; x < last; x++) {
				char temp = Character.toLowerCase(words[j].charAt(x));
				if(temp == a || temp == e || temp == i || temp == o || temp == u) {
					firstVowel = x;
					break;
				}
			}
			//checks to see which ending the method should add depending on what letter it starts with
			if(first!=firstVowel) {
				String start = words[j].substring(firstVowel,last);
				String finish = words[j].substring(first,firstVowel)+"ay";
				words[j] = start+finish;
			}
			else {
				words[j] = words[j]+"yay";
			}
		}
		//adds all words to pig seperated by spaces
		for(int y = 0; y < words.length; y++) {
			if(y!=words.length-1)
				pig = pig+words[y]+" ";
			else
				pig = pig+words[y];
		}
		//returns the pig sentence
		return pig;
	}
	
	public void start(Stage primaryStage) throws Exception{
		//window's title
		primaryStage.setTitle("Pig Latin Translator");
		//button and label created to be put into the window
		Button b = new Button("Click me to translate");
		Label l = new Label("Pig Latin translation goes here");
		TextField t = new TextField();
		//layout for buttons and stuff to be put into
		StackPane layout = new StackPane();
		//event to handle when the button is pressed
		EventHandler<ActionEvent> bPressed = new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				l.setText(toPig(t.getText()));
			}
		};
		//linking button to the action
		b.setOnAction(bPressed);
		//adding the label and button to the layout
		layout.getChildren().add(b);
		layout.getChildren().add(l);
		layout.getChildren().add(t);
		//creating the window
		Scene scene = new Scene(layout, 500, 450);
		//moving the button and layout
		b.setTranslateY(-20);
		l.setTranslateY(20);
		t.setTranslateY(-60);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

