package qna.model.vo;

import java.sql.Date;
import java.util.ArrayList;

public class Qna {
	private String qId;
	private String qTitle;
	private String qContent;
	private String mNo;
	private String orderId;
	private Date qDate;
	private String qCate;
	private String aStatus;
	private ArrayList<String> aContent;
	private ArrayList<Date> aDate;
	private String orderMember;
	private String recipientName;
	private String recipientPhone;
	private String recipientAddress;
	private String deliveryRequest;
	private int totalPrice;
	private Date orderDate;

	public Qna() {
	}

	public Qna(String qId, String qTitle, String qContent, String mNo, String orderId, Date qDate, String qCate,
			String aStatus, ArrayList<String> aContent, ArrayList<Date> aDate, String orderMember, String recipientName,
			String recipientPhone, String recipientAddress, String deliveryRequest, int totalPrice, Date orderDate) {
		super();
		this.qId = qId;
		this.qTitle = qTitle;
		this.qContent = qContent;
		this.mNo = mNo;
		this.orderId = orderId;
		this.qDate = qDate;
		this.qCate = qCate;
		this.aStatus = aStatus;
		this.aContent = aContent;
		this.aDate = aDate;
		this.orderMember = orderMember;
		this.recipientName = recipientName;
		this.recipientPhone = recipientPhone;
		this.recipientAddress = recipientAddress;
		this.deliveryRequest = deliveryRequest;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
	}

	public Qna(String qTitle, String qContent, String mNo, String orderId, String qCate) {
		super();
		this.qTitle = qTitle;
		this.qContent = qContent;
		this.mNo = mNo;
		this.orderId = orderId;
		this.qCate = qCate;
	}

	public Qna(String qId, String qTitle, String qContent, String mNo, String orderId, Date qDate, String qCate,
			String aStatus, ArrayList<String> aContent, ArrayList<Date> aDate) {
		super();
		this.qId = qId;
		this.qTitle = qTitle;
		this.qContent = qContent;
		this.mNo = mNo;
		this.orderId = orderId;
		this.qDate = qDate;
		this.qCate = qCate;
		this.aStatus = aStatus;
		this.aContent = aContent;
		this.aDate = aDate;
	}

//디테일뷰용
	public Qna(String qId, String qTitle, String mNo, String orderId, Date qDate, String qCate, String aStatus) {
		super();
		this.qId = qId;
		this.qTitle = qTitle;
		this.mNo = mNo;
		this.orderId = orderId;
		this.qDate = qDate;
		this.qCate = qCate;
		this.aStatus = aStatus;
	}

	public String getOrderMember() {
		return orderMember;
	}

	public void setOrderMember(String orderMember) {
		this.orderMember = orderMember;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientPhone() {
		return recipientPhone;
	}

	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}

	public String getRecipientAddress() {
		return recipientAddress;
	}

	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}

	public String getDeliveryRequest() {
		return deliveryRequest;
	}

	public void setDeliveryRequest(String deliveryRequest) {
		this.deliveryRequest = deliveryRequest;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Qna(String qId, String qTitle, String mNo, Date qDate, String qCate, String aStatus) {
		super();
		this.qId = qId;
		this.qTitle = qTitle;
		this.mNo = mNo;
		this.qDate = qDate;
		this.qCate = qCate;
		this.aStatus = aStatus;
	}

	public Qna(ArrayList<String> aContent, ArrayList<Date> aDate) {
		super();
		this.aContent = aContent;
		this.aDate = aDate;
	}

	public String getqId() {
		return qId;
	}

	public void setqId(String qId) {
		this.qId = qId;
	}

	public String getqTitle() {
		return qTitle;
	}

	public void setqTitle(String qTitle) {
		this.qTitle = qTitle;
	}

	public String getqContent() {
		return qContent;
	}

	public void setqContent(String qContent) {
		this.qContent = qContent;
	}

	public String getmNo() {
		return mNo;
	}

	public void setmNo(String mNo) {
		this.mNo = mNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getqDate() {
		return qDate;
	}

	public void setqDate(Date qDate) {
		this.qDate = qDate;
	}

	public String getqCate() {
		return qCate;
	}

	public void setqCate(String qCate) {
		this.qCate = qCate;
	}

	public String getaStatus() {
		return aStatus;
	}

	public void setaStatus(String aStatus) {
		this.aStatus = aStatus;
	}

	public ArrayList<String> getaContent() {
		return aContent;
	}

	public void setaContent(ArrayList<String> aContent) {
		this.aContent = aContent;
	}

	public ArrayList<Date> getaDate() {
		return aDate;
	}

	public void setaDate(ArrayList<Date> aDate) {
		this.aDate = aDate;
	}

	@Override
	public String toString() {
		return "Qna [qId=" + qId + ", qTitle=" + qTitle + ", qContent=" + qContent + ", mNo=" + mNo + ", orderId="
				+ orderId + ", qDate=" + qDate + ", qCate=" + qCate + ", aStatus=" + aStatus + ", aContent=" + aContent
				+ ", aDate=" + aDate + ", orderMember=" + orderMember + ", recipientName=" + recipientName
				+ ", recipientPhone=" + recipientPhone + ", recipientAddress=" + recipientAddress + ", deliveryRequest="
				+ deliveryRequest + ", totalPrice=" + totalPrice + ", orderDate=" + orderDate + "]";
	}

}
