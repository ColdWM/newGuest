package com.nhnent.guest2.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nhnent.guest2.service.GuestService;
import com.nhnent.guest2.vo.GuestVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Resource
	private GuestService guestService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("guestsList", guestService.getGuests());			
		return "home";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String add(
			Model model,
			@ModelAttribute GuestVo guest) {
		guestService.insertGuest(guest);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(
			Model model,
			@ModelAttribute GuestVo guest) {
		guestService.updateGuest(guest);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(
			Model model,
			@ModelAttribute GuestVo guest) {
		guestService.deleteGuest(guest.getGuestId());
		return "redirect:/";
	}
	
}
