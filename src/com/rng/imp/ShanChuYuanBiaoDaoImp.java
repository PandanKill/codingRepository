package com.rng.imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.rng.dao.ShanChuYuanBiaoDao;
import com.rng.tool.DBUtil;

public class ShanChuYuanBiaoDaoImp implements ShanChuYuanBiaoDao{
Connection con=DBUtil.getConnection();

	@Override
	public int ShanChuYuanBiaoPP() {
	  String sql="drop table people";
	  int s=0;
	  try {
		Statement stmt=con.createStatement();
		s=stmt.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return s;
	}

	@Override
	public int ShanChuYuanBiaoKK() {
		String dsql="drop table subjects";
		  int i=0;
		  try {
			Statement stmt=con.createStatement();
			i=stmt.executeUpdate(dsql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return i;
		
	}

	@Override
	public int ShanChuYuanBiaoTT() {
		
			String delsql="drop table questions";
			  int a=0;
			  try {
				Statement stmt=con.createStatement();
				a=stmt.executeUpdate(delsql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return a;
			
		}

	@Override
	public int ShanChuYuanBiaoSS() {
		String desql="drop table paper";
		  int z=0;
		  try {
			Statement stmt=con.createStatement();
			z=stmt.executeUpdate(desql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return z;
		
	}
	

}
