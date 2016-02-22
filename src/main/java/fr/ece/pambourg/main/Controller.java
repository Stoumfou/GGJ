package fr.ece.pambourg.main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

	private Model myModel;
	@FXML private ListView<String> myList;
	@FXML private TextField myText;
	
	public ObservableList<String> getList(Model model){		
		return model.getObs();
	}
	
	@FXML
    protected void addList() {
        if(myText.getText() != "") {
        	this.myModel.add(myText.getText());
        	myList.setItems((this.getList(myModel)));
        }
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.myModel = new Model();
		
		myModel.add("tes");
		myModel.add("peuple");
		myModel.add("ils");
		myModel.add("sont");
		myModel.add("beaux");
		
		myList.setItems((this.getList(myModel)));
	}
}