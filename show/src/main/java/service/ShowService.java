package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dto.ShowDto;
import model.entity.Show;
import repository.ShowDao;
import repository.ShowDaoImpl;

public class ShowService {
	
	private ShowDao showDao = new ShowDaoImpl();
	
	//所有使用者
	public List<ShowDto> findAll(){
		List<ShowDto> showDtos = new ArrayList<>();
		// 將 Show 轉成 ShowDto
		// 向 userDao 索取 List<Show> 集合
		List<Show> shows = showDao.findAllShows();
		for(Show show : shows) {
			ShowDto showDto = new ShowDto(); // 10.29 發現無法 set 的原因是 ShowDto 中無 lombok 的 @Data
			showDto.setShowId(show.getShowId());
			showDto.setShowname(show.getShowname());
			showDto.setShowtime(show.getShowtime());
			showDto.setLimitpeople(show.getLimitpeople());
			
			showDtos.add(showDto);
			
		}
		return showDtos;
	}
	
	// 新增使用者
	public void appendShow(String showname, Date showtime, Integer limitpeople) {
		
		// 將上述參數列封裝到 Show 物件中
		Show show = new Show();
		show.setShowname(showname);
		show.setShowtime((java.sql.Date) showtime);
		show.setLimitpeople(limitpeople);
		
		showDao.addShow(show);
	}

}
