package com.recipe.recipe.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Document;
import com.recipe.recipe.dto.PdfDTO;
import com.recipe.recipe.utils.PdfReportUtils;
import jakarta.servlet.http.HttpServletResponse;
import com.recipe.recipe.report.ReportAbstract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class ExportToPdfService extends ReportAbstract {

    public void exportToPdf(HttpServletResponse response, String payload) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            PdfDTO pdfDTO = objectMapper.readValue(payload, PdfDTO.class);

            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment; filename=test.pdf");

            Document document = new Document();
            PdfWriter.getInstance(document, response.getOutputStream());

            document.open();

            // Entête

            // Corps
            PdfReportUtils pdfReportUtils = new PdfReportUtils();
            pdfReportUtils.createTable(document, pdfDTO.getHeaders(), pdfDTO.getBody());

            document.close();
            response.getOutputStream().flush();
            response.getOutputStream().close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
