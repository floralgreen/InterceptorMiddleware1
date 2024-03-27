package esercizioDevelhope.InterceptorMiddleware1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping
    public ResponseEntity<String> currentDateTime(){
        String now = OffsetDateTime.now().toString();
        return ResponseEntity.ok(now);
    }

}
