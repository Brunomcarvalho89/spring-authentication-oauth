package com.resow.authentication.spo.infrastructure.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author brunomcarvalho89@gmail.com
 */
@Controller
public class OAuth2Controller {

    @GetMapping("/index")
    public ModelAndView index(@AuthenticationPrincipal OAuth2User principal) {
        return new ModelAndView("index");
    }
}
