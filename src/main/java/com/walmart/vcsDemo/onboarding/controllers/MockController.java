package com.walmart.vcsDemo.onboarding.controllers;

import com.walmart.vcsDemo.onboarding.exceptions.InvalidInfoException;
import com.walmart.vcsDemo.onboarding.exceptions.MissingInfoException;
import com.walmart.vcsDemo.onboarding.exceptions.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MockController {

    @GetMapping("/bad-request/{type}")
    public void triggerBadRequest(@PathVariable String type) {
        switch (type.toLowerCase()) {
            case "invalidinfo":
                throw new InvalidInfoException("Username");
            case "missinginfo":
                throw new MissingInfoException("Password");
        }
    }

    @GetMapping("/unauthorized/{type}")
    public void triggerUnauthorized(@PathVariable String type) {
        switch (type.toLowerCase()) {
            case "invalidtoken":
                throw new InvalidAccessTokenException();
            case "missingtoken":
                throw new MissingAccessTokenException();
            case "expiredtoken":
                throw new ExpiredAccessTokenException();
            default:
                // ... handle default case if needed ...
        }
    }

    @GetMapping("/ratelimited")
    public void triggerRateLimited() {
        throw new RateLimitedException();
    }
}
