package DIPsolution;


public class LlantaParaBicicleta implements IFabricable {

	@Override
	public void fabricar() {
        System.out.println("Fabricando llanta para bicicleta!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Fabricado!");
	}

}
