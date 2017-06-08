package tw.org.learnPipeling;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String home() {
        return "Hello!";
    }

    @RequestMapping("/new-world")
    public String newWorld(){
        return "Welcome To New World!";
    }

    @RequestMapping("/hot-swap")
    public String hotSwap(){
        return "Came from HotSwap!";
    }
}
