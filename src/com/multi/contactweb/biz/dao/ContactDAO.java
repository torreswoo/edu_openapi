package com.multi.contactweb.biz.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.multi.contactweb.biz.vo.Contact;

@Repository
public class ContactDAO extends SqlMapClientDaoSupport {

	@Autowired
	public void setSqlMapClientWrapper(SqlMapClient smc){ // DI를 해주기위해 별도로 정의한 메서드
		this.setSqlMapClient(smc);
	}
	
	public List<Contact> selectAll(){
//		예외처리 필요 - getSqlMapClient()
//		return (List<Contact>)this.getSqlMapClient().queryForList("contact.selectall");
//		예외처리 필요없음 - getSqlMapClientTemplate()
		return (List<Contact>) this.getSqlMapClientTemplate()
				.queryForList("contact.selectall");
		
	}
	
	public Contact selectOne(Contact c){
		return (Contact) this.getSqlMapClientTemplate()
				.queryForObject("contact.selectone", c);
	}
	
	public int selectCount(){
		return (int) this.getSqlMapClientTemplate()
				.queryForObject("contact.selectcnt");
	}
	
	public int updateContact(Contact c){
		return this.getSqlMapClientTemplate()
				.update("contact.update", c);
	}
	
	public int deleteContact(Contact c){
		return this.getSqlMapClientTemplate()
				.delete("contact.delete", c);
	}
	
	public int insertContact(Contact c){
		return (Integer) this.getSqlMapClientTemplate()
				.insert("contact.insert", c);
	}
}