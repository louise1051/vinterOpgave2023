package model;

public class businessCustomer {
	private String businessName;
	private String businessAddress;
	private int businessPostalCode;
	private String businessCity;
	private int businessPhoneNr;
	private String businessMail;
	
	public businessCustomer (String businessName,String businessAddress, int businessPostalCode, String businessCity, int businessPhoneNr, String businessMail) {
		this.businessName = businessName;
		this.businessAddress = businessAddress;
		this.businessPostalCode = businessPostalCode;
		this.businessCity = businessCity;
		this.businessPhoneNr = businessPhoneNr;
		this.businessMail = businessMail;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public int getBusinessPostalCode() {
		return businessPostalCode;
	}

	public void setBusinessPostalCode(int businessPostalCode) {
		this.businessPostalCode = businessPostalCode;
	}

	public String getBusinessCity() {
		return businessCity;
	}

	public void setBusinessCity(String businessCity) {
		this.businessCity = businessCity;
	}

	public int getBusinessPhoneNr() {
		return businessPhoneNr;
	}

	public void setBusinessPhoneNr(int businessPhoneNr) {
		this.businessPhoneNr = businessPhoneNr;
	}

	public String getBusinessMail() {
		return businessMail;
	}

	public void setBusinessMail(String businessMail) {
		this.businessMail = businessMail;
	}
}