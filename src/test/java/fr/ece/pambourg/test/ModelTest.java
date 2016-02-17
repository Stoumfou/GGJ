package fr.ece.pambourg.test;

import org.junit.Assert;
import org.junit.Test;
import fr.ece.pambourg.main.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ModelTest {
	
	@Test
	public void testItems()throws Exception{
		Model m = new Model();
		ObservableList<String> compareM = FXCollections.observableArrayList();
		
		Assert.assertTrue(m.add("Salut"));
		Assert.assertTrue(m.add("Bonjour"));
		Assert.assertTrue(m.add("Carnaval"));
		compareM.add("Bonjour");
		compareM.add("Carnaval");
		compareM.add("Salut");
		
		m.items();
		
		for(String s : compareM)
		{
			Assert.assertEquals(compareM.indexOf(s), m.getObs().indexOf(s));
		}	
	}
}
