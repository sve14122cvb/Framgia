package com.framgia.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author toandk
 */
public class Product implements java.io.Serializable {

	private int id;
	private Shop shop;
	private String name;
	private String detail;
	private Double price;
	private String image;
	private Date date;
	private Integer status;
	private Set<GroupProduct> groupProducts = new HashSet<GroupProduct>(0);
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

	public Product() {
	}

	public Product(int id, Shop shop) {
		this.id = id;
		this.shop = shop;
	}

	public Product(int id, Shop shop, String name, String detail, Double price, String image, Date date, Integer status,
			Set<GroupProduct> groupProducts, Set<OrderDetail> orderDetails) {
		this.id = id;
		this.shop = shop;
		this.name = name;
		this.detail = detail;
		this.price = price;
		this.image = image;
		this.date = date;
		this.status = status;
		this.groupProducts = groupProducts;
		this.orderDetails = orderDetails;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set<GroupProduct> getGroupProducts() {
		return this.groupProducts;
	}

	public void setGroupProducts(Set<GroupProduct> groupProducts) {
		this.groupProducts = groupProducts;
	}

	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}