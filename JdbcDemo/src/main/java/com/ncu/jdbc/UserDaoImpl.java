package com.ncu.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.ncu.model.ModelDemo;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	public UserDaoImpl(DataSource ds)
	{
		jdbc=new JdbcTemplate(ds);
	}
	@Override
	public void SaveprUpdate(ModelDemo modeldemo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ModelDemo get(String email) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM student_info where email='" + email + "'";
	    return jdbc.queryForObject(sql, BeanPropertyRowMapper.newInstance(ModelDemo.class));
	}

	@Override
	public List<ModelDemo> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(ModelDemo modeldemo) {
		// TODO Auto-generated method stub
		String insertquery="insert into student_info values(?,?,?,?,?)";
		jdbc.update(insertquery,new Object[] {modeldemo.getFname(),modeldemo.getLname(),modeldemo.getRollnumber(),modeldemo.getEmail(),modeldemo.getPassword()});
	}


}
