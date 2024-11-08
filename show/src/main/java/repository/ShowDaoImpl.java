package repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.entity.Show;

public class ShowDaoImpl extends BaseDao implements ShowDao {

	@Override
	public List<Show> findAllShows() {
		List<Show> shows = new ArrayList<>();
		String sql = "select show_id, showname, showtime, limitpeople, showintro from showtest";
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			
			// 逐筆拜訪
			while(rs.next()) {
				Show show = new Show();
				show.setShowId(rs.getInt("showId"));
				show.setShowname(rs.getString("showname"));
				show.setShowtime(rs.getDate("showtime"));
				show.setLimitpeople(rs.getInt("limitpeople"));
				show.setShowintro(rs.getString("showintro"));
				
				shows.add(show);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return shows;
	}

	@Override
	public Show getShow(String showname) {
		String sql = "select show_id, showname, showtime, limitpeople, showintro from showtest where showname = ?";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, showname); // 第一個 ? 放 showname
			
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) { // 若得到一筆
					// 建立 user 物件並將資料配置進去
					Show show = new Show();
					show.setShowId(rs.getInt("showId"));
					show.setShowname(rs.getString("showname"));
					show.setShowtime(rs.getDate("showtime"));
					show.setLimitpeople(rs.getInt("limitpeople"));
					show.setShowintro(rs.getString("showintro"));
					return show;
				}
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void addShow(Show show) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShow(Integer showId, Date showtime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteShow(Integer showId) {
		// TODO Auto-generated method stub
		
	}

}
