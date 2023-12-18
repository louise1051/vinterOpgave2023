package model;

public class privateCustomer {
	private String privateName;
	private String privateAddress;
	private int privatePostalCode;
	private String privateCity;
	private int privatePhoneNr;
	private String privateMail;
	
	public privateCustomer (String privateName,String privateAddress, int privatePostalCode, String privateCity, int privatePhoneNr, String privateMail) {
		this.setPrivateName(privateName);
		this.setPrivateAddress(privateAddress);
		this.setPrivatePostalCode(privatePostalCode);
		this.setPrivateCity(privateCity);
		this.setPrivatePhoneNr(privatePhoneNr);
		this.setPrivateMail(privateMail);
	
	}

	public String getPrivateName() {
		return privateName;
	}

	public void setPrivateName(String privateName) {
		this.privateName = privateName;
	}

	public String getPrivateAddress() {
		return privateAddress;
	}

	public void setPrivateAddress(String privateAddress) {
		this.privateAddress = privateAddress;
	}

	public int getPrivatePostalCode() {
		return privatePostalCode;
	}

	public void setPrivatePostalCode(int privatePostalCode) {
		this.privatePostalCode = privatePostalCode;
	}

	public String getPrivateCity() {
		return privateCity;
	}

	public void setPrivateCity(String privateCity) {
		this.privateCity = privateCity;
	}

	public int getPrivatePhoneNr() {
		return privatePhoneNr;
	}

	public void setPrivatePhoneNr(int privatePhoneNr) {
		this.privatePhoneNr = privatePhoneNr;
	}

	public String getPrivateMail() {
		return privateMail;
	}

	public void setPrivateMail(String privateMail) {
		this.privateMail = privateMail;
	}
}