package org.chapter25.listing;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
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
		BTView btView = new BTView(tree);
		
		
	}

}
