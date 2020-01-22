package com.mvc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.vo.Customer;

//dao 객체(CRUD)
//@Component("cdao")
@Repository("cdao")
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	SqlSession session;
	
	@Override
	public List<Customer> selectAll() {
		return session.selectList("customer.selectAll");
	}

	@Override
	public Customer selectOne(String num) {
		return session.selectOne("customer.selectOne", num);
	}

	@Override
	public int insert(Customer c) {
		int x = session.insert("customer.insert",c);
		return x;
	}

	@Override
	public int delete(String num) {
		int x = session.delete("customer.delete", num);
		return x;
	}

	@Override
	public List<Customer> findByAddress(String address) {
		return session.selectList("customer.findAddress",address);
	}

	@Override
	public void update(Customer c) {
		session.update("customer.update",c);
	}
	
}
