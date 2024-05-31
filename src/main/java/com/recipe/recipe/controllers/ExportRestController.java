package com.recipe.recipe.controllers;

import com.recipe.recipe.service.ExportToPdfService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/export")
public class ExportRestController {

    private static final Log log = LogFactory.getLog(ExportRestController.class);
    @Autowired
    ExportToPdfService exportToPdfService;

    @PostMapping("")
    public void exportToPdf(HttpServletResponse response, @RequestBody String payload) {
        this.exportToPdfService.exportToPdf(response, payload);
    }
}
