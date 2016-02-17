package fr.ece.pambourg.main;

import javafx.scene.control.ListView;

public class Controller {

	public ListView getList(Model model){
		ListView list = new ListView();
		list.setItems(model.getObs());
		
		return list;
	}
}