import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginUserServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		String username=req.getParameter("username");   //making dummy logic for now
		String password=req.getParameter("password");
		
		
		if(username.equals(password)) {
			out.print("<h1>welcome user "+username+"</h1><br/><a href='logout'>logout</a>");
			Cookie cookie=new Cookie("username", username);
			cookie.setMaxAge(300);
			
			res.addCookie(cookie);
			System.out.println("cookie made..."+cookie.getValue());
		}
	}

}
