package com.pustakmahal.it.servet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
/**
 * @author Adrish Bhattacharyay
 * @version 1.0
 */

@WebServlet(urlPatterns = { "/TestServlet" }

)
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * @Override public void destroy() { // TODO Auto-generated method stub
	 * super.destroy(); System.out.print("TestServlet - destroy() invoked"); }
	 */
	/*
	 * @Override public void init() throws ServletException { // TODO
	 * Auto-generated method stub super.init();
	 * System.out.print("TestServlet - init() invoked"); }
	 */

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * Process request whatever be the method is
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			out.print("Just to test: <br/>");
			out.print("<br/>request.getRemoteUser() = "
					+ request.getRemoteUser());
			out.print("<br/>request.getHeader(\"REMOTE_USER\")="
					+ request.getHeader("REMOTE_USER"));
		}
		;

	}
}
