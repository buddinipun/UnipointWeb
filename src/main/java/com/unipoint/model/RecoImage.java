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
 * RecoImage generated by hbm2java
 */
@Entity
@Table(name = "reco_image", schema = "unipointmain")
public class RecoImage implements java.io.Serializable {

	private long imageId;
	private Offer offer;

	public RecoImage() {
	}

	public RecoImage(long imageId) {
		this.imageId = imageId;
	}

	public RecoImage(long imageId, Offer offer) {
		this.imageId = imageId;
		this.offer = offer;
	}

	@Id

	@Column(name = "ImageID", nullable = false)
	public long getImageId() {
		return this.imageId;
	}

	public void setImageId(long imageId) {
		this.imageId = imageId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "offerID")
	public Offer getOffer() {
		return this.offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

}
