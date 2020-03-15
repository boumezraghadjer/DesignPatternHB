package staregy.irg;

public class StrategyMA implements StragtegyIrg{

		@Override
		public float calculerIRG(float salaireMentuel) {
			// TODO Auto-generated method stub
			float salaireBrutAnnuel=salaireMentuel*15;
			
			return salaireBrutAnnuel* 15/100;
		}

	}


