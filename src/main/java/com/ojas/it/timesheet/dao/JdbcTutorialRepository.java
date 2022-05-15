package com.ojas.it.timesheet.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ojas.it.timesheet.Entity.Tutorial;

@Repository
@EnableTransactionManagement
public class JdbcTutorialRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public List<Tutorial> findAll() {
		return jdbcTemplate.query("SELECT * from tutorials", BeanPropertyRowMapper.newInstance(Tutorial.class));
	}

	@Transactional
	public int save(Tutorial tutorial) {
		return jdbcTemplate.update("INSERT INTO tutorials (title, description, published) VALUES(?,?,?)",
				new Object[] { tutorial.getTitle(), tutorial.getDescription(), tutorial.isPublished() });
		
	}

//  public int update(Tutorial tutorial) {
//    return jdbcTemplate.update("UPDATE tutorials SET title=?, description=?, published=? WHERE id=?",
//        new Object[] { tutorial.getTitle(), tutorial.getDescription(), tutorial.isPublished(), tutorial.getId() });
//  }
//// removed
//  public Tutorial findById(Long id) {
//    try {
//      Tutorial tutorial = jdbcTemplate.queryForObject("SELECT * FROM tutorials WHERE id=?",
//          BeanPropertyRowMapper.newInstance(Tutorial.class), id);
//      return tutorial;
//    } catch (IncorrectResultSizeDataAccessException e) {
//      return null;
//    }
//  }
//// removed
//  public int deleteById(Long id) {
//    return jdbcTemplate.update("DELETE FROM tutorials WHERE id=?", id);
//  }
//// removed

//// removed
//  public List<Tutorial> findByPublished(boolean published) {
//    return jdbcTemplate.query("SELECT * from tutorials WHERE published=?",
//        BeanPropertyRowMapper.newInstance(Tutorial.class), published);
//  }
//// removed
//  public List<Tutorial> findByTitleContaining(String title) {
//    String q = "SELECT * from tutorials WHERE title LIKE '%" + title + "%'";
//    return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(Tutorial.class));
//  }
//
//// removed
//  public int deleteAll() {
//    return jdbcTemplate.update("DELETE from tutorials");
//  }
}