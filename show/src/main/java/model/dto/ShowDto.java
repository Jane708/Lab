package model.dto;

import java.sql.Date;
import lombok.Data;


@Data
public class ShowDto {
	
	private Integer showId;
	private String showname;
	private Date showtime;
	private Integer limitpeople;

}
