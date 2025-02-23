package com.syncbridge.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class SchemaManagerApi {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping(
        path = "/upload-schema",
        consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void uploadSchema(@RequestParam("file") MultipartFile file) {
        
    }

}
