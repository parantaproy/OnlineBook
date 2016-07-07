package com.util.MultiSort;
import java.util.*;
public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle1 = new Vehicle("City","Honda",999999.00);
		Vehicle vehicle2 = new Vehicle("alto","maruti",987699.00);
		Vehicle vehicle3 = new Vehicle("A4","Audi",9000000.00);
		Vehicle vehicle4 = new Vehicle("Dezire","Maruti",876543.00);
		Vehicle vehicle5 = new Vehicle("Ecosport","Ford",7865432.00);
		Vehicle vehicle6 = new Vehicle("Duster","Renault",9876098.00);
		
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(vehicle1);
		vehicleList.add(vehicle2);
		vehicleList.add(vehicle3);
		vehicleList.add(vehicle4);
		vehicleList.add(vehicle5);
		vehicleList.add(vehicle6);
	}

}
