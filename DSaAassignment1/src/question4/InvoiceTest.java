package question4;

public class InvoiceTest {

	public static void main(String[] args) {
		//Test Invoice 
		Invoice invoiceA = new Invoice("0", "0", 0, 0.);
		invoiceA.setPartNumber("P001");
		invoiceA.setPartDesc("Bosch Cordless Drill 600");
		invoiceA.setPartQuantity(3);
		invoiceA.setPartPricePerItem(44.99);
		
		//print invoice 
		System.out.print("Part Number: " + invoiceA.getPartNumber());
		System.out.println();
		System.out.print("Description: " + invoiceA.getPartDesc());
		System.out.println();
		System.out.print("Quantiy: " + invoiceA.getPartQuantity());
		System.out.println();
		System.out.print("Price Per Item: " + invoiceA.getPartPricePerItem());
		System.out.println();
		System.out.print("Total Cost: " + invoiceA.getInvoiceAmount());

	}

}
