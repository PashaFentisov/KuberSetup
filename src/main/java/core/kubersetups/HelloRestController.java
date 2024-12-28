package core.kubersetups;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloRestController {
    @GetMapping("/get")
    public String helloEndpoint(){
        return "Hello endpoint";
    }
}
