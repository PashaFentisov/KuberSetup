package core.kubersetups;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestRestController {
    @GetMapping("/get")
    public String testEndpoint(){
        return "Test endpoint";
    }
}
