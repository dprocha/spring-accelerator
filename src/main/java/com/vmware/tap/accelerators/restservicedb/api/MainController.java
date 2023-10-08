package com.vmware.tap.accelerators.restservicedb.api;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MainController {

    @Transactional(readOnly = true)
    @GetMapping({ "", "/" })
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Welcome Diego");
    }
}