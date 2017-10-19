package com.learning.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "market",schema="public")
public class Market {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="market_sequence")
	@SequenceGenerator(name="market_sequence",sequenceName="market_sequence")
	@Column(name = "market_id")
	private Long marketId;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumns({
		@JoinColumn(name="currency_name", referencedColumnName="name"),
		@JoinColumn(name="country_name", referencedColumnName="country_name")
	})
	private Currency currency;

	@Column(name = "market_name")
	private String marketName;

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public final Currency getCurrency() {
		return currency;
	}

	public final void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
