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

		case "��Ա��":
			

			if(scbfs.shanChuBeiFenR()<=0){
				out.print("<script>alert(\"ɾ�����ݳɹ���\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"ɾ������ʧ�ܣ���У׼~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "��Ŀ��":

			

			if(scbfs.shanChuBeiFenK()<=0){
				out.print("<script>alert(\"ɾ�����ݳɹ���\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"ɾ������ʧ�ܣ���У׼~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "����":
			

			if(scbfs.shanChuBeiFenT()<=0){
				out.print("<script>alert(\"ɾ�����ݳɹ���\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"ɾ������ʧ�ܣ���У׼~\");window.location.href='form.jsp'</script>") ; 
			}
			break;

		case "�Ծ��":
			

			if(scbfs.shanChuBeiFenS()<=0){
				out.print("<script>alert(\"ɾ�����ݳɹ���\");window.location.href='form.jsp'</script>") ; 
			}else{
				out.print("<script>alert(\"ɾ������ʧ�ܣ���У׼~\");window.location.href='form.jsp'</script>") ; 
			}
			break;
		}

	}

}
