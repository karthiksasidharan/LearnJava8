

public class Item {
	
	private int itemNumber; 
	
	private Double rate;
	
	private String description;
	
	public Item(int itemNumber , Double rate , String description){
		this.itemNumber=itemNumber;
		this.rate=rate;
		this.description=description;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Item [itemNumber=" + itemNumber + ", rate=" + rate
				+ ", description=" + description + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
