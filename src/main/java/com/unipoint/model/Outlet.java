package com.unipoint.model;
// Generated Oct 18, 2016 4:59:22 PM by Hibernate Tools 5.1.0.Beta1

import java.math.BigDecimal;
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
 * Outlet generated by hbm2java
 */
@Entity
@Table(name = "outlet", schema = "unipointmain")
public class Outlet implements java.io.Serializable {

	private long outletid;
	private Merchant merchant;
	private MerchantUser merchantUserByLastModifiedByRef;
	private MerchantUser merchantUserByAddedByRef;
	private String outletname;
	private BigDecimal phone1;
	private BigDecimal phone2;
	private BigDecimal fax;
	private String address;
	private Double lattitude;
	private Double longitude;
	private String category;
	private String openinghours;
	private String closinghours;
	private String website;
	private String emailaddress;
	private BigDecimal postalcode;
	private String outletdescription;
	private String addedDateTime;
	private String lastModifiedDateTime;
	private String lastModifiedFields;
	private Set<PointRewards> pointRewardses = new HashSet<PointRewards>(0);
	private Set<BuyPoint> buyPoints = new HashSet<BuyPoint>(0);
	private Set<AssingedVoucher> assingedVouchers = new HashSet<AssingedVoucher>(0);
	private Set<Transaction> transactions = new HashSet<Transaction>(0);
	private Set<MerchantUser> merchantUsers = new HashSet<MerchantUser>(0);
	private Set<PointRewards> pointRewardses_1 = new HashSet<PointRewards>(0);

	public Outlet() {
	}

	public Outlet(long outletid) {
		this.outletid = outletid;
	}

	public Outlet(long outletid, Merchant merchant, MerchantUser merchantUserByLastModifiedByRef,
			MerchantUser merchantUserByAddedByRef, String outletname, BigDecimal phone1, BigDecimal phone2,
			BigDecimal fax, String address, Double lattitude, Double longitude, String category, String openinghours,
			String closinghours, String website, String emailaddress, BigDecimal postalcode, String outletdescription,
			String addedDateTime, String lastModifiedDateTime, String lastModifiedFields,
			Set<PointRewards> pointRewardses, Set<BuyPoint> buyPoints, Set<AssingedVoucher> assingedVouchers,
			Set<Transaction> transactions, Set<MerchantUser> merchantUsers, Set<PointRewards> pointRewardses_1) {
		this.outletid = outletid;
		this.merchant = merchant;
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
		this.merchantUserByAddedByRef = merchantUserByAddedByRef;
		this.outletname = outletname;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.fax = fax;
		this.address = address;
		this.lattitude = lattitude;
		this.longitude = longitude;
		this.category = category;
		this.openinghours = openinghours;
		this.closinghours = closinghours;
		this.website = website;
		this.emailaddress = emailaddress;
		this.postalcode = postalcode;
		this.outletdescription = outletdescription;
		this.addedDateTime = addedDateTime;
		this.lastModifiedDateTime = lastModifiedDateTime;
		this.lastModifiedFields = lastModifiedFields;
		this.pointRewardses = pointRewardses;
		this.buyPoints = buyPoints;
		this.assingedVouchers = assingedVouchers;
		this.transactions = transactions;
		this.merchantUsers = merchantUsers;
		this.pointRewardses_1 = pointRewardses_1;
	}

	@Id

	@Column(name = "outletid", unique = true, nullable = false)
	public long getOutletid() {
		return this.outletid;
	}

	public void setOutletid(long outletid) {
		this.outletid = outletid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "merchant")
	public Merchant getMerchant() {
		return this.merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
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
	@JoinColumn(name = "added_by_ref")
	public MerchantUser getMerchantUserByAddedByRef() {
		return this.merchantUserByAddedByRef;
	}

	public void setMerchantUserByAddedByRef(MerchantUser merchantUserByAddedByRef) {
		this.merchantUserByAddedByRef = merchantUserByAddedByRef;
	}

	@Column(name = "outletname", length = 100)
	public String getOutletname() {
		return this.outletname;
	}

	public void setOutletname(String outletname) {
		this.outletname = outletname;
	}

	@Column(name = "phone1", precision = 131089, scale = 0)
	public BigDecimal getPhone1() {
		return this.phone1;
	}

	public void setPhone1(BigDecimal phone1) {
		this.phone1 = phone1;
	}

	@Column(name = "phone2", precision = 131089, scale = 0)
	public BigDecimal getPhone2() {
		return this.phone2;
	}

	public void setPhone2(BigDecimal phone2) {
		this.phone2 = phone2;
	}

	@Column(name = "fax", precision = 131089, scale = 0)
	public BigDecimal getFax() {
		return this.fax;
	}

	public void setFax(BigDecimal fax) {
		this.fax = fax;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "lattitude", precision = 17, scale = 17)
	public Double getLattitude() {
		return this.lattitude;
	}

	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}

	@Column(name = "longitude", precision = 17, scale = 17)
	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@Column(name = "category")
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "openinghours", length = 100)
	public String getOpeninghours() {
		return this.openinghours;
	}

	public void setOpeninghours(String openinghours) {
		this.openinghours = openinghours;
	}

	@Column(name = "closinghours", length = 100)
	public String getClosinghours() {
		return this.closinghours;
	}

	public void setClosinghours(String closinghours) {
		this.closinghours = closinghours;
	}

	@Column(name = "website")
	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Column(name = "emailaddress")
	public String getEmailaddress() {
		return this.emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	@Column(name = "postalcode", precision = 131089, scale = 0)
	public BigDecimal getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(BigDecimal postalcode) {
		this.postalcode = postalcode;
	}

	@Column(name = "outletdescription")
	public String getOutletdescription() {
		return this.outletdescription;
	}

	public void setOutletdescription(String outletdescription) {
		this.outletdescription = outletdescription;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "outlet")
	public Set<PointRewards> getPointRewardses() {
		return this.pointRewardses;
	}

	public void setPointRewardses(Set<PointRewards> pointRewardses) {
		this.pointRewardses = pointRewardses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "outlet")
	public Set<BuyPoint> getBuyPoints() {
		return this.buyPoints;
	}

	public void setBuyPoints(Set<BuyPoint> buyPoints) {
		this.buyPoints = buyPoints;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "outlet")
	public Set<AssingedVoucher> getAssingedVouchers() {
		return this.assingedVouchers;
	}

	public void setAssingedVouchers(Set<AssingedVoucher> assingedVouchers) {
		this.assingedVouchers = assingedVouchers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "outlet")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "outlet")
	public Set<MerchantUser> getMerchantUsers() {
		return this.merchantUsers;
	}

	public void setMerchantUsers(Set<MerchantUser> merchantUsers) {
		this.merchantUsers = merchantUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "outlet")
	public Set<PointRewards> getPointRewardses_1() {
		return this.pointRewardses_1;
	}

	public void setPointRewardses_1(Set<PointRewards> pointRewardses_1) {
		this.pointRewardses_1 = pointRewardses_1;
	}

}
