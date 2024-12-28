package core.kubersetups;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DefaultRestController {
    @GetMapping
    public String defaultEndpoint(){
        return "Default endpoint";
    }
}
