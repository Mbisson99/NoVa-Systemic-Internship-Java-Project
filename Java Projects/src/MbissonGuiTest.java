import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Scanner;
//Version 1 -- learning how to take events from a button
public class MbissonGuiTest extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public static String toPig(String transWord) {
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		
		String pig;
		
		int first = 0;
		int firstVowel = 0;
		int last = transWord.length();
		
		for(int x = 0; x < last; x++) {
			char temp = Character.toLowerCase(transWord.charAt(x));
			if(temp == a || temp == e || temp == i || temp == o || temp == u) {
	            firstVowel = x;
	            break;
	        }
		}
		if(first!=firstVowel) {
			String start = transWord.substring(firstVowel,last);
			String finish = transWord.substring(first,firstVowel)+"ay";
			pig = start+finish;
		}
		else {
			pig = transWord+"yay";
		}
		
		return pig;
	}
	
	public void start(Stage primaryStage) throws Exception{
		//window's title
		primaryStage.setTitle("Title_Of_The_Window");
		//button and label created to be put into the window
		Button b = new Button("Click me to downlaod more RAM");
		Label l = new Label("You need more RAM");
		//layout for buttons and stuff to be put into
		StackPane layout = new StackPane();
		//event to handle when the button is pressed
		EventHandler<ActionEvent> bPressed = new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				l.setText("More viru-- I mean RAM downloaded");
			}
		};
		//making sure that when the button is pressed the event acutally happens
		b.setOnAction(bPressed);
		//adding the label and button to the layout
		layout.getChildren().add(b);
		layout.getChildren().add(l);
		//creating the window
		Scene scene = new Scene(layout, 500, 450);
		//moving the button and layout
		b.setTranslateY(20);
		l.setTranslateY(-20);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

