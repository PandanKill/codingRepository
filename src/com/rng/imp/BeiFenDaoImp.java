package com.rng.imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.rng.dao.BeiFenDao;
import com.rng.tool.DBUtil;

public class BeiFenDaoImp implements BeiFenDao{
 Connection con=DBUtil.getConnection();
	@Override
	public int createBeiFenRR() {
		int s=0;
		String sql="create table newpeople as (select * from people)";
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
	public int createBeiFenKK() {
		int s=0;
		String sql="create table newsubjects as (select * from subjects)";
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
	public int createBeiFenTT() {
		int O=0;
		String sql="create table newquestions as (select * from questions)";
		try {
			Statement stmt=con.createStatement();
			O=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return O;
	}
	@Override
	public int createBeiFenSS() {
		int i=0;
		String sql="create table newpaper as (select * from paper)";
		try {
			Statement stmt=con.createStatement();
			i=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	}
	


