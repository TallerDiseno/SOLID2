package DIPsolution;

public class MaquinaDIP implements Maquinaria{

	@Override
	public IFabricable fabricar(IFabricable fabricable) {
        fabricable.fabricar();
        System.out.println("Fabricado!");
		return fabricable;
    }
    
}