package fr.xebia.craft.fix;

import java.util.List;

public class ExternalDao {
	
	public List<Show> getAllShows() {
		throw new RuntimeException("Network error");
	}
}
