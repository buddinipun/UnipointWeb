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
 * AssingedVoucher generated by hbm2java
 */
@Entity
@Table(name = "assinged_voucher", schema = "unipointmain")
public class AssingedVoucher implements java.io.Serializable {

	private long assignedValuesId;
	private MerchantUser merchantUserByAddedByRef;
	private MerchantUser merchantUserByClaimedByMerchantUserRefId;
	private MerchantUser merchantUserByAssignedByMerchantUserRefId;
	private MerchantUser merchantUserByLastModifiedByRef;
	private Outlet outlet;
	private UnipointCustomerProfile unipointCustomerProfile;
	private Vouchers vouchers;
	private String assignedDateTime;
	private Boolean voucherClaimed;
	private String claimedDateTime;
	private String addedDateTime;
	private String lastModifiedDateTime;
	private String lastModifiedFields;

	public AssingedVoucher() {
	}

	public AssingedVoucher(long assignedValuesId, MerchantUser merchantUserByAssignedByMerchantUserRefId,
			UnipointCustomerProfile unipointCustomerProfile, Vouchers vouchers, String assignedDateTime) {
		this.assignedValuesId = assignedValuesId;
		this.merchantUserByAssignedByMerchantUserRefId = merchantUserByAssignedByMerchantUserRefId;
		this.unipointCustomerProfile = unipointCustomerProfile;
		this.vouchers = vouchers;
		this.assignedDateTime = assignedDateTime;
	}

	public AssingedVoucher(long assignedValuesId, MerchantUser merchantUserByAddedByRef,
			MerchantUser merchantUserByClaimedByMerchantUserRefId,
			MerchantUser merchantUserByAssignedByMerchantUserRefId, MerchantUser merchantUserByLastModifiedByRef,
			Outlet outlet, UnipointCustomerProfile unipointCustomerProfile, Vouchers vouchers, String assignedDateTime,
			Boolean voucherClaimed, String claimedDateTime, String addedDateTime, String lastModifiedDateTime,
			String lastModifiedFields) {
		this.assignedValuesId = assignedValuesId;
		this.merchantUserByAddedByRef = merchantUserByAddedByRef;
		this.merchantUserByClaimedByMerchantUserRefId = merchantUserByClaimedByMerchantUserRefId;
		this.merchantUserByAssignedByMerchantUserRefId = merchantUserByAssignedByMerchantUserRefId;
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
		this.outlet = outlet;
		this.unipointCustomerProfile = unipointCustomerProfile;
		this.vouchers = vouchers;
		this.assignedDateTime = assignedDateTime;
		this.voucherClaimed = voucherClaimed;
		this.claimedDateTime = claimedDateTime;
		this.addedDateTime = addedDateTime;
		this.lastModifiedDateTime = lastModifiedDateTime;
		this.lastModifiedFields = lastModifiedFields;
	}

	@Id

	@Column(name = "assigned_values_id", unique = true, nullable = false)
	public long getAssignedValuesId() {
		return this.assignedValuesId;
	}

	public void setAssignedValuesId(long assignedValuesId) {
		this.assignedValuesId = assignedValuesId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "added_by_ref")
	public MerchantUser getMerchantUserByAddedByRef() {
		return this.merchantUserByAddedByRef;
	}

	public void setMerchantUserByAddedByRef(MerchantUser merchantUserByAddedByRef) {
		this.merchantUserByAddedByRef = merchantUserByAddedByRef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "claimed_by_merchant_user_ref_id")
	public MerchantUser getMerchantUserByClaimedByMerchantUserRefId() {
		return this.merchantUserByClaimedByMerchantUserRefId;
	}

	public void setMerchantUserByClaimedByMerchantUserRefId(MerchantUser merchantUserByClaimedByMerchantUserRefId) {
		this.merchantUserByClaimedByMerchantUserRefId = merchantUserByClaimedByMerchantUserRefId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assigned_by_merchant_user_ref_id", nullable = false)
	public MerchantUser getMerchantUserByAssignedByMerchantUserRefId() {
		return this.merchantUserByAssignedByMerchantUserRefId;
	}

	public void setMerchantUserByAssignedByMerchantUserRefId(MerchantUser merchantUserByAssignedByMerchantUserRefId) {
		this.merchantUserByAssignedByMerchantUserRefId = merchantUserByAssignedByMerchantUserRefId;
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
	@JoinColumn(name = "claimed_outlet_ref_id")
	public Outlet getOutlet() {
		return this.outlet;
	}

	public void setOutlet(Outlet outlet) {
		this.outlet = outlet;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assigned_to_unipoint_customer_ref_id", nullable = false)
	public UnipointCustomerProfile getUnipointCustomerProfile() {
		return this.unipointCustomerProfile;
	}

	public void setUnipointCustomerProfile(UnipointCustomerProfile unipointCustomerProfile) {
		this.unipointCustomerProfile = unipointCustomerProfile;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_assinged_voucher_id", nullable = false)
	public Vouchers getVouchers() {
		return this.vouchers;
	}

	public void setVouchers(Vouchers vouchers) {
		this.vouchers = vouchers;
	}

	@Column(name = "assigned_date_time", nullable = false, length = 300)
	public String getAssignedDateTime() {
		return this.assignedDateTime;
	}

	public void setAssignedDateTime(String assignedDateTime) {
		this.assignedDateTime = assignedDateTime;
	}

	@Column(name = "voucher_claimed")
	public Boolean getVoucherClaimed() {
		return this.voucherClaimed;
	}

	public void setVoucherClaimed(Boolean voucherClaimed) {
		this.voucherClaimed = voucherClaimed;
	}

	@Column(name = "claimed_date_time", length = 300)
	public String getClaimedDateTime() {
		return this.claimedDateTime;
	}

	public void setClaimedDateTime(String claimedDateTime) {
		this.claimedDateTime = claimedDateTime;
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
