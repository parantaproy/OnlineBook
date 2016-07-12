/**
 * 
 */
package com.app.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.app.bean.Mobile;
import com.app.exceptions.ModelNotFoundException;
import com.app.service.Imobile;
import com.app.service.MobileImpl;

/**
 * @author proy3
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Imobile obj = new MobileImpl();
		System.out.println("enter details");
		Scanner sc = new Scanner(System.in); 
		for (int i = 0; i < 2; i++) {
			Mobile mobile = new Mobile();
			mobile.setName(sc.next());
			mobile.setPrice(sc.nextDouble());
			mobile.setModel(sc.next());
			mobile.setmobileId(sc.nextLong());
			obj.addMobile(mobile);
			System.out.println("added successfully");
		}
	ArrayList<Mobile> al = (ArrayList<Mobile>)obj.getAllMobiles();
		Iterator<Mobile> it = al.iterator();
		while (it.hasNext()) {
			Mobile mobile = it.next();
			System.out.println(mobile);
		}
		System.out.println("--------");
		try {
			al = (ArrayList<Mobile>)obj.getMobilesByModel("z");
		} catch (ModelNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		it = al.iterator();
		while (it.hasNext()) {
			Mobile mobile = it.next();
			System.out.println(mobile);
		}		
	}
	}


