package pl.uj.jwzp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class FrontBase {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String basePath()
    {
        return "Hello world!";
    }
}
