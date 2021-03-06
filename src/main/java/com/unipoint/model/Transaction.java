package com.unipoint.model;
// Generated Oct 18, 2016 4:59:22 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Transaction generated by hbm2java
 */
@Entity
@Table(name = "transaction", schema = "unipointmain")
public class Transaction implements java.io.Serializable {

	private long transactionId;
	private Outlet outlet;
	private UnipointCustomerProfile unipointCustomerProfile;
	private String transactionType;
	private String invoiceNumber;
	private String dateTime;
	private String productList;
	private Float pointsRedeemed;
	private Float pointsAwarded;
	private Double totalBillValue;
	private Long addedByRef;
	private String addedDateTime;
	private String lastModifiedDateTime;
	private String lastModifiedFields;

	public Transaction() {
	}

	public Transaction(long transactionId, String transactionType) {
		this.transactionId = transactionId;
		this.transactionType = transactionType;
	}

	public Transaction(long transactionId, Outlet outlet, UnipointCustomerProfile unipointCustomerProfile,
			String transactionType, String invoiceNumber, String dateTime, String productList, Float pointsRedeemed,
			Float pointsAwarded, Double totalBillValue, Long addedByRef, String addedDateTime,
			String lastModifiedDateTime, String lastModifiedFields) {
		this.transactionId = transactionId;
		this.outlet = outlet;
		this.unipointCustomerProfile = unipointCustomerProfile;
		this.transactionType = transactionType;
		this.invoiceNumber = invoiceNumber;
		this.dateTime = dateTime;
		this.productList = productList;
		this.pointsRedeemed = pointsRedeemed;
		this.pointsAwarded = pointsAwarded;
		this.totalBillValue = totalBillValue;
		this.addedByRef = addedByRef;
		this.addedDateTime = addedDateTime;
		this.lastModifiedDateTime = lastModifiedDateTime;
		this.lastModifiedFields = lastModifiedFields;
	}

	@Id

	@Column(name = "transaction_id", unique = true, nullable = false)
	public long getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "outlet_ref_id")
	public Outlet getOutlet() {
		return this.outlet;
	}

	public void setOutlet(Outlet outlet) {
		this.outlet = outlet;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unipoint_customer_ref_id")
	public UnipointCustomerProfile getUnipointCustomerProfile() {
		return this.unipointCustomerProfile;
	}

	public void setUnipointCustomerProfile(UnipointCustomerProfile unipointCustomerProfile) {
		this.unipointCustomerProfile = unipointCustomerProfile;
	}

	@Column(name = "transaction_type", nullable = false)
	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Column(name = "invoice_number")
	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@Column(name = "date_time", length = 50)
	public String getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	@Column(name = "product_list")
	public String getProductList() {
		return this.productList;
	}

	public void setProductList(String productList) {
		this.productList = productList;
	}

	@Column(name = "points_redeemed", precision = 8, scale = 8)
	public Float getPointsRedeemed() {
		return this.pointsRedeemed;
	}

	public void setPointsRedeemed(Float pointsRedeemed) {
		this.pointsRedeemed = pointsRedeemed;
	}

	@Column(name = "points_awarded", precision = 8, scale = 8)
	public Float getPointsAwarded() {
		return this.pointsAwarded;
	}

	public void setPointsAwarded(Float pointsAwarded) {
		this.pointsAwarded = pointsAwarded;
	}

	@Column(name = "total_bill_value", precision = 17, scale = 17)
	public Double getTotalBillValue() {
		return this.totalBillValue;
	}

	public void setTotalBillValue(Double totalBillValue) {
		this.totalBillValue = totalBillValue;
	}

	@Column(name = "added_by_ref")
	public Long getAddedByRef() {
		return this.addedByRef;
	}

	public void setAddedByRef(Long addedByRef) {
		this.addedByRef = addedByRef;
	}

	@Column(name = "added_date_time", length = 50)
	public String getAddedDateTime() {
		return this.addedDateTime;
	}

	public void setAddedDateTime(String addedDateTime) {
		this.addedDateTime = addedDateTime;
	}

	@Column(name = "last_modified_date_time", length = 50)
	public String getLastModifiedDateTime() {
		return this.lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(String lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	@Column(name = "last_modified_fields")
	public String getLastModifiedFields() {
		return this.lastModifiedFields;
	}

	public void setLastModifiedFields(String lastModifiedFields) {
		this.lastModifiedFields = lastModifiedFields;
	}

}
