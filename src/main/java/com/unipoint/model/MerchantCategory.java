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
 * MerchantCategory generated by hbm2java
 */
@Entity
@Table(name = "merchant_category", schema = "unipointmain")
public class MerchantCategory implements java.io.Serializable {

	private long merchantCategoryId;
	private MerchantUser merchantUserByLastModifiedByRef;
	private MerchantUser merchantUserByAddedByRef;
	private String categoryDescription;
	private String dateTimeAdded;
	private String addedDateTime;
	private String lastModifiedDateTime;
	private String lastModifiedFields;

	public MerchantCategory() {
	}

	public MerchantCategory(long merchantCategoryId) {
		this.merchantCategoryId = merchantCategoryId;
	}

	public MerchantCategory(long merchantCategoryId, MerchantUser merchantUserByLastModifiedByRef,
			MerchantUser merchantUserByAddedByRef, String categoryDescription, String dateTimeAdded,
			String addedDateTime, String lastModifiedDateTime, String lastModifiedFields) {
		this.merchantCategoryId = merchantCategoryId;
		this.merchantUserByLastModifiedByRef = merchantUserByLastModifiedByRef;
		this.merchantUserByAddedByRef = merchantUserByAddedByRef;
		this.categoryDescription = categoryDescription;
		this.dateTimeAdded = dateTimeAdded;
		this.addedDateTime = addedDateTime;
		this.lastModifiedDateTime = lastModifiedDateTime;
		this.lastModifiedFields = lastModifiedFields;
	}

	@Id

	@Column(name = "merchant_category_id", unique = true, nullable = false)
	public long getMerchantCategoryId() {
		return this.merchantCategoryId;
	}

	public void setMerchantCategoryId(long merchantCategoryId) {
		this.merchantCategoryId = merchantCategoryId;
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

	@Column(name = "category_description")
	public String getCategoryDescription() {
		return this.categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Column(name = "date_time_added", length = 200)
	public String getDateTimeAdded() {
		return this.dateTimeAdded;
	}

	public void setDateTimeAdded(String dateTimeAdded) {
		this.dateTimeAdded = dateTimeAdded;
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
