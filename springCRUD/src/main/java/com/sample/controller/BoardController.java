package com.sample.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sample.domain.BoardVO;
import com.sample.service.BoardService;

@Controller
@RequestMapping(value="/") //주소 패턴
public class BoardController {

	@Inject
	private BoardService service;
	
	@RequestMapping(value="/listAll",method=RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		model.addAttribute("list",service.listAll());
	}
	
	@RequestMapping(value="/regist",method=RequestMethod.POST)
	public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.regist(board);
	return "redirect:/listAll";
	}
	
	@RequestMapping(value="/read",method=RequestMethod.GET)
	public void read(@RequestParam("b_no")int b_no,Model model) throws Exception{
		model.addAttribute(service.read(b_no));
	}
	
	@RequestMapping(value="/modify",method=RequestMethod.GET)
	public void modifyGET(int b_no, Model model) throws Exception{
		model.addAttribute(service.read(b_no));
	}
		
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.modify(board);
		return "redirect:/listAll";
	}
}
