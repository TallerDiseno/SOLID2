package DIPsolution;

public class Campana implements IFabricable{

	public void tintinear() {
		//Codigo para tintinear
	}

	@Override
	public void fabricar() {
		System.out.println("Fabricando campanilla");
		try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Fabricado!");
	}
}
