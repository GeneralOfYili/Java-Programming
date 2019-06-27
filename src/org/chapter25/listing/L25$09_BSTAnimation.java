package org.chapter25.listing;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import org.chapter25.base.BST;
import org.chapter25.base.BTView;

public class L25$09_BSTAnimation<E> extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a Tree
		BST<Integer> tree = new BST<>();
		
		// Create a BTView
		BorderPane pane = new BorderPane();
		BTView view = new BTView(tree);
		pane.setCenter(view);
		
		// Place hBox
		TextField tfKey = new TextField();
		tfKey.setPrefColumnCount(3);
		tfKey.setAlignment(Pos.BASELINE_RIGHT);
		Button btInsert = new Button("Insert");
		Button btDelete = new Button("Delete");
		HBox hBox = new HBox(5);
		hBox.getChildren().addAll(new Label("Enter a key: "),tfKey,btInsert,btDelete);
		hBox.setAlignment(Pos.CENTER);
		pane.setBottom(hBox);
		
		// Handle insert
		btInsert.setOnAction(e ->{
			int  key = Integer.parseInt(tfKey.getText());
			if(tree.search(key)){ // Tree is in the tree already
				view.displayTree();
				view.setStatus(key + " is already in the tree");
			}else{// Insert a new tree
				tree.insert(key);
				view.displayTree();
				view.setStatus(key + " is inserted in the tree");
			}
		});
		
		// Handle deletion
		btDelete.setOnAction(e ->{
			int  key = Integer.parseInt(tfKey.getText());
			if(!tree.search(key)){ // Key is not in the tree
				view.displayTree();
				view.setStatus(key + " is not in the tree");
			}else{// Delete a key
				tree.delete(key);
				view.displayTree();
				view.setStatus(key + " is deleted from the tree");
			}
		});
		
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(pane, 1000, 500);
		primaryStage.setTitle("BSTAnimation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] primaryStage) {
		Application.launch(primaryStage);
	}
}
