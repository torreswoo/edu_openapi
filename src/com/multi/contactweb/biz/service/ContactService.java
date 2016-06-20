package com.multi.contactweb.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.contactweb.biz.dao.ContactDAO;
import com.multi.contactweb.biz.vo.Contact;

@Service
public class ContactService {

	@Autowired
	private ContactDAO contactDAO;
		
	public List<Contact> selectAll(){
		return this.contactDAO.selectAll();
	}
	
	public int insertContact(Contact c){
		return this.contactDAO.insertContact(c);
	}
	
	public int updateContact(Contact c){
		return this.contactDAO.updateContact(c);
	}
	
	public int deleteContact(Contact c){
		return this.contactDAO.deleteContact(c);
	}
	
	public Contact selectOne(Contact c){
		return this.contactDAO.selectOne(c);
	}
}
