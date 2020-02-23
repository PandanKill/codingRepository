package com.rng.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rng.service.BeiFenService;

public class BeiFenServlet extends HttpServlet {
	BeiFenService bfs = new BeiFenService();

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		String q = req.getParameter("a");

		switch (q) {

		case "人员表":
			
			if(bfs.createBeiFenR()>0){
				out.print("<script>alert(\"备份成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"备份失败，请重新查看~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "科目表":

			
			if(bfs.createBeiFenK()>0){
				out.print("<script>alert(\"备份成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"备份失败，请重新查看~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "题库表":
			

			if(bfs.createBeiFenT()>0){
				out.print("<script>alert(\"备份成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"备份失败，请重新查看~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "试卷表":
			

			if(bfs.createBeiFenS()>0){
				out.print("<script>alert(\"备份成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"备份失败，请重新查看~\");window.location.href='form.jsp'</script>") ; 
			}
			break;
		}

	}

}
