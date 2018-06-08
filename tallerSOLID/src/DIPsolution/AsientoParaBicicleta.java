package DIPsolution;

public class AsientoParaBicicleta implements IFabricable{

	@Override
	public void fabricar() {
        System.out.println("Fabricando asiento para bicicleta...");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Fabricado!");
	}

}
