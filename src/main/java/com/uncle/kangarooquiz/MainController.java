package com.uncle.kangarooquiz;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/kangaroo-quiz")
public class MainController {

    @GetMapping(value = "", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> home() throws IOException {
        String htmlContent = readHtmlContent();
        return ResponseEntity.ok().body(htmlContent);
    }

    private String readHtmlContent() throws IOException {
        String filePath = "src/main/resources/static/index.html"; // Path to your HTML file
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
