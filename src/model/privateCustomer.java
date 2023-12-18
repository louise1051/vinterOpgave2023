package model;

public class privateCustomer {
	private String privateName;
	private String privateAddress;
	private int privatePostalCode;
	private String privateCity;
	private int privatePhoneNr;
	private String privateMail;
	
	public privateCustomer (String privateName,String privateAddress, int privatePostalCode, String privateCity, int privatePhoneNr, String privateMail) {
		this.privateName = privateName;
		this.privateAddress = privateAddress;
		this.privatePostalCode = privatePostalCode;
		this.privateCity = privateCity;
		this.privatePhoneNr = privatePhoneNr;
		this.privateMail = privateMail;
	
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