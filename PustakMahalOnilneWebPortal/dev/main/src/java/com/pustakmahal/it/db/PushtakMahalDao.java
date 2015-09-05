/**
 * 
 */
package com.pustakmahal.it.db;

import java.util.Vector;

import com.pustakmahal.it.model.UserInfo;

/**
 * @author Adrish Bhattacharyay
 * @version 1.0
 */
public interface PushtakMahalDao {
	//----------------------Abstarct Method------------------//
	Vector<String> login(String username,String Password);
	int registration (UserInfo userInfo);
	int upDateProfile (UserInfo userInfo);
	//-------------------------------------------------------//
	
	/**
	 * Factory class to return implementation object
	 *
	 */
	public static class Factory{
		public static PushtakMahalDao getPushtakMahalDao(){
			return new PushtakMahalDaoImpl();
		}
	}
}
