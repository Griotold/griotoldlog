package sample.griotoldlog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.griotoldlog.request.PostCreate;

@Slf4j
@RequestMapping("/v1/posts")
@RestController
public class PostController {

    @PostMapping
    public String create(@RequestBody PostCreate request) {

        log.info("request = {}", request);
        return "Hello World";
    }
}
