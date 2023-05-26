package com.example.servicec.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CService {
    private final WebClient entityBWebClient;
    private final WebClient entityAWebClient;
    public CService(WebClient entityBWebClient, WebClient entityAWebClient) {
        this.entityBWebClient = entityBWebClient;
        this.entityAWebClient = entityAWebClient;
    }

    public String getA(Long id) {
        return entityAWebClient.get().uri(uriBuilder -> uriBuilder.path(id.toString()).build())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public String getB(Long id) {
        return entityBWebClient.get().uri(uriBuilder -> uriBuilder.path(id.toString()).build())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
