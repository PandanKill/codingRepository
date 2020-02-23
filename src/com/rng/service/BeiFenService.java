package com.rng.service;

import com.rng.dao.BeiFenDao;
import com.rng.imp.BeiFenDaoImp;

public class BeiFenService {
	BeiFenDao pd = new BeiFenDaoImp();

	public int createBeiFenR() {
		return pd.createBeiFenRR();
	}

	public int createBeiFenK() {

		return pd.createBeiFenKK();
	}

	public int createBeiFenT() {

		return pd.createBeiFenTT();
	}

	public int createBeiFenS() {

		return pd.createBeiFenSS();
	}

}
