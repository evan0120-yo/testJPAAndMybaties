package com.example.person;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void save(Person person) {
		sqlSession.insert("save", person);
	}
	
	public void delete(String id) {
		sqlSession.delete("delete", id);
	}
	
	public void update(Person person) {
		sqlSession.update("update", person);
	}
	
	public Person findById(String id) {
		return sqlSession.selectOne("findById", id);
	}
	
	public List<Person> findAll() {
		return sqlSession.selectList("findAll");
	}

}
