package Entities.Concrete;

import java.time.LocalDate;

import Entities.Entity;

public class Order implements Entity {
	int id;
	int customerId;
	int gameId;
	int campaignId;
	LocalDate date;

	public Order(final int id, final int customerId, final int gameId, final int campaignId, final LocalDate date) {
		this(id, customerId, gameId, date);
		this.campaignId = campaignId;
	}

	public Order(final int id, final int customerId, final int gameId, final LocalDate date) {
		this.id = id;
		this.customerId = customerId;
		this.gameId = gameId;
		this.date = date;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public LocalDate getDate() {
		return date;
	}

	public int getGameId() {
		return gameId;
	}

	public int getId() {
		return id;
	}

	public void setCampaignId(final int campaignId) {
		this.campaignId = campaignId;
	}

	public void setCustomerId(final int customerId) {
		this.customerId = customerId;
	}

	public void setDate(final LocalDate date) {
		this.date = date;
	}

	public void setGameId(final int gameId) {
		this.gameId = gameId;
	}

	public void setId(final int id) {
		this.id = id;
	}

}
