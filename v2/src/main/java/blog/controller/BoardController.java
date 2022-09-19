package blog.controller;

import blog.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

//    @RequestMapping(value = "/board/list")
//    @ResponseBody
//    public String list() {
//        return boardService.list().toString();
//    }

    @RequestMapping(value = "/board/list")
    public String list(Model model) {
        model.addAttribute("boardList", boardService.list());
        return "/board/list"; // View 힌트 :WEB-INF/views/board/list
    }

    @RequestMapping(value = "/board/read/{seq}")
    public String read(Model model, @PathVariable int seq) {
        model.addAttribute("boardDTO", boardService.read(seq));
        return "/board/read";
    }
}
