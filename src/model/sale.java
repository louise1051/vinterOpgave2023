package model;

public class sale {
	private int orderNr;
	private String invoice;
	private String orderConfirm;
	private String deliveryNote;
	private String placedOrder;
	private String consignmentNote;
	
	public sale (int orderNr, String invoice, String orderConfirm, String deliveryNote, String placedOrder, String consignmentNote) {
		this.orderNr = orderNr;
		this.invoice = invoice;
		this.orderConfirm = orderConfirm;
		this.deliveryNote = deliveryNote;
		this.placedOrder = placedOrder;
		this.consignmentNote = consignmentNote;
	}
	
	
	
	public int getOrderNr() {
		return orderNr;
	}
	public void setOrderNr(int orderNr) {
		this.orderNr = orderNr;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getOrderConfirm() {
		return orderConfirm;
	}
	public void setOrderConfirm(String orderConfirm) {
		this.orderConfirm = orderConfirm;
	}
	public String getDeliveryNote() {
		return deliveryNote;
	}
	public void setDeliveryNote(String deliveryNote) {
		this.deliveryNote = deliveryNote;
	}
	public String getPlacedOrder() {
		return placedOrder;
	}
	public void setPlacedOrder(String placedOrder) {
		this.placedOrder = placedOrder;
	}
	public String getConsignmentNote() {
		return consignmentNote;
	}
	public void setConsignmentNote(String consignmentNote) {
		this.consignmentNote = consignmentNote;
	}
	
}