package Costumer;

public class CostumerStore extends Costumer {
	
	public enum type {
		RETAILER, WHOLESALER, OTHER
	};

	private type costumerType;

	public CostumerStore (String name, String email, int tax, int postCode, int shopNumer, type costumerType) {
		super(name, email, tax, postCode);
		this.costumerType = costumerType;
	}

	public String toString() {
		return super.toString() + " style: " + this.costumerType;
	}

	public type getCostumerType() {
		return costumerType;
	}

	public void setCostumerType(type costumerType) {
		this.costumerType = costumerType;
	}

}
