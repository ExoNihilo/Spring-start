package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	private OutfitInterface myOutfit;

	public Dumbledore(OutfitInterface theOutfit) {
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
