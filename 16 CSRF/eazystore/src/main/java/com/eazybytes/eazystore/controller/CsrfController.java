package com.eazybytes.eazystore.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/csrf-token")
public class CsrfController {

    @GetMapping
    public CsrfToken csrfToken(HttpServletRequest request) {
       return (CsrfToken) request.getAttribute(CsrfToken.class.getName());
    }
}
