package com.unipoint.model;
// Generated Oct 18, 2016 4:59:22 PM by Hibernate Tools 5.1.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PointRewards generated by hbm2java
 */
@Entity
@Table(name = "point_rewards", schema = "unipointmain")
public class PointRewards implements java.io.Serializable {

	private long rewardId;
	private Merchant merchant;
	private MerchantUser merchantUserByAddedByRef;
	private MerchantUser merchantUserByLastModifiedByRef;
	private Outlet outlet;
	private PointRewardType pointRewardType;
	private UnipointCustomerProfile unipointCustomerProfile;
	private String dateTimeAwarded;
	private Double points;
	private String description;
	private Long awardedByRefId;
	private Double openingBalanceOffered;
	private String typeDetailsString;
	private String addedDateTime;
	private String lastModifiedDateTime;
	private String lastModifiedFields;
	private Set<MerchantCustomerUnipointRewards> merchantCustomerUnipointRewardses = new HashSet<MerchantCustomerUnipointRewards>(
			0);

	public PointRewards() {
	}

	public PointRewards(long rewardId) {
		this.rewardId = rewardId;
	}

	public PointRewards(long rewardId, Merchant merchant, MerchantUser merchantUserByAddedByRef,
			MerchantUser merchantUserByLastModifiedByRef, Outlet outlet, PointRewardType pointRewardType,
			UnipointCustomerProfile unipointCustomerProfile, String dateTimeAwarded, Double points, String description,
			Long awardedByRefId, Double openingBalanceOffered, String typeDetailsString, String addedDateTime,
			String lastModifiedDateTime, String lastModifiedFields,
			Set<MerchantCustomerUnipointRewards> merchantCustomerUnipointRewardses) {
		this.rewardId = rewardId;
		this.merchant = merchant;
		this.merchantUserByAddedByRef = merchantUserByAddedByRef;
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
		this.outlet = outlet;
		this.pointRewardType = pointRewardType;
		this.unipointCustomerProfile = unipointCustomerProfile;
		this.dateTimeAwarded = dateTimeAwarded;
		this.points = points;
		this.description = description;
		this.awardedByRefId = awardedByRefId;
		this.openingBalanceOffered = openingBalanceOffered;
		this.typeDetailsString = typeDetailsString;
		this.addedDateTime = addedDateTime;
		this.lastModifiedDateTime = lastModifiedDateTime;
		this.lastModifiedFields = lastModifiedFields;
		this.merchantCustomerUnipointRewardses = merchantCustomerUnipointRewardses;
	}

	@Id

	@Column(name = "reward_id", unique = true, nullable = false)
	public long getRewardId() {
		return this.rewardId;
	}

	public void setRewardId(long rewardId) {
		this.rewardId = rewardId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "merchant_ref_id")
	public Merchant getMerchant() {
		return this.merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
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
	@JoinColumn(name = "last_modified_by_ref")
	public MerchantUser getMerchantUserByLastModifiedByRef() {
		return this.merchantUserByLastModifiedByRef;
	}

	public void setMerchantUserByLastModifiedByRef(MerchantUser merchantUserByLastModifiedByRef) {
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "check_in_outlet_ref_id")
	public Outlet getOutlet() {
		return this.outlet;
	}

	public void setOutlet(Outlet outlet) {
		this.outlet = outlet;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reward_type_ref")
	public PointRewardType getPointRewardType() {
		return this.pointRewardType;
	}

	public void setPointRewardType(PointRewardType pointRewardType) {
		this.pointRewardType = pointRewardType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unipoint_customer_ref_id")
	public UnipointCustomerProfile getUnipointCustomerProfile() {
		return this.unipointCustomerProfile;
	}

	public void setUnipointCustomerProfile(UnipointCustomerProfile unipointCustomerProfile) {
		this.unipointCustomerProfile = unipointCustomerProfile;
	}

	@Column(name = "date_time_awarded", length = 100)
	public String getDateTimeAwarded() {
		return this.dateTimeAwarded;
	}

	public void setDateTimeAwarded(String dateTimeAwarded) {
		this.dateTimeAwarded = dateTimeAwarded;
	}

	@Column(name = "points", precision = 17, scale = 17)
	public Double getPoints() {
		return this.points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "awarded_by_ref_id")
	public Long getAwardedByRefId() {
		return this.awardedByRefId;
	}

	public void setAwardedByRefId(Long awardedByRefId) {
		this.awardedByRefId = awardedByRefId;
	}

	@Column(name = "opening_balance_offered", precision = 17, scale = 17)
	public Double getOpeningBalanceOffered() {
		return this.openingBalanceOffered;
	}

	public void setOpeningBalanceOffered(Double openingBalanceOffered) {
		this.openingBalanceOffered = openingBalanceOffered;
	}

	@Column(name = "type_details_string")
	public String getTypeDetailsString() {
		return this.typeDetailsString;
	}

	public void setTypeDetailsString(String typeDetailsString) {
		this.typeDetailsString = typeDetailsString;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pointRewards")
	public Set<MerchantCustomerUnipointRewards> getMerchantCustomerUnipointRewardses() {
		return this.merchantCustomerUnipointRewardses;
	}

	public void setMerchantCustomerUnipointRewardses(
			Set<MerchantCustomerUnipointRewards> merchantCustomerUnipointRewardses) {
		this.merchantCustomerUnipointRewardses = merchantCustomerUnipointRewardses;
	}

}
