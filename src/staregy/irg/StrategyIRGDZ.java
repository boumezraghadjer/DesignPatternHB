package staregy.irg;

public class StrategyIRGDZ implements StragtegyIrg {

	@Override
	public float calculerIRG(float salaireMentuel) {
		// TODO Auto-generated method stub
		float salaireBrutAnnuel=salaireMentuel*12;
		
		return salaireBrutAnnuel* 12/100;
	}

}
