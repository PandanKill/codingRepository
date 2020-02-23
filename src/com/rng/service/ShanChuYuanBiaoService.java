package com.rng.service;

import com.rng.dao.ShanChuYuanBiaoDao;
import com.rng.imp.ShanChuYuanBiaoDaoImp;

public class ShanChuYuanBiaoService {
ShanChuYuanBiaoDao sjd=new ShanChuYuanBiaoDaoImp();

	public int ShanChuYuanBiaoP() {
		return sjd.ShanChuYuanBiaoPP();
		
	}

	public int ShanChuYuanBiaoK() {
		return sjd.ShanChuYuanBiaoKK();
		
	}

	public int ShanChuYuanBiaoT() {
		return sjd.ShanChuYuanBiaoTT();
		
	}

	public int ShanChuYuanBiaoS() {
		return sjd.ShanChuYuanBiaoSS();
		
	}

}
