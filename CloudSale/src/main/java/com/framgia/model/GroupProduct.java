package com.framgia.model;

/**
 * @author toandk
 */
public class GroupProduct implements java.io.Serializable {

	private Integer id;
	private Product product;
	private String name;
	private String content;
	private String image;
	private Integer order;
	private Integer status;

	public GroupProduct() {
	}

	public GroupProduct(Product product) {
		this.product = product;
	}

	public GroupProduct(Product product, String name, String content, String image, Integer order, Integer status) {
		this.product = product;
		this.name = name;
		this.content = content;
		this.image = image;
		this.order = order;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
