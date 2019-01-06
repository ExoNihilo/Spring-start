package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
	
	private Outfit myOutfit;
	
	@Override
	public String giveAdvice() {
		return "Fly, you fools.";
	}
	
	public void setOutfit(Outfit theOutfit) {
		
		this.myOutfit = theOutfit;
	}
	
	public String describeOutfit() {
		return this.myOutfit.describeDressColor();
	}

}
