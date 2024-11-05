package javaweb.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javaweb.*;

public class ShowDaoImpl extends ShowBaseDao implements ShowDao{
	
	@Override
	public List<Show> findAllShows(){
		List<Show> shows = new ArrayList<>();
		String sql = "select show_id, showname, showtime, limitpeople, showintro from showtest";
		
		try(Statement stmt = conn.createStatement();
				Result rs = stmt.excuteQuery(sql)){
			
			while(rs.next()) {
				Show show = new Show();
			}
			
		} catch (SQLExceptionn e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public Show getShow(String showname);
	
	@Override
	public void addShow(Show show);
	
	@Override
	public void updateShow(Integer showId, String showname);
	
	@Override
	public void deleteShow(Integer showId);
}
