import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config = getServletConfig();
		String msg = config.getInitParameter("msg1");
		PrintWriter pw = resp.getWriter();
		pw.append("welcome to first");
		/*RequestDispatcher rd = req.getRequestDispatcher("/second");
		//rd.forward(req, resp);
		rd.include(req, resp);*/
	}
}
