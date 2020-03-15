package sid.org.dp.strategy;

public class Context {
	IProcess iProcess;
public void setiProcess(IProcess iProcess) {
		this.iProcess = iProcess;
	}
public void process() {
	System.out.println("Etape 1....");
	setiProcess(new ProceesImplA());
	iProcess.process();
	System.out.println("Etape 3....");
}
}
