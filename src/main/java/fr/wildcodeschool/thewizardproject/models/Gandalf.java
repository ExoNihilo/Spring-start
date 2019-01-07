package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gandalf")
public class Gandalf implements WizardInterface {
	
	private OutfitInterface myOutfit;
	
	@Autowired
	public Gandalf(@Qualifier("outfitRed")OutfitInterface theOutfit) {
		this.myOutfit = theOutfit;
	}

	@Override
	public String giveAdvice() {
		return "Fly, you fools.";
	}
	
	
	
	@Override
	public String changeDress() {
		return this.myOutfit.describeDressColor();
	}

}
