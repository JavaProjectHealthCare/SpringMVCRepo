package com.nt.controller;

import java.security.Provider.Service;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishService;

public class WishController extends AbstractController {

	private WishService Service;
	
	public WishController(WishService service) {
		Service = service;
	}
	@Override
	public  ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String msg =null;
		
		//call Service Method
		msg=Service.genrate();
		return new ModelAndView("result","wmsg",msg);
		
	}

}
