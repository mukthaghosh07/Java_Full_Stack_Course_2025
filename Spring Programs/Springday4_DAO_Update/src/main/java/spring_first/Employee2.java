package spring_first;

import org.springframework.jdbc.core.JdbcTemplate;
public class Employee2 {
private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
this.jdbcTemplate = jdbcTemplate;
}

public int viewEmployee(Employee e) {

	 String query = "UPDATE myemployee SET name = '" + e.getName() + "' WHERE id = " + e.getId();
	    return jdbcTemplate.update(query);

}

}