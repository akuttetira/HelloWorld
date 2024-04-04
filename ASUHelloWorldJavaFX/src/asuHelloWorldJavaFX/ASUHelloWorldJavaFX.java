package asuHelloWorldJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
 
public class ASUHelloWorldJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
 
        	
    		primaryStage.setTitle("In class GitHub Activity");
        	FlowPane flow = new FlowPane();
        	flow.setPadding(new Insets(11, 12, 13, 14));
        	VBox left = new VBox();
        	VBox center = new VBox();
        	VBox right = new VBox();
        	
        	Button button = new Button("Anish's second (actually third) commit");
        	Label eat = new Label("Eat: ");
        	Label drink = new Label("Drink: ");
        	
        	left.getChildren().add(eat);
        	center.getChildren().add(drink);
        	right.getChildren().add(button);
        	
            
            flow.getChildren().addAll(left, center, right);
            primaryStage.setScene(new Scene(flow, 300, 250));
            primaryStage.show();
        }
}