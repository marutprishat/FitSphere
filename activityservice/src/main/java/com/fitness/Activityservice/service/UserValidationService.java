package com.fitness.Activityservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Service
@RequiredArgsConstructor
public class UserValidationService {
    private final WebClient userServiceWebClient;

    public boolean validateUser(String userId){
        try{
            return Boolean.TRUE.equals(userServiceWebClient.get()
                    .uri("/api/users/8158ccde-f160-47d2-93be-4719940c558a/validate", userId)
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block());
        }
        catch (WebClientResponseException e){
            if(e.getStatusCode()== HttpStatus.NOT_FOUND){
                throw new RuntimeException("User not found: "+userId);
            }
            else{
                throw new RuntimeException("Invalid Request: "+userId);
            }
        }
    }
}
