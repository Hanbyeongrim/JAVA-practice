package com.example.put;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable Long userId){ //=@PathVariable(name = "userId") Long id
        System.out.println(requestDto);
        System.out.println(userId);
        return requestDto;  //스프링부트에서 return시 자동으로 json 형태로 만들어줌
    }
}
