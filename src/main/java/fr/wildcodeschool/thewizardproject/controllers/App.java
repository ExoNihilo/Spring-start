package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.Gandalf;
import fr.wildcodeschool.thewizardproject.models.Outfit;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {
	
	public void start() {
		Gandalf wizard = new Gandalf();
		System.out.println("");
        System.out.println("******************");
		System.out.println(wizard.giveAdvice());
        System.out.println("******************");
        Outfit myOutfit = new Outfit();
        wizard.setOutfit(myOutfit);
        System.out.println(wizard.describeOutfit());
	}
}
