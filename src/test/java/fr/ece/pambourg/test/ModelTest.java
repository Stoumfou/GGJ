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
		
		m.add("Bonjour");
		m.add("Salut");
		m.add("Carnaval");
		//Créer un itérateur pour comparateur
		Assert.assertNotEquals(compareM, m);
		Assert.assertEquals(compareM, m.items());
		

	}

}
