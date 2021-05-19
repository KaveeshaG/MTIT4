package com.example.CustomerInfoService.Dto;

public class CustomerRequest {

	private String fullName;
	private String age;

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

	@Override
	public String toString() {
		return "UserRequest [fullName=" + fullName + ", age=" + age + "]";
	}

}
