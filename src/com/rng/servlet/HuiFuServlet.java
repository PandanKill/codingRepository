package com.rng.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rng.service.HuiFuService;
import com.rng.service.ShanChuYuanBiaoService;

public class HuiFuServlet extends HttpServlet{
   HuiFuService hfs=new HuiFuService();
ShanChuYuanBiaoService scybs=new ShanChuYuanBiaoService();
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
			scybs.ShanChuYuanBiaoP();

			if(hfs.HuiFuP()>0){
				out.print("<script>alert(\"恢复成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"恢复失败，请校准~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "科目表":
               scybs.ShanChuYuanBiaoK();
			

			if(hfs.HuiFuK()>0){
				out.print("<script>alert(\"恢复成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"恢复失败，请校准~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "题库表":
			scybs.ShanChuYuanBiaoT();

			if(hfs.HuiFuT()>0){
				out.print("<script>alert(\"恢复成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"恢复失败，请校准~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "试卷表":
			scybs.ShanChuYuanBiaoS();

			if(hfs.HuiFuS()>0){
				out.print("<script>alert(\"恢复成功！\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"恢复失败，请校准~\");window.location.href='form.jsp'</script>") ; 
			}
			break;
		}

	}

}
