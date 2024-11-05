package javaweb.repository;

public interface ShowDao {
	
	List<Show> findAllShows();
	
	Show getShow(String showname);
	
	void addShow(Show show);
	
	void updateShow(Integer showId, String showname);
	
	void deleteShow(Integer showId);

}
