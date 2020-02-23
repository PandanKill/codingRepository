package com.rng.service;

import com.rng.dao.ShanChuBeiFenDao;
import com.rng.imp.ShanChuBeiFenDaoImp;

public class ShanChuBeiFenService {
ShanChuBeiFenDao pd= new ShanChuBeiFenDaoImp();
	public int shanChuBeiFenR() {
		
		return pd.shanChuBeiFenRR();
	}


	public int shanChuBeiFenK() {
		// TODO Auto-generated method stub
		return pd.shanChuBeiFenKK();
	}

	public int shanChuBeiFenT() {
		// TODO Auto-generated method stub
		return pd.shanChuBeiFenTT();
	}

	public int shanChuBeiFenS() {
		// TODO Auto-generated method stub
		return pd.shanChuBeiFenSS();
	}

}
