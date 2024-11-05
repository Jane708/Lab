package repository;

import java.sql.Date;
import java.util.List;

import model.entity.Show;

public interface ShowDao {
	
	// 多筆: 查詢所有使用者
	List<Show> findAllShows();
	
	// 單筆: 根據 showname 查詢該筆節目名稱
	Show getShow(String showname);
	
	// 新增
	void addShow(Show show);
	
	// 修改
	void updateShow(Integer showId, Date showtime);
	
	// 刪除
	void deleteShow(Integer showId);

}
