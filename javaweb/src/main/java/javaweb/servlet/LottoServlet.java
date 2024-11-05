package javaweb.servlet;

import java.io.IOException;
import java.util.Random;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*	執行位置:http://localhost:8080/javaweb/lotto
	http->通訊協定
	連結方式:Get or Post
*/

@WebServlet(urlPatterns = {"/lotto", "/lucky"})
public class LottoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//產生電腦選號(四星彩)
		Random random = new Random();
		int n1 = random.nextInt(10);
		int n2 = random.nextInt(10);
		int n3 = random.nextInt(10);
		int n4 = random.nextInt(10);
		
		//印出四碼，利用resp回傳給瀏覽器
		resp.getWriter().print("<html>");
		resp.getWriter().print("<h1>");
		resp.getWriter().print(n1);
		resp.getWriter().print(n2);
		resp.getWriter().print(n3);
		resp.getWriter().print(n4);
		resp.getWriter().print("</h1>");
		resp.getWriter().print("</html>");
		
	}
}
