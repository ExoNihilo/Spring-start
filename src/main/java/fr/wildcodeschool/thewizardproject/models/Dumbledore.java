package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements WizardInterface {
	
	private OutfitInterface myOutfit;
	
	@Autowired
	public Dumbledore(@Qualifier("outfitBlue")OutfitInterface theOutfit) {
		this.myOutfit = theOutfit;
	}
	
	@Override
	public String giveAdvice() {
		return "It does not do to dwell on dreams and forget to live, remember that.";
	}

	
	@Override
	public String changeDress() {
		return this.myOutfit.describeDressColor();
	}

}
