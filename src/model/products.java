package model;

public class products {
	private String pName;
	private String title;
	private int amount;
	private String size;
	
	public products (String pName, String title, int amount, String size) {
		this.pName = pName;
		this.title = title;
		this.amount = amount;
		this.size = size;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}