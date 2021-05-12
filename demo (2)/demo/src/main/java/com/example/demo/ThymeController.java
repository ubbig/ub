package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {
    @RequestMapping("/")
    String indexPage(Model model){
        Board board1 = new Board(1, "테스트 제목1", "임유비");
        Board board2 = new Board(2, "테스트 제목2", "임유비");
        Board board3 = new Board(3, "테스트 제목3", "박예빈");
        Board board4 = new Board(4, "테스트 제목4", "박세준");
        Board board5 = new Board(5, "테스트 제목5", "유하진");
        List<Board> boards = new ArrayList<>();
        boards.add(board1);
        boards.add(board2);
        boards.add(board3);
        boards.add(board4);
        boards.add(board5);
    
        model.addAttribute("boardList", boards);
        return "index";
    }
}
