package fizzbuzz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FizzBuzzServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parametro = request.getParameter("hasta");
		FizzBuzz fb = new FizzBuzz();
		int hasta = new Integer(parametro);
		response.getWriter().println(fb.imprimir(hasta));
	}
}
