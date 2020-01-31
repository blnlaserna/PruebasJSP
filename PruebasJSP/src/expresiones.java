

import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class expresiones
 */
@WebServlet("/expresiones")
public class expresiones extends HttpServlet {
		
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date fecha = new Date();
		HttpSession session= request.getSession(true);
		
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("Fecha actual: " + fecha + "<BR>");
		pw.println("Nombre del host: " + request.getRemoteHost() + "<BR>");
		pw.println("ID de la sesión: " + session.getId() + "<BR>");
		pw.println("El parámetro es: " + request.getParameter("nombre") + "<BR>");
		//pw.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
