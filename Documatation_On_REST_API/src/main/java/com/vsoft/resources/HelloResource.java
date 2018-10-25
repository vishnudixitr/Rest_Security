package com.vsoft.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "HelloWorld Resource", description = "shows hello world")
public class HelloResource {

    @ApiOperation(value = "Welcome Message ")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Hello World")
            }
    )
    @GetMapping
    public String hello() {
        return "welcome to vsoft";
    }

    @ApiOperation(value = "save the data ")
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }

    @ApiOperation(value = "Update the data")
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }
}

