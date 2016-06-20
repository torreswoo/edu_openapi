package com.multi.contactweb.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.multi.contactweb.biz.service.ContactService;
import com.multi.contactweb.biz.vo.Contact;

@Controller
public class ContactWebController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="list.do", method=RequestMethod.GET)
	public ModelAndView getContactList(){
		List<Contact> list = this.contactService.selectAll();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("list");  // list.jsp
		return mav;
	}
	
	@RequestMapping(value="insert.do", method=RequestMethod.POST)
	public String insertContact(Contact c){
		this.contactService.insertContact(c);
		return "redirect:list.do";
	}
	
	@RequestMapping(value="update.do", method=RequestMethod.POST)
	public String updateContact(Contact c){
		this.contactService.updateContact(c);
		return "redirect:list.do";
	}
	
	@RequestMapping(value="delete.do", method=RequestMethod.POST)
	public String deleteContact(Contact c){
		this.contactService.deleteContact(c);
		return "redirect:list.do";
	}
}
