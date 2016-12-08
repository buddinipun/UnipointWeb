package com.unipoint.model;
// Generated Oct 18, 2016 4:59:22 PM by Hibernate Tools 5.1.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * UnipointCustomerProfile generated by hbm2java
 */
@Entity
@Table(name = "unipoint_customer_profile", schema = "unipointmain", uniqueConstraints = @UniqueConstraint(columnNames = "mobilephonenumberprimary"))
public class UnipointCustomerProfile implements java.io.Serializable {

	private long unipointcustomerid;
	private String registrationdatetime;
	private BigDecimal mobilephonenumberprimary;
	private BigDecimal mobilephonenumbersecondary;
	private String customerfirstname;
	private String customerlastname;
	private String gender;
	private String profileimage;
	private String coverimage;
	private String interestareas;
	private String country;
	private String countrycode;
	private String postaladdress;
	private String email;
	private String coaccountenabled;
	private Long coaccountid;
	private String coaccountactivateddate;
	private String lastsession;
	private String devicetoken;
	private String extrafield4;
	private String enabled;
	private String userUuid;
	private String extrafield1;
	private String extrafield2;
	private String extrafield3;
	private String addedDateTime;
	private String lastModifiedDateTime;
	private String lastModifiedFields;
	private Date birthdate;
	private Set<PasswordChangeRequest> passwordChangeRequests = new HashSet<PasswordChangeRequest>(0);
	private Set<PointRewards> pointRewardses = new HashSet<PointRewards>(0);
	private Set<CardLog> cardLogs = new HashSet<CardLog>(0);
	private Set<Transaction> transactions = new HashSet<Transaction>(0);
	private UnipointcustomerAdvanced unipointcustomerAdvanced;
	private Set<SubscribeMerchant> subscribeMerchants = new HashSet<SubscribeMerchant>(0);
	private Set<BuzzedMe> buzzedMes = new HashSet<BuzzedMe>(0);
	private Set<AppInvite> appInvites = new HashSet<AppInvite>(0);
	private Set<OfferReservation> offerReservations = new HashSet<OfferReservation>(0);
	private Set<CustomerRequests> customerRequestses = new HashSet<CustomerRequests>(0);
	private Set<Wishlist> wishlists = new HashSet<Wishlist>(0);
	private Set<DisabledCustomer> disabledCustomers = new HashSet<DisabledCustomer>(0);
	private Set<AssingedVoucher> assingedVouchers = new HashSet<AssingedVoucher>(0);
	private Set<AssignedCoupons> assignedCouponses = new HashSet<AssignedCoupons>(0);
	private Set<BuyPoint> buyPoints = new HashSet<BuyPoint>(0);
	private Set<OfferClaim> offerClaims = new HashSet<OfferClaim>(0);
	private Set<MerchantCustomer> merchantCustomers = new HashSet<MerchantCustomer>(0);

	public UnipointCustomerProfile() {
	}

	public UnipointCustomerProfile(long unipointcustomerid, BigDecimal mobilephonenumberprimary) {
		this.unipointcustomerid = unipointcustomerid;
		this.mobilephonenumberprimary = mobilephonenumberprimary;
	}

	public UnipointCustomerProfile(long unipointcustomerid, String registrationdatetime,
			BigDecimal mobilephonenumberprimary, BigDecimal mobilephonenumbersecondary, String customerfirstname,
			String customerlastname, String gender, String profileimage, String coverimage, String interestareas,
			String country, String countrycode, String postaladdress, String email, String coaccountenabled,
			Long coaccountid, String coaccountactivateddate, String lastsession, String devicetoken, String extrafield4,
			String enabled, String userUuid, String extrafield1, String extrafield2, String extrafield3,
			String addedDateTime, String lastModifiedDateTime, String lastModifiedFields,
			Set<PasswordChangeRequest> passwordChangeRequests, Set<PointRewards> pointRewardses, Set<CardLog> cardLogs,
			Set<Transaction> transactions, UnipointcustomerAdvanced unipointcustomerAdvanced,
			Set<SubscribeMerchant> subscribeMerchants, Set<BuzzedMe> buzzedMes, Set<AppInvite> appInvites,
			Set<OfferReservation> offerReservations, Set<CustomerRequests> customerRequestses, Set<Wishlist> wishlists,
			Set<DisabledCustomer> disabledCustomers, Set<AssingedVoucher> assingedVouchers,
			Set<AssignedCoupons> assignedCouponses, Set<BuyPoint> buyPoints, Set<OfferClaim> offerClaims,
			Set<MerchantCustomer> merchantCustomers) {
		this.unipointcustomerid = unipointcustomerid;
		this.registrationdatetime = registrationdatetime;
		this.mobilephonenumberprimary = mobilephonenumberprimary;
		this.mobilephonenumbersecondary = mobilephonenumbersecondary;
		this.customerfirstname = customerfirstname;
		this.customerlastname = customerlastname;
		this.gender = gender;
		this.profileimage = profileimage;
		this.coverimage = coverimage;
		this.interestareas = interestareas;
		this.country = country;
		this.countrycode = countrycode;
		this.postaladdress = postaladdress;
		this.email = email;
		this.coaccountenabled = coaccountenabled;
		this.coaccountid = coaccountid;
		this.coaccountactivateddate = coaccountactivateddate;
		this.lastsession = lastsession;
		this.devicetoken = devicetoken;
		this.extrafield4 = extrafield4;
		this.enabled = enabled;
		this.userUuid = userUuid;
		this.extrafield1 = extrafield1;
		this.extrafield2 = extrafield2;
		this.extrafield3 = extrafield3;
		this.addedDateTime = addedDateTime;
		this.lastModifiedDateTime = lastModifiedDateTime;
		this.lastModifiedFields = lastModifiedFields;
		this.passwordChangeRequests = passwordChangeRequests;
		this.pointRewardses = pointRewardses;
		this.cardLogs = cardLogs;
		this.transactions = transactions;
		this.unipointcustomerAdvanced = unipointcustomerAdvanced;
		this.subscribeMerchants = subscribeMerchants;
		this.buzzedMes = buzzedMes;
		this.appInvites = appInvites;
		this.offerReservations = offerReservations;
		this.customerRequestses = customerRequestses;
		this.wishlists = wishlists;
		this.disabledCustomers = disabledCustomers;
		this.assingedVouchers = assingedVouchers;
		this.assignedCouponses = assignedCouponses;
		this.buyPoints = buyPoints;
		this.offerClaims = offerClaims;
		this.merchantCustomers = merchantCustomers;
	}

	@Id

	@Column(name = "unipointcustomerid", unique = true, nullable = false)
	public long getUnipointcustomerid() {
		return this.unipointcustomerid;
	}

	public void setUnipointcustomerid(long unipointcustomerid) {
		this.unipointcustomerid = unipointcustomerid;
	}

	@Column(name = "registrationdatetime", length = 100)
	public String getRegistrationdatetime() {
		return this.registrationdatetime;
	}

	public void setRegistrationdatetime(String registrationdatetime) {
		this.registrationdatetime = registrationdatetime;
	}

	@Column(name = "mobilephonenumberprimary", unique = true, nullable = false, precision = 131089, scale = 0)
	public BigDecimal getMobilephonenumberprimary() {
		return this.mobilephonenumberprimary;
	}

	public void setMobilephonenumberprimary(BigDecimal mobilephonenumberprimary) {
		this.mobilephonenumberprimary = mobilephonenumberprimary;
	}

	@Column(name = "mobilephonenumbersecondary", precision = 131089, scale = 0)
	public BigDecimal getMobilephonenumbersecondary() {
		return this.mobilephonenumbersecondary;
	}

	public void setMobilephonenumbersecondary(BigDecimal mobilephonenumbersecondary) {
		this.mobilephonenumbersecondary = mobilephonenumbersecondary;
	}

	@Column(name = "customerfirstname")
	public String getCustomerfirstname() {
		return this.customerfirstname;
	}

	public void setCustomerfirstname(String customerfirstname) {
		this.customerfirstname = customerfirstname;
	}

	@Column(name = "customerlastname")
	public String getCustomerlastname() {
		return this.customerlastname;
	}

	public void setCustomerlastname(String customerlastname) {
		this.customerlastname = customerlastname;
	}

	@Column(name = "gender", length = 10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "profileimage")
	public String getProfileimage() {
		return this.profileimage;
	}

	public void setProfileimage(String profileimage) {
		this.profileimage = profileimage;
	}

	@Column(name = "coverimage")
	public String getCoverimage() {
		return this.coverimage;
	}

	public void setCoverimage(String coverimage) {
		this.coverimage = coverimage;
	}

	@Column(name = "interestareas")
	public String getInterestareas() {
		return this.interestareas;
	}

	public void setInterestareas(String interestareas) {
		this.interestareas = interestareas;
	}

	@Column(name = "country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "countrycode")
	public String getCountrycode() {
		return this.countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	@Column(name = "postaladdress")
	public String getPostaladdress() {
		return this.postaladdress;
	}

	public void setPostaladdress(String postaladdress) {
		this.postaladdress = postaladdress;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "coaccountenabled", length = 5)
	public String getCoaccountenabled() {
		return this.coaccountenabled;
	}

	public void setCoaccountenabled(String coaccountenabled) {
		this.coaccountenabled = coaccountenabled;
	}

	@Column(name = "coaccountid")
	public Long getCoaccountid() {
		return this.coaccountid;
	}

	public void setCoaccountid(Long coaccountid) {
		this.coaccountid = coaccountid;
	}

	@Column(name = "coaccountactivateddate", length = 100)
	public String getCoaccountactivateddate() {
		return this.coaccountactivateddate;
	}

	public void setCoaccountactivateddate(String coaccountactivateddate) {
		this.coaccountactivateddate = coaccountactivateddate;
	}

	@Column(name = "lastsession")
	public String getLastsession() {
		return this.lastsession;
	}

	public void setLastsession(String lastsession) {
		this.lastsession = lastsession;
	}

	@Column(name = "devicetoken")
	public String getDevicetoken() {
		return this.devicetoken;
	}

	public void setDevicetoken(String devicetoken) {
		this.devicetoken = devicetoken;
	}

	@Column(name = "extrafield4")
	public String getExtrafield4() {
		return this.extrafield4;
	}

	public void setExtrafield4(String extrafield4) {
		this.extrafield4 = extrafield4;
	}

	@Column(name = "enabled", length = 5)
	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	@Column(name = "user_uuid", length = 64)
	public String getUserUuid() {
		return this.userUuid;
	}

	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}

	@Column(name = "extrafield1")
	public String getExtrafield1() {
		return this.extrafield1;
	}

	public void setExtrafield1(String extrafield1) {
		this.extrafield1 = extrafield1;
	}

	@Column(name = "extrafield2")
	public String getExtrafield2() {
		return this.extrafield2;
	}

	public void setExtrafield2(String extrafield2) {
		this.extrafield2 = extrafield2;
	}

	@Column(name = "extrafield3")
	public String getExtrafield3() {
		return this.extrafield3;
	}

	public void setExtrafield3(String extrafield3) {
		this.extrafield3 = extrafield3;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<PasswordChangeRequest> getPasswordChangeRequests() {
		return this.passwordChangeRequests;
	}

	public void setPasswordChangeRequests(Set<PasswordChangeRequest> passwordChangeRequests) {
		this.passwordChangeRequests = passwordChangeRequests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<PointRewards> getPointRewardses() {
		return this.pointRewardses;
	}

	public void setPointRewardses(Set<PointRewards> pointRewardses) {
		this.pointRewardses = pointRewardses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<CardLog> getCardLogs() {
		return this.cardLogs;
	}

	public void setCardLogs(Set<CardLog> cardLogs) {
		this.cardLogs = cardLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public UnipointcustomerAdvanced getUnipointcustomerAdvanced() {
		return this.unipointcustomerAdvanced;
	}

	public void setUnipointcustomerAdvanced(UnipointcustomerAdvanced unipointcustomerAdvanced) {
		this.unipointcustomerAdvanced = unipointcustomerAdvanced;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<SubscribeMerchant> getSubscribeMerchants() {
		return this.subscribeMerchants;
	}

	public void setSubscribeMerchants(Set<SubscribeMerchant> subscribeMerchants) {
		this.subscribeMerchants = subscribeMerchants;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<BuzzedMe> getBuzzedMes() {
		return this.buzzedMes;
	}

	public void setBuzzedMes(Set<BuzzedMe> buzzedMes) {
		this.buzzedMes = buzzedMes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<AppInvite> getAppInvites() {
		return this.appInvites;
	}

	public void setAppInvites(Set<AppInvite> appInvites) {
		this.appInvites = appInvites;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<OfferReservation> getOfferReservations() {
		return this.offerReservations;
	}

	public void setOfferReservations(Set<OfferReservation> offerReservations) {
		this.offerReservations = offerReservations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<CustomerRequests> getCustomerRequestses() {
		return this.customerRequestses;
	}

	public void setCustomerRequestses(Set<CustomerRequests> customerRequestses) {
		this.customerRequestses = customerRequestses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<Wishlist> getWishlists() {
		return this.wishlists;
	}

	public void setWishlists(Set<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<DisabledCustomer> getDisabledCustomers() {
		return this.disabledCustomers;
	}

	public void setDisabledCustomers(Set<DisabledCustomer> disabledCustomers) {
		this.disabledCustomers = disabledCustomers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<AssingedVoucher> getAssingedVouchers() {
		return this.assingedVouchers;
	}

	public void setAssingedVouchers(Set<AssingedVoucher> assingedVouchers) {
		this.assingedVouchers = assingedVouchers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<AssignedCoupons> getAssignedCouponses() {
		return this.assignedCouponses;
	}

	public void setAssignedCouponses(Set<AssignedCoupons> assignedCouponses) {
		this.assignedCouponses = assignedCouponses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<BuyPoint> getBuyPoints() {
		return this.buyPoints;
	}

	public void setBuyPoints(Set<BuyPoint> buyPoints) {
		this.buyPoints = buyPoints;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<OfferClaim> getOfferClaims() {
		return this.offerClaims;
	}

	public void setOfferClaims(Set<OfferClaim> offerClaims) {
		this.offerClaims = offerClaims;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unipointCustomerProfile")
	public Set<MerchantCustomer> getMerchantCustomers() {
		return this.merchantCustomers;
	}

	public void setMerchantCustomers(Set<MerchantCustomer> merchantCustomers) {
		this.merchantCustomers = merchantCustomers;
	}
	
	@Column(name = "birthdate")
	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

}