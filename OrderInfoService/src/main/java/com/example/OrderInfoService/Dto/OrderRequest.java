package com.example.OrderInfoService.Dto;

public class OrderRequest {

	private String fullName;
	private String age;
	private String orderType;
	private String productName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "OrderRequest [fullName=" + fullName + "," + " age=" + age + "," + " orderType=" + orderType + ","
				+ " productName=" + productName + "]";
	}

}
