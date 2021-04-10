package com.resow.authentication.spo.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author brunomcarvalho89@gmail.com
 */
@RestController
public class OAuth2DataController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/data")
    public ResponseEntity data(@AuthenticationPrincipal OAuth2User auth2User) {
        return ResponseEntity.ok(auth2User.getAttributes());
    }
}
