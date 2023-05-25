package com.example.demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadController {

    @GetMapping("/upload")
    public String showUploadPage() {
        return "upload"; // Assuming your HTML file is named upload.html
    }
}

