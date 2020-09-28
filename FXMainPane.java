


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5; 
	Label label1;
	TextField textField; 
	
	//  declare two HBoxes
	HBox hBox1;
	HBox hBox2;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager1;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		 button1 = new Button("Hello");
		 button2 = new Button("Howdy");
		 button3 = new Button("Chinese");
		 button4 = new Button("Clear");
		 button5 = new Button("Exit");
		 label1 = new Label("Feedback");
		 textField = new TextField();
		 button1.setOnAction(new ButtonHandler());
		 button2.setOnAction(new ButtonHandler());
		 button3.setOnAction(new ButtonHandler());
		 button4.setOnAction(new ButtonHandler());
		 button5.setOnAction(new ButtonHandler());
		 //  instantiate the HBoxes
		 hBox1 = new HBox();
		 hBox2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		 dataManager1 = new DataManager();
		//  set margins and set alignment of the components

		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		 hBox1.getChildren().addAll(label1, textField);
		//  add the buttons to the other HBox
		 hBox2.getChildren().addAll(button1,button2,button3,button4,button5);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox1, hBox2);
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> {

		
		@Override
		public void handle(ActionEvent event) {
			Object source = event.getTarget();
			
			if (source == button1) {
				textField.setText(dataManager1.getHello());
			}
			if (source == button2) {
				textField.setText(dataManager1.getHowdy());
			}
			if (source == button3) {
				textField.setText(dataManager1.getChinese());
			}
			if (source == button4) {
				textField.setText("");
			}
			if (source == button5) {
				Platform.exit();
				System.exit(0);
			}
			
			
		}

		
			
		}
		
	
	}

	
