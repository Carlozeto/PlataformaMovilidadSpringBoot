package com.example.demo.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class bus {

	@Id
	private String busPlaque;
	private String busLicenseId;
	private String busManufacturer;
	private String busManufacturerModel;
	private String busCC;
	private String busColor;
	private String busVehicleClass;
	private String busMotorId;
	private String busChasisId;
	private String busCapacity;
	private String busOwnerId;
	private String busDriverId;
	private int busEnterpriseId;
	private int busRouteId;
	
	public bus(){
		   super();
		}
	
	public bus(String busPlaque, String busLicenseId, String busManufacturer, String busManufacturerModel, String busCC,
			String busColor, String busVehicleClass, String busMotorId, String busChasisId, String busCapacity,
			String busOwnerId, String busDriverId, int busEnterpriseId, int busRouteId) {
		super();
		this.busPlaque = busPlaque;
		this.busLicenseId = busLicenseId;
		this.busManufacturer = busManufacturer;
		this.busManufacturerModel = busManufacturerModel;
		this.busCC = busCC;
		this.busColor = busColor;
		this.busVehicleClass = busVehicleClass;
		this.busMotorId = busMotorId;
		this.busChasisId = busChasisId;
		this.busCapacity = busCapacity;
		this.busOwnerId =  busOwnerId;
		this.busDriverId = busDriverId;
		this.busEnterpriseId = busEnterpriseId;
		this.busRouteId = busRouteId;
	}
	public bus(String busPlaque, String busLicenseId, String busDriverId, int busEnterpriseId, int busRouteId) {
		super();
		this.busPlaque = busPlaque;
		this.busLicenseId = busLicenseId;
		this.busDriverId = busDriverId;
		this.busEnterpriseId = busEnterpriseId;
		this.busRouteId = busRouteId;
	}
	public String getBusPlaque() {
		return busPlaque;
	}
	public void setBusPlaque(String busPlaque) {
		this.busPlaque = busPlaque;
	}
	public String getBusLicenseId() {
		return busLicenseId;
	}
	public void setBusLicenseId(String busLicenseId) {
		this.busLicenseId = busLicenseId;
	}
	public String getBusManufacturer() {
		return busManufacturer;
	}
	public void setBusManufacturer(String busManufacturer) {
		this.busManufacturer = busManufacturer;
	}
	public String getBusManufacturerModel() {
		return busManufacturerModel;
	}
	public void setBusManufacturerModel(String busManufacturerModel) {
		this.busManufacturerModel = busManufacturerModel;
	}
	public String getBusCC() {
		return busCC;
	}
	public void setBusCC(String busCC) {
		this.busCC = busCC;
	}
	public String getBusColor() {
		return busColor;
	}
	public String getBusOwnerId() {
		return busOwnerId;
	}

	public void setBusOwnerId(String busOwnerId) {
		this.busOwnerId = busOwnerId;
	}

	public void setBusColor(String busColor) {
		this.busColor = busColor;
	}
	public String getBusVehicleClass() {
		return busVehicleClass;
	}
	public void setBusVehicleClass(String busVehicleClass) {
		this.busVehicleClass = busVehicleClass;
	}
	public String getBusMotorId() {
		return busMotorId;
	}
	public void setBusMotorId(String busMotorId) {
		this.busMotorId = busMotorId;
	}
	public String getBusChasisId() {
		return busChasisId;
	}
	public void setBusChasisId(String busChasisId) {
		this.busChasisId = busChasisId;
	}
	public String getBusCapacity() {
		return busCapacity;
	}
	public void setBusCapacity(String busCapacity) {
		this.busCapacity = busCapacity;
	}
	public String getBusDriverId() {
		return busDriverId;
	}
	public void setBusDriverId(String busDriverId) {
		this.busDriverId = busDriverId;
	}
	public int getBusEnterpriseId() {
		return busEnterpriseId;
	}
	public void setBusEnterpriseId(int busEnterpriseId) {
		this.busEnterpriseId = busEnterpriseId;
	}
	public int getBusRouteId() {
		return busRouteId;
	}
	public void setBusRouteId(int busRouteId) {
		this.busRouteId = busRouteId;
	}
	
}
