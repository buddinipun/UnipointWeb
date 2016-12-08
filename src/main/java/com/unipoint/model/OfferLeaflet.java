package com.unipoint.model;
// Generated Oct 18, 2016 4:59:22 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * OfferLeaflet generated by hbm2java
 */
@Entity
@Table(name = "offer_leaflet", schema = "unipointmain")
public class OfferLeaflet implements java.io.Serializable {

	private OfferLeafletId id;
	private Leaflet leaflet;
	private MerchantUser merchantUserByAddedByRef;
	private MerchantUser merchantUserByLastModifiedByRef;
	private Offer offer;

	public OfferLeaflet() {
	}

	public OfferLeaflet(OfferLeafletId id) {
		this.id = id;
	}

	public OfferLeaflet(OfferLeafletId id, Leaflet leaflet, MerchantUser merchantUserByAddedByRef,
			MerchantUser merchantUserByLastModifiedByRef, Offer offer) {
		this.id = id;
		this.leaflet = leaflet;
		this.merchantUserByAddedByRef = merchantUserByAddedByRef;
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
		this.offer = offer;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "offerId", column = @Column(name = "offerID")),
			@AttributeOverride(name = "leafletId", column = @Column(name = "leafletID")),
			@AttributeOverride(name = "addedByRef", column = @Column(name = "added_by_ref")),
			@AttributeOverride(name = "addedDateTime", column = @Column(name = "added_date_time", length = 50)),
			@AttributeOverride(name = "lastModifiedByRef", column = @Column(name = "last_modified_by_ref")),
			@AttributeOverride(name = "lastModifiedDateTime", column = @Column(name = "last_modified_date_time", length = 50)),
			@AttributeOverride(name = "lastModifiedFields", column = @Column(name = "last_modified_fields")) })
	public OfferLeafletId getId() {
		return this.id;
	}

	public void setId(OfferLeafletId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "leafletID", insertable = false, updatable = false)
	public Leaflet getLeaflet() {
		return this.leaflet;
	}

	public void setLeaflet(Leaflet leaflet) {
		this.leaflet = leaflet;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "added_by_ref", insertable = false, updatable = false)
	public MerchantUser getMerchantUserByAddedByRef() {
		return this.merchantUserByAddedByRef;
	}

	public void setMerchantUserByAddedByRef(MerchantUser merchantUserByAddedByRef) {
		this.merchantUserByAddedByRef = merchantUserByAddedByRef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "last_modified_by_ref", insertable = false, updatable = false)
	public MerchantUser getMerchantUserByLastModifiedByRef() {
		return this.merchantUserByLastModifiedByRef;
	}

	public void setMerchantUserByLastModifiedByRef(MerchantUser merchantUserByLastModifiedByRef) {
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "offerID", insertable = false, updatable = false)
	public Offer getOffer() {
		return this.offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

}
