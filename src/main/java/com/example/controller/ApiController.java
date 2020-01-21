package com.example.controller;

import com.example.controller.model.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "exampleTag")
@RestController
@RequestMapping("/api")
public class ApiController {
    @Operation(description = "this is description")
    @RequestMapping(value = "/cmd1", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse apiCommand1() {
        return new ApiResponse("pong1");
    }

    @Operation(description = "this is description")
    @RequestMapping(value = "/cmd2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse apiCommand2() {
        return new ApiResponse("pong2");
    }
}