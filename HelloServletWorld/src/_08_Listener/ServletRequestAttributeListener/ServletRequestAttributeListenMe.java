package _08_Listener.ServletRequestAttributeListener;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletrequestattributelistenme")
public class ServletRequestAttributeListenMe extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setAttribute("name", "myname attribute");
		req.setAttribute("name", "new myname attribute");
		req.removeAttribute("name");
	}
}
