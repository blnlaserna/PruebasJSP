

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class division
 */
@WebServlet("/division")
public class division extends HttpServlet {
	
	private double toDouble(String value) {
		return (Double.valueOf(value).doubleValue());
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		try {
			double op1 = toDouble(request.getParameter("op1"));
			double op2 = toDouble(request.getParameter("op2"));
			double res = op1/op2;
			
			pw.println("<html><body>");
			pw.println("<table border=1>");
			pw.println("<tr><th></th><th>División</th></tr>");
			pw.println("<tr><th>Operando 1: </th><td>" + op1 + "</td></tr>");
			pw.println("<tr><th>Operando 2: </th><td>" + op2 + "</td></tr>");
			pw.println("<tr><th>Resultado: </th><td>" + res + "</td></tr>");
			pw.println("</table>");
			pw.println("</body></html>");
		} catch (Exception ex) {
			pw.println("<html><body>");
			pw.println("Error con alguno de los comandos");
		} finally {
			pw.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
