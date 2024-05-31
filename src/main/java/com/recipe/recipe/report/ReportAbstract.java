package com.recipe.recipe.report;

import jakarta.servlet.http.HttpServletResponse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportAbstract {
    public HttpServletResponse initResponseForExportPdf(HttpServletResponse response, String fileName) {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + fileName + "_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
        return response;
    }
}
