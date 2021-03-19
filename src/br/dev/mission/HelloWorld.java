package br.dev.mission;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer count = (Integer) session.getAttribute("count");
		int visit = (count == null) ? 1 : count.intValue() + 1;
		session.setAttribute("count", new Integer(visit));
		
		PrintWriter out = response.getWriter();
		out.append("<html>");
		out.append("<body>");
		out.append("<div style='display: flex; flex-flow: column; align-items: center; justify-content: center; margin: 100px auto;'>");
		out.append("<h1 style='flex:1;' > Hello World! " + request.getParameter("nome") + " </h1>" );
		out.append("<p> Visita número:  " + visit + "</p>" );
		out.append("</div>");
		out.append("</body>");
		out.append("</html>");
	}
}
