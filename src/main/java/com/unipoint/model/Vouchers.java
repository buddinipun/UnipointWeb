package com.unipoint.model;
// Generated Oct 18, 2016 4:59:22 PM by Hibernate Tools 5.1.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Vouchers generated by hbm2java
 */
@Entity
@Table(name = "vouchers", schema = "unipointmain")
public class Vouchers implements java.io.Serializable {

	private long voucherId;
	private MerchantUser merchantUserByLastModifiedByRef;
	private MerchantUser merchantUserByAssignedByRef;
	private MerchantUser merchantUserByCreatedByRef;
	private String createdDateTime;
	private String assignedDateTime;
	private String voucherCode;
	private long voucherValue;
	private Long addedByRef;
	private String addedDateTime;
	private String lastModifiedDateTime;
	private String lastModifiedFields;
	private Set<AssingedVoucher> assingedVouchers = new HashSet<AssingedVoucher>(0);

	public Vouchers() {
	}

	public Vouchers(long voucherId, MerchantUser merchantUserByCreatedByRef, String createdDateTime,
			long voucherValue) {
		this.voucherId = voucherId;
		this.merchantUserByCreatedByRef = merchantUserByCreatedByRef;
		this.createdDateTime = createdDateTime;
		this.voucherValue = voucherValue;
	}

	public Vouchers(long voucherId, MerchantUser merchantUserByLastModifiedByRef,
			MerchantUser merchantUserByAssignedByRef, MerchantUser merchantUserByCreatedByRef, String createdDateTime,
			String assignedDateTime, String voucherCode, long voucherValue, Long addedByRef, String addedDateTime,
			String lastModifiedDateTime, String lastModifiedFields, Set<AssingedVoucher> assingedVouchers) {
		this.voucherId = voucherId;
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
		this.merchantUserByAssignedByRef = merchantUserByAssignedByRef;
		this.merchantUserByCreatedByRef = merchantUserByCreatedByRef;
		this.createdDateTime = createdDateTime;
		this.assignedDateTime = assignedDateTime;
		this.voucherCode = voucherCode;
		this.voucherValue = voucherValue;
		this.addedByRef = addedByRef;
		this.addedDateTime = addedDateTime;
		this.lastModifiedDateTime = lastModifiedDateTime;
		this.lastModifiedFields = lastModifiedFields;
		this.assingedVouchers = assingedVouchers;
	}
	
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="unipointmain.voucher_pk_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name = "voucher_id", unique = true, nullable = false)
	public long getVoucherId() {
		return this.voucherId;
	}

	public void setVoucherId(long voucherId) {
		this.voucherId = voucherId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "last_modified_by_ref")
	public MerchantUser getMerchantUserByLastModifiedByRef() {
		return this.merchantUserByLastModifiedByRef;
	}

	public void setMerchantUserByLastModifiedByRef(MerchantUser merchantUserByLastModifiedByRef) {
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assigned_by_ref")
	public MerchantUser getMerchantUserByAssignedByRef() {
		return this.merchantUserByAssignedByRef;
	}

	public void setMerchantUserByAssignedByRef(MerchantUser merchantUserByAssignedByRef) {
		this.merchantUserByAssignedByRef = merchantUserByAssignedByRef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by_ref", nullable = false)
	public MerchantUser getMerchantUserByCreatedByRef() {
		return this.merchantUserByCreatedByRef;
	}

	public void setMerchantUserByCreatedByRef(MerchantUser merchantUserByCreatedByRef) {
		this.merchantUserByCreatedByRef = merchantUserByCreatedByRef;
	}

	@Column(name = "created_date_time", nullable = false, length = 300)
	public String getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	@Column(name = "assigned_date_time", length = 300)
	public String getAssignedDateTime() {
		return this.assignedDateTime;
	}

	public void setAssignedDateTime(String assignedDateTime) {
		this.assignedDateTime = assignedDateTime;
	}

	@Column(name = "voucher_code", length = 300)
	public String getVoucherCode() {
		return this.voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	@Column(name = "voucher_value", nullable = false)
	public long getVoucherValue() {
		return this.voucherValue;
	}

	public void setVoucherValue(long voucherValue) {
		this.voucherValue = voucherValue;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vouchers")
	public Set<AssingedVoucher> getAssingedVouchers() {
		return this.assingedVouchers;
	}

	public void setAssingedVouchers(Set<AssingedVoucher> assingedVouchers) {
		this.assingedVouchers = assingedVouchers;
	}

}
