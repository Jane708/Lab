package javaweb.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 將 session 失效，預設 session 是未光臨網頁 30min
		HttpSession session = req.getSession();
		session.invalidate(); // 將"所有" session 失效，單純用法
		//session.setAttribute("userCert", null); // 只讓"憑證"的 session 變數失效，但 sessionId 不會重發
		
		String message = "登出成功";
		req.setAttribute("message", message);
		req.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(req, resp);
	}

}
