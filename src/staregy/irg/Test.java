package staregy.irg;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employe empl=new Employe();
empl.setSalaireMensuel(20000);
empl.irg.calculerIRG(empl.getSalaireMensuel());
//empl.getSalaireMensuel();
System.out.println(empl.getSalaireMensuelNet());
System.out.println("maroc");
empl.setSalaireMensuel(20000);
empl.setIrg(new StrategyMA());
empl.getIrg().calculerIRG(empl.getSalaireMensuel());
System.out.println(empl.getSalaireMensuelNet());
	}

}
