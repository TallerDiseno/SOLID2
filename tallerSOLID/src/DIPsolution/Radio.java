package DIPsolution;

public class Radio implements IFabricable{
	private boolean encendida=false;
	
	public boolean isEncendida() {
		return this.encendida;
	}
	
	public void encender(){
		this.encendida=true;
	}

	@Override
	public void fabricar() {
		System.out.println("Fabricando radio");
		try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Fabricado!");
	}
}
