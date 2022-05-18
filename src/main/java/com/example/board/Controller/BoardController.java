package com.example.board.Controller;

import com.example.board.dto.BoardDto;
import com.example.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    @GetMapping("/")
    public String list (){
        return "board/list.html";
    }

    @GetMapping("/post")
    public String write(){
        return "board/write.html";
}

    @PostMapping("/post")
    public String write(BoardDto boardDto){
        boardService.savePost(boardDto);
        return "redirect:/";
}

}

/*
MyBatis의 경우에는
Controller > Service > Impl > Dao > Mapper
의 5단 구조로 조회를 하는 걸 생각해보면
JPA에서 단순 반복 쿼리는 매우 쉽게 사용이 가능하다
 */