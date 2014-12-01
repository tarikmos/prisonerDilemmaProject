package PackageFilter;

import prisonier.PrisonerStrategy;

public class AlwaysCooperate implements PrisonerStrategy {

	@Override
	public boolean didCooperate() {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public void setSecondAnswer(boolean second_cooperated) {
		// TODO Auto-generated method stub
		System.out.println("toto");
		
	}
	
	 
	

}
