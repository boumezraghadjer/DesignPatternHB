package staregy.irg;

public class Employe {
	private String cin;
	private float salaireMensuel;
	public StragtegyIrg irg;
	public Employe() {
		this.irg =new StrategyIRGDZ();
	}
	public float getSalaireMensuelNet() {
		float cal=irg.calculerIRG(salaireMensuel);
		float salaireAnnuel =salaireMensuel*12-cal;

		return salaireAnnuel/12;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public void setSalaireMensuel(float salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	public float getSalaireMensuel() {
		return salaireMensuel;
	}
	public StragtegyIrg getIrg() {
		return irg;
	}
	public void setIrg(StragtegyIrg irg) {
		this.irg = irg;
	}

}
