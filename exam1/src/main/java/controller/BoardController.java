package controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.BoardVO;
import service.BoardService;

@Controller
@RequestMapping("/board/") //board로 시작되는 요청을 다 BoardController에서 받아들이겠다는 의미
public class BoardController {

	@Inject
	private BoardService service;
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public void createGET(BoardVO board, Model model) throws Exception{
		System.out.println("/board/create 입니다. GET방식");
	}
		
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String createPOST(BoardVO board, Model model) throws Exception{
		System.out.println("/board/create 입니다. POST방식");
		System.out.println(board.toString());
		
		service.create(board);
		model.addAttribute("result","성공");
		
		return "/board/succes";
	}
}
