package app.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Token {
    
    @Cacheable("token")
    public String getToken(String id) {
        log.info(id);
        try {
            long time = (long) (5000L);
            Thread.sleep(time);
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
        return id;
    }
}
