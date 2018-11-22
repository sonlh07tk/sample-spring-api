package sample.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sample.model.Message;

@RestController
public class SampleController {
    @RequestMapping("/greeting")
    public Message greeting(@RequestParam(value="name", defaultValue="Some one") String name) {
        return new Message("hello, " + name, "The api is fine!");
    }
}
