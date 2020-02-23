package com.rng.imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.rng.dao.ShanChuBeiFenDao;
import com.rng.tool.DBUtil;

public class ShanChuBeiFenDaoImp implements ShanChuBeiFenDao{
	Connection con=DBUtil.getConnection();
	@Override
	public int shanChuBeiFenRR() {
	  String sql="drop table newpeople";
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
	public int shanChuBeiFenKK() {
		String dsql="drop table newsubjects";
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
	public int shanChuBeiFenTT() {
		
			String delsql="drop table newquestions";
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
	public int shanChuBeiFenSS() {
		String desql="drop table newpaper";
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
