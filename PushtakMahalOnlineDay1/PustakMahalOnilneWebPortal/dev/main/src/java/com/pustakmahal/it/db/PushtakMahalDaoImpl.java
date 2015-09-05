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
public class PushtakMahalDaoImpl implements PushtakMahalDao{

	/* (non-Javadoc)
	 * @see com.pustakmahal.it.db.PushtakMahalDao#login(java.lang.String, java.lang.String)
	 */
	@Override
	public Vector<String> login(String username, String Password) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.pustakmahal.it.db.PushtakMahalDao#registration(com.pustakportal.it.model.UserInfo)
	 */
	@Override
	public int registration(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.pustakmahal.it.db.PushtakMahalDao#upDateProfile(com.pustakportal.it.model.UserInfo)
	 */
	@Override
	public int upDateProfile(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
