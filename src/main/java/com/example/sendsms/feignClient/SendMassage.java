package com.example.sendsms.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "feign",url = "https://rest.messagebird.com/messages")
public interface SendMassage {
    @PostMapping()
     void sendMassages(@RequestBody SendMassageDto sendMassageDto,
                                 @RequestHeader ("Authorization") String key );
}
