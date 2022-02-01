package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.util.Date;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long visited;

	private Integer deals;

	private Double amount;

	private Date date;

	private SellerDTO seller;

	public SaleDTO() {
	}

	public SaleDTO(Long id, Long visited, Integer deals, Double amount, Date date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.setSeller(seller);
	}

	public SaleDTO(Sale entity) {
		this.id = entity.getId();
		this.visited = entity.getVisited();
		this.deals = entity.getDeals();
		this.amount = entity.getAmount();
		this.date = entity.getDate();
		this.setSeller(new SellerDTO(entity.getSeller()));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

}
