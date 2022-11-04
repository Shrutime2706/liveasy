package com.example.workshop.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "load")
public class Load {


	@Column(name = "shipper_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private Integer shipperId;

	@Column(name = "loading_point")
	private String loadingPoint;

	@Column(name = "unloading_point")
	private String unloadingPoint;

	@Column(name = "product_type")
	private String productType;

	@Column(name = "truck_type")
	private String truckType;

	@Column(name = "no_of_trucks")
	private Long noOfTrucks;

	@Column(name = "weight")
	private Long weight;

	@Column(name = "comment")
	private String comment;

	@Column(name = "date")
	private Date date;

	@Override
	public String toString() {
		return "Load{" +
				"shipperId=" + shipperId +
				", loadingPoint='" + loadingPoint + '\'' +
				", unloadingPoint='" + unloadingPoint + '\'' +
				", productType='" + productType + '\'' +
				", truckType='" + truckType + '\'' +
				", noOfTrucks=" + noOfTrucks +
				", weight=" + weight +
				", comment='" + comment + '\'' +
				", date=" + date +
				'}';
	}

	public Integer getShipperId() {
		return shipperId;
	}

	public void setShipperId(Integer shipperId) {
		this.shipperId = shipperId;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public Long getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(Long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
