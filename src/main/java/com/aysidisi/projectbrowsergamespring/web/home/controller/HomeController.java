
package com.aysidisi.projectbrowsergamespring.web.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aysidisi.projectbrowsergamespring.web.account.service.AccountService;
import com.aysidisi.projectbrowsergamespring.web.core.ViewManager;
import com.aysidisi.projectbrowsergamespring.web.core.ViewTemplate;

@Controller
public class HomeController
{
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home()
	{
		return new ModelAndView(ViewManager.generateViewName(
				ViewTemplate.mainTemplate, "core/home"));
	}
}
