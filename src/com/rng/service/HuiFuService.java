package com.rng.service;

import com.rng.dao.HuiFuDao;
import com.rng.imp.HuiFuDaoImp;

public class HuiFuService {
HuiFuDao qd=new HuiFuDaoImp();
	public int HuiFuP() {
		return qd.HuiFuPP();
		
	}

	public int HuiFuK() {
		return qd.HuiFuKK();
		
	}

	public int HuiFuT() {
		return qd.HuiFuTT();
		
	}

	public int HuiFuS() {
		return qd.HuiFuSS();
		
	}

}
