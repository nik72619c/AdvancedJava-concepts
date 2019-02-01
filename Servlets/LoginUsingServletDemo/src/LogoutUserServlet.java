import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutUserServlet extends HttpServlet {

	/**
	 * serialVersionId set
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.getWriter().println("<h2>logged out successfully</h2>");
		Cookie cookie=new Cookie("username","");
		cookie.setMaxAge(0);
		res.addCookie(cookie);
		System.out.println("cookie removed");
		res.setContentType("text/html");
		req.getRequestDispatcher("index.html").include(req, res);

	}


}
