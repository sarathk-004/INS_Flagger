package com.insFlagger.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class ShipDetails {

	/*
	 * 1. ShipName : Name of the ship
2. CountryEnteringFrom : Country form which ship is entering from
3. Latitude : Latitude at which ship is pointed
4. Longitude : Longitude at which ship is pointed
5. PortReportedAt : Port in India ship is reported at
6. StateOfThePort : Sate in India ship is reported at
7. ProminentColorOnTheShip : Color on the ship
8. ContainersVisibleOnTheShip : Is container visible on the ship in the sattelite image
9. ApproximateLengthOfTheShipInFeet : ApproximateLengthOfTheShipInFeet
10. ApproximateWidthOfTheShipInFeet : ApproximateWidthOfTheShipInFeet
11. ApproximateDraftOfTheShipInFeet : ApproximateDraftOfTheShipInFeet
12. ApproximateCapacityOfTheShipInTons : ApproximateCapacityOfTheShipInTons
13. ApproximateNumberOfPeopleOnTheShipVisible : Approximate number of people on the ship visible in the sattelite image
14. IsFlagged : Is this ship Red flagged or not
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String shipName;
	private String countryEnteringFrom;
	private String latitude;
	private String longitude;
	private String portReportedAt;
	private String stateOfThePort;
	private String prominentColorOnTheShip;
	private String containersVisibleOnTheShip;
	private Long approximateLengthOfTheShipInFeet;
	private Long approximateWidthOfTheShipInFeet;
	private Long approximateDraftOfTheShipInFeet;
	private Long approximateCapacityOfTheShipInTons;
	private Long approximateNumberOfPeopleOnTheShipVisible;
	private String isFlagged;
	private String accuracyOfTheCurrentModel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getCountryEnteringFrom() {
		return countryEnteringFrom;
	}
	public void setCountryEnteringFrom(String countryEnteringFrom) {
		this.countryEnteringFrom = countryEnteringFrom;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getPortReportedAt() {
		return portReportedAt;
	}
	public void setPortReportedAt(String portReportedAt) {
		this.portReportedAt = portReportedAt;
	}
	public String getStateOfThePort() {
		return stateOfThePort;
	}
	public void setStateOfThePort(String stateOfThePort) {
		this.stateOfThePort = stateOfThePort;
	}
	public String getProminentColorOnTheShip() {
		return prominentColorOnTheShip;
	}
	public void setProminentColorOnTheShip(String prominentColorOnTheShip) {
		this.prominentColorOnTheShip = prominentColorOnTheShip;
	}
	public String getContainersVisibleOnTheShip() {
		return containersVisibleOnTheShip;
	}
	public void setContainersVisibleOnTheShip(String containersVisibleOnTheShip) {
		this.containersVisibleOnTheShip = containersVisibleOnTheShip;
	}
	public Long getApproximateLengthOfTheShipInFeet() {
		return approximateLengthOfTheShipInFeet;
	}
	public void setApproximateLengthOfTheShipInFeet(Long approximateLengthOfTheShipInFeet) {
		this.approximateLengthOfTheShipInFeet = approximateLengthOfTheShipInFeet;
	}
	public Long getApproximateWidthOfTheShipInFeet() {
		return approximateWidthOfTheShipInFeet;
	}
	public void setApproximateWidthOfTheShipInFeet(Long approximateWidthOfTheShipInFeet) {
		this.approximateWidthOfTheShipInFeet = approximateWidthOfTheShipInFeet;
	}
	public Long getApproximateDraftOfTheShipInFeet() {
		return approximateDraftOfTheShipInFeet;
	}
	public void setApproximateDraftOfTheShipInFeet(Long approximateDraftOfTheShipInFeet) {
		this.approximateDraftOfTheShipInFeet = approximateDraftOfTheShipInFeet;
	}
	public Long getApproximateCapacityOfTheShipInTons() {
		return approximateCapacityOfTheShipInTons;
	}
	public void setApproximateCapacityOfTheShipInTons(Long approximateCapacityOfTheShipInTons) {
		this.approximateCapacityOfTheShipInTons = approximateCapacityOfTheShipInTons;
	}
	public Long getApproximateNumberOfPeopleOnTheShipVisible() {
		return approximateNumberOfPeopleOnTheShipVisible;
	}
	public void setApproximateNumberOfPeopleOnTheShipVisible(Long approximateNumberOfPeopleOnTheShipVisible) {
		this.approximateNumberOfPeopleOnTheShipVisible = approximateNumberOfPeopleOnTheShipVisible;
	}
	public String getIsFlagged() {
		return isFlagged;
	}
	public void setIsFlagged(String isFlagged) {
		this.isFlagged = isFlagged;
	}
	public String getAccuracyOfTheCurrentModel() {
		return accuracyOfTheCurrentModel;
	}
	public void setAccuracyOfTheCurrentModel(String accuracyOfTheCurrentModel) {
		this.accuracyOfTheCurrentModel = accuracyOfTheCurrentModel;
	}
	
	
}
