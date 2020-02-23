package com.rng.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rng.service.ShanChuBeiFenService;

public class ShanChuBeiFenServlet extends HttpServlet{
ShanChuBeiFenService scbfs=new ShanChuBeiFenService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		String q = req.getParameter("a");

		switch (q) {

		case "人员表":
			

			if(scbfs.shanChuBeiFenR()<=0){
				out.print("<script>alert(\"删除备份成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"删除备份失败，请校准~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "科目表":

			

			if(scbfs.shanChuBeiFenK()<=0){
				out.print("<script>alert(\"删除备份成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"删除备份失败，请校准~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "题库表":
			

			if(scbfs.shanChuBeiFenT()<=0){
				out.print("<script>alert(\"删除备份成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"删除备份失败，请校准~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "试卷表":
			

			if(scbfs.shanChuBeiFenS()<=0){
				out.print("<script>alert(\"删除备份成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"删除备份失败，请校准~\");window.location.href='form.jsp'</script>") ; 
			}
			break;
		}

	}

}
