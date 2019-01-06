package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	private Outfit myOutfit;

	@Override
	public String giveAdvice() {
		return "It does not do to dwell on dreams and forget to live, remember that.";
	}

	public void setOutfit(Outfit theOutfit) {
	
		this.myOutfit = theOutfit;
	}
	
	public String describeOutfit() {
		return this.myOutfit.describeDressColor();
	}

}
