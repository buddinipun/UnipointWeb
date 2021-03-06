package com.unipoint.model;
// Generated Oct 18, 2016 4:59:22 PM by Hibernate Tools 5.1.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Currency generated by hbm2java
 */
@Entity
@Table(name = "currency", schema = "unipointmain")
public class Currency implements java.io.Serializable {

	private String currencyCode;
	private String currency;
	private String country;
	private String countryPhoneCode;
	private Set<PointConversion> pointConversions = new HashSet<PointConversion>(0);

	public Currency() {
	}

	public Currency(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Currency(String currencyCode, String currency, String country, String countryPhoneCode,
			Set<PointConversion> pointConversions) {
		this.currencyCode = currencyCode;
		this.currency = currency;
		this.country = country;
		this.countryPhoneCode = countryPhoneCode;
		this.pointConversions = pointConversions;
	}

	@Id

	@Column(name = "currency_code", unique = true, nullable = false, length = 10)
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Column(name = "currency")
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "country_phone_code", length = 5)
	public String getCountryPhoneCode() {
		return this.countryPhoneCode;
	}

	public void setCountryPhoneCode(String countryPhoneCode) {
		this.countryPhoneCode = countryPhoneCode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
	public Set<PointConversion> getPointConversions() {
		return this.pointConversions;
	}

	public void setPointConversions(Set<PointConversion> pointConversions) {
		this.pointConversions = pointConversions;
	}

}
