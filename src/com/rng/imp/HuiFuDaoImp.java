package com.rng.imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.rng.dao.HuiFuDao;
import com.rng.tool.DBUtil;

public class HuiFuDaoImp implements HuiFuDao{
Connection con=DBUtil.getConnection();
	@Override
	public int HuiFuPP() {
		String sql="create table people as(select * from newpeople)";
		int t=0;
		try {
			Statement stmt=con.createStatement();
			t=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public int HuiFuKK() {
		String sql="create table subjects as(select * from newsubjects)";
		int t=0;
		try {
			Statement stmt=con.createStatement();
			t=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public int HuiFuTT() {
		String sql="create table questions as(select * from newquestions)";
		int t=0;
		try {
			Statement stmt=con.createStatement();
			t=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public int HuiFuSS() {
		String sql="create table paper as(select * from newpaper)";
		int t=0;
		try {
			Statement stmt=con.createStatement();
			t=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

}
