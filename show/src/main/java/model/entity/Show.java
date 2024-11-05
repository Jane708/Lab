package model.entity;

import java.sql.Date;
import lombok.Data;


@Data
public class Show {
	private Integer showId;
	private String showname;
	private Date showtime;
	private Integer limitpeople;
	private String showintro;

}
