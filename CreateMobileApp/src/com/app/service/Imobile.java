/**
 * 
 */
package com.app.service;
import java.util.*;

import com.app.bean.Mobile;
import com.app.exceptions.ModelNotFoundException;

/**
 * @author proy3
 *
 */
public interface Imobile {

	void addMobile(Mobile mobile);
	List<Mobile> getAllMobiles();
	List<Mobile> getMobilesByModel(String model) throws ModelNotFoundException;
	
}
