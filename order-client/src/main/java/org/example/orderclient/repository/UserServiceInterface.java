package org.example.orderclient.repository;

import org.example.orderclient.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "user-service")
public interface UserServiceInterface {
    @GetMapping("/api/users/{id}")
    User getUserById(@PathVariable("id") Long id);
}
