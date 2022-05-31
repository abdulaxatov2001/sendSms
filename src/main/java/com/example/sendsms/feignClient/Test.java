package com.example.sendsms.feignClient;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/send")
@RestController

public class Test {
    @Autowired
    public SendMassage sendMassage;
    String key = "AccessKey xsTieTlZpZJjxyexNB2LK8PzJ";

    @PostMapping()
    public ResponseEntity sent(@RequestBody SendMassageDto sendMassageDto){
        sendMassage.sendMassages(sendMassageDto,key);
        return ResponseEntity.ok(sendMassageDto);
    }
}
