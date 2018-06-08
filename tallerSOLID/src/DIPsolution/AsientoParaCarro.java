package DIPsolution;

public class AsientoParaCarro implements IFabricable{

	@Override
	public void fabricar() {
		System.out.println("Fabricando asiento para carro");
		try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Fabricado!");
	}


}
