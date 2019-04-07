package com.nt.service;

import java.util.Calendar;

public class WishServiceImpl implements WishService {

	@Override
	public String genrate() {

		Calendar cal=null;
		int hour=0;
		String msg=null;
		//get System Date And time
		cal=Calendar.getInstance();
		
		//get Current Hour of the day
		hour=cal.get(Calendar.HOUR_OF_DAY);
		
		//get wish msg
		if(hour<=12)
			msg="Good Morning";
		else if(hour<16)
			msg="Good Afternoon";
		else if(hour<20)
			msg="Good Evening";
		else
			msg="Good Night";
		return msg;
	}

}
