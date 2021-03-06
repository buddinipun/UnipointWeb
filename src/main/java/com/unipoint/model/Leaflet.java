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
 * Leaflet generated by hbm2java
 */
@Entity
@Table(name = "leaflet", schema = "unipointmain")
public class Leaflet implements java.io.Serializable {

	private long leafletId;
	private MerchantUser merchantUserByLastModifiedByRef;
	private MerchantUser merchantUserByAddedByRef;
	private String imgUrl1;
	private String imgUrl2;
	private String imgUrl3;
	private String videoUrl;
	private String payPalUrl;
	private String addedDateTime;
	private String lastModifiedDateTime;
	private String lastModifiedFields;
	private Set<OfferLeaflet> offerLeaflets = new HashSet<OfferLeaflet>(0);

	public Leaflet() {
	}

	public Leaflet(long leafletId) {
		this.leafletId = leafletId;
	}

	public Leaflet(long leafletId, MerchantUser merchantUserByLastModifiedByRef, MerchantUser merchantUserByAddedByRef,
			String imgUrl1, String imgUrl2, String imgUrl3, String videoUrl, String payPalUrl, String addedDateTime,
			String lastModifiedDateTime, String lastModifiedFields, Set<OfferLeaflet> offerLeaflets) {
		this.leafletId = leafletId;
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
		this.merchantUserByAddedByRef = merchantUserByAddedByRef;
		this.imgUrl1 = imgUrl1;
		this.imgUrl2 = imgUrl2;
		this.imgUrl3 = imgUrl3;
		this.videoUrl = videoUrl;
		this.payPalUrl = payPalUrl;
		this.addedDateTime = addedDateTime;
		this.lastModifiedDateTime = lastModifiedDateTime;
		this.lastModifiedFields = lastModifiedFields;
		this.offerLeaflets = offerLeaflets;
	}

	@Id

	@Column(name = "leafletID", nullable = false)
	public long getLeafletId() {
		return this.leafletId;
	}

	public void setLeafletId(long leafletId) {
		this.leafletId = leafletId;
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

	@Column(name = "imgUrl1", length = 200)
	public String getImgUrl1() {
		return this.imgUrl1;
	}

	public void setImgUrl1(String imgUrl1) {
		this.imgUrl1 = imgUrl1;
	}

	@Column(name = "imgUrl2", length = 200)
	public String getImgUrl2() {
		return this.imgUrl2;
	}

	public void setImgUrl2(String imgUrl2) {
		this.imgUrl2 = imgUrl2;
	}

	@Column(name = "imgUrl3", length = 200)
	public String getImgUrl3() {
		return this.imgUrl3;
	}

	public void setImgUrl3(String imgUrl3) {
		this.imgUrl3 = imgUrl3;
	}

	@Column(name = "videoUrl", length = 400)
	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	@Column(name = "payPalUrl", length = 400)
	public String getPayPalUrl() {
		return this.payPalUrl;
	}

	public void setPayPalUrl(String payPalUrl) {
		this.payPalUrl = payPalUrl;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "leaflet")
	public Set<OfferLeaflet> getOfferLeaflets() {
		return this.offerLeaflets;
	}

	public void setOfferLeaflets(Set<OfferLeaflet> offerLeaflets) {
		this.offerLeaflets = offerLeaflets;
	}

}
