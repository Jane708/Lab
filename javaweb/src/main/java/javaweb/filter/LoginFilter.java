package javaweb.filter;

import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebFilter(urlPatterns = {"/fruit/*", "/user/update/password", "/product", "/products", "/order", "/cart"}) //設定要過濾/攔截的路徑
public class LoginFilter extends HttpFilter{

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 編碼
		//response.setCharacterEncoding("UTF-8");
		//response.setContentType("text/plain;charset=utf-8");
		
		System.out.println("攔截過濾: "+ request.getRequestURL());
		//response.getWriter().print("攔截過濾: "+ request.getRequestURL());
		
		// 判斷是否有憑證
		HttpSession session = request.getSession();
		if(session.getAttribute("userCert") == null) {
			//response.getWriter().print("請先登入");   // 兩者只能擇一，不可同時觸發
			
			// 記錄此次請求的URL
			session.setAttribute("redirectURL", request.getRequestURL());
			response.sendRedirect("/javaweb/login"); // 自動重導到登入頁面
			
		} else {
			chain.doFilter(request, response); // 放行，為一個API設計
		}
		
		
	}

}
