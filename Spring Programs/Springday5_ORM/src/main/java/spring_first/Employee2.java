package spring_first;

import org.springframework.jdbc.core.JdbcTemplate;
public class Employee2 {
private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
this.jdbcTemplate = jdbcTemplate;
}

public String viewEmployee(Employee e) {
	String query3="select name from myemployee where id=('"+e.getId()+"')";
	return jdbcTemplate.queryForObject(query3,String.class);

}

}