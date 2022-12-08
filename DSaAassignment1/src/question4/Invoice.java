package question4;

public class Invoice {
	
	//Instance Variables
	private String partNumber;
	private String partDesc;
	private Integer partQuantity;
	private Double partPricePerItem;
	
	
	//Constructor
	public Invoice(String apartNumber, String apartDesc, Integer apartQuantity, Double apartPricePerItem) {
		partNumber = apartNumber; 
		partDesc = apartDesc;
		partQuantity = apartQuantity; 
		partPricePerItem = apartPricePerItem;		
	}
	
	
	//Getter
	public String getPartNumber() {
		return partNumber;
	}
	
	public String getPartDesc() {
		return partDesc;
	}
	
	public int getPartQuantity() {
		return partQuantity;
	}
	
	public Double getPartPricePerItem() {
		return partPricePerItem;
	}
	
	
	//Setter
	public void setPartNumber(String apartNumber) {
		partNumber = apartNumber; 
	}
	
	public void setPartDesc(String apartDesc) {
		partDesc = apartDesc;
	}
	
	public void setPartQuantity(Integer apartQuantity) {
		partQuantity = apartQuantity;
	}
	
	public void setPartPricePerItem(Double apartPricePerItem) {
		partPricePerItem = apartPricePerItem;
	}
	
	
	//Methods
	
	//Method to ensure Quantity is positive 
	public void setQuantity(int partQuantity) {
		//If the quantity is not positive, it should be set to zero
		if (partQuantity > 0) {
			this.partQuantity = partQuantity;
		} else {
			this.partQuantity = 0;
		}
	}
	
	public double getInvoiceAmount() {
		double partQuantityD = partQuantity;
		double amount = 0;		
		amount = partQuantityD * partPricePerItem;
		return amount;
	}

}
