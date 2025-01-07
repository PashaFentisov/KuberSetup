package core.kubersetups;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
@RequiredArgsConstructor
public class ConsumerRestController {

    private final HttpConsumerService httpConsumerService;
    @GetMapping
    public String consumerEndpoint(){
        return httpConsumerService.getInfoFromProducer();
    }
}
