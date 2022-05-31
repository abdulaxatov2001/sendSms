package com.example.sendsms.feignClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SendMassageDto {
    private String recipients;
    private String originator="Xurshidbek";
    private String body="Well come to Hey master ";
}
