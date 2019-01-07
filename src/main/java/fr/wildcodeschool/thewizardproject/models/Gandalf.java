package fr.wildcodeschool.thewizardproject.models;


public class Gandalf implements WizardInterface {
	
	private OutfitInterface myOutfit;
	
	
	public Gandalf(OutfitInterface theOutfit) {
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
