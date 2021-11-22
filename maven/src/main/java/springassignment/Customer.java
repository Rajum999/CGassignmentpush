package springassignment;

public class Customer {
	int customerId;
	String customerName;
	int customerContact;
	private Address customerAddress;

	/*
	 * public Customer(int customerId, String customerName, int customerContact,
	 * Address customerAddress) { super(); this.customerId = customerId;
	 * this.customerName = customerName; this.customerContact = customerContact;
	 * this.customerAddress = customerAddress; }
	 */
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void display() {
		System.out.println("customer Id is " + getCustomerId());
		System.out.println("Customer name is " + getCustomerName());
		System.out.println("Customer contact is " + getCustomerContact());
		System.out.println("Customer Address is " + getCustomerAddress().city + "," + getCustomerAddress().country + ","
				+ getCustomerAddress().zip + "," + getCustomerAddress().state);

	}

}
