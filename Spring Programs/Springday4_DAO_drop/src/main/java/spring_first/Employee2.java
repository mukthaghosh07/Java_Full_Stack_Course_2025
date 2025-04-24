package spring_first;

import org.springframework.jdbc.core.JdbcTemplate;
public class Employee2 {
private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
this.jdbcTemplate = jdbcTemplate;
}

public String viewEmployee() {
	String query3="drop table myemployee";
	return jdbcTemplate.queryForObject(query3,String.class);

}
}