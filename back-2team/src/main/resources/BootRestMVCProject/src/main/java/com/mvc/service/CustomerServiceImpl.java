package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.CustomerDao;
import com.mvc.vo.Customer;

//클라이언트(CustomerApp.java)가 getBean 사용하는 객체. 서비스 객체
//CustomerApp.java가 getBean()해 간 후에 메소드 호출해서 사용함
//@Component("cus")
@Service("cus")//좀더 구체적으로 서비스 객체라고 표시해준 어노테이션
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao dao;//type 기준으로 주입을 시켜준다. CustomerDaoImpl이 실제로 주입됨
	//인터 페이스 타입인것 주의!!!
	
	@Override
	public List<Customer> selectAll() {
		return dao.selectAll();
	}

	@Override
	public Customer selectOne(String num) {
		return dao.selectOne(num);
	}

	@Override
	public void insert(Customer c) {
		dao.insert(c);
	}

	@Override
	public void delete(String num) {
		dao.delete(num);
	}

	@Override
	public List<Customer> findByAddress(String address) {
		return dao.findByAddress(address);
	}

	@Override
	public void update(Customer c) {
		dao.update(c);
	}
	
	//Transaction 처리 해줘야 하는 메소드에 해준다. 해주고 xml파일에서 기능을 on해주어야 한다.
	@Override
	public void insert2(Customer c) {
		dao.insert(c);
		dao.insert(c);
	}
}
