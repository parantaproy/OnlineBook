package com.app.bean;

public class Mobile {

	String name,model;
	double price;
	long mobileId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String mobile) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getmobileId() {
		return mobileId;
	}
	public void setmobileId(long mobileId) {
		this.mobileId = mobileId;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", model=" + model + ", price=" + price + ", mobileId=" + mobileId + "]";
	}
	
}
