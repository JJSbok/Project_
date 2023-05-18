package com.board.controller;

import com.board.DTO.BoardDTO;
import com.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;
    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }
        @PostMapping("/save")
//        RequestParam으로 일일이 할필요없이 @ModelAttribute BoardDTO boardDTO로 간단하게 가능
                public String save(@ModelAttribute BoardDTO boardDTO){
            System.out.println("boardDTO = " + boardDTO);
            boardService.save(boardDTO);

            return "index";

    }

    @GetMapping("/")
    public String findAll(Model model){
        // DB에서 전체 게시글 데이터를 가져와서 list.html에 보여준다.
        List<BoardDTO> boardDTOList = boardService.findAll();
        model.addAttribute("boardList", boardDTOList);
        return "list";
    }
}
