package javaweb.servlet;

import java.io.IOException;
import java.util.Random;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 執行位置:http://localhost:8080/javaweb/lottery
 * 模式: Model 1
 * Servlet負責邏輯，JSP負責資料呈現
 */

@WebServlet(urlPatterns = {"/lottery"})
public class LotteryServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//產生電腦選號(四星彩)
		Random random = new Random();
		int n1 = random.nextInt(10);
		int n2 = random.nextInt(10);
		int n3 = random.nextInt(10);
		int n4 = random.nextInt(10);
		
		//利用req.setAttribute() 將資料傳送給JSP
		req.setAttribute("n1",n1);
		req.setAttribute("n2",n2);
		req.setAttribute("n3",n3);
		req.setAttribute("n4",n4);
		
		//利用請求分派器，重導到指定的JSP
		req.getRequestDispatcher("/WEB-INF/view/lottery.jsp").forward(req, resp);
	}
}
