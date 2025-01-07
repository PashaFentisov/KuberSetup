package core.kubersetups;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class HttpConsumerService implements ConsumerService {
    private final RestTemplate restTemplate;

    @Value("${producer.host}")
    private String host;

    @Override
    public String getInfoFromProducer(){
        log.info("host {}", host);
        return restTemplate.getForObject(String.format("http://%s:8080/producer", host), String.class);
    }
}
