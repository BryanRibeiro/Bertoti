package pattern;

public class Equipamento {
	
	private Equipar equipar;
	
	public void setEquipamento(Equipar equipar) {
		this.equipar = equipar;
	}
	
	public void colocarEquipamento() {
		this.equipar.colocarEquip();
	}
	
}
