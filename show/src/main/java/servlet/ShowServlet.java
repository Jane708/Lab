package servlet;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.ShowDto;
import service.ShowService;

/*
 * 查詢全部: Get   /show, /shows
 * 新增單筆: POST  /show/add
 * 查詢單筆: GET   /show/get?showname=lovestory
 * 修改單筆: POST  /show/update?showId=1
 * 刪除單筆: GET   /show/delete?showId=1
 */

@WebServlet(urlPatterns = {"/show/*", "/shows"})
public class ShowServlet extends HttpServlet{
	
	// 讓 showDtos 順利創建的關鍵
	private ShowService showService = new ShowService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pathInfo = req.getPathInfo();
		
		// 查詢全部
		if(pathInfo == null || pathInfo.equals("/*")) {
			// 查詢全部
			List<ShowDto> showDtos = showService.findAll();
			// 將必要資料加入到 request 屬性中以便交由 jsp 進行分析與呈現
			req.setAttribute("showDtos", showDtos);
			// 內重導到 show.jsp
			req.getRequestDispatcher("/WEB-INF/view/Show.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
