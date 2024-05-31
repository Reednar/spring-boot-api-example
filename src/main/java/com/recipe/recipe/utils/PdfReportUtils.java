package com.recipe.recipe.utils;

import com.lowagie.text.*;
import com.lowagie.text.Document;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.recipe.recipe.dto.BodyDTO;
import com.recipe.recipe.dto.HeaderDTO;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class PdfReportUtils {

    public void writeTableHeaderPdf(PdfPTable table, List<HeaderDTO> headers) {

        table.setWidthPercentage(100);

        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.decode("#004652"));

        for (HeaderDTO header : headers) {
            cell.setPhrase(new Paragraph(header.getHeaderName(), getFontHeader()));
            table.addCell(cell);
        }
    }

    public void writeTableContentPdf(PdfPTable table, List<BodyDTO> contents) {

        table.setWidthPercentage(100);

        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.decode("#F7F8FA"));

        for (BodyDTO content : contents) {
            cell.setPhrase(new Paragraph(content.getDateEnrol(), getFontentContent()));
            table.addCell(cell);

            cell.setPhrase(new Paragraph(content.getDateMaj(), getFontentContent()));
            table.addCell(cell);

            cell.setPhrase(new Paragraph(content.getIdPivot(), getFontentContent()));
            table.addCell(cell);

            cell.setPhrase(new Paragraph(content.getKey(), getFontentContent()));
            table.addCell(cell);

            cell.setPhrase(new Paragraph(content.getStatut(), getFontentContent()));
            table.addCell(cell);

            cell.setPhrase(new Paragraph(content.getMoyen(), getFontentContent()));
            table.addCell(cell);

            cell.setPhrase(new Paragraph(content.getIdApp(), getFontentContent()));
            table.addCell(cell);

            cell.setPhrase(new Paragraph(content.getMarque(), getFontentContent()));
            table.addCell(cell);

            cell.setPhrase(new Paragraph(content.getModele(), getFontentContent()));
            table.addCell(cell);

            cell.setPhrase(new Paragraph(content.getOs(), getFontentContent()));
            table.addCell(cell);
        }

    }

    public Font getFontHeader() {
        return new Font(Font.HELVETICA, 8, Font.BOLD, Color.WHITE);
    }

    public Font getFontentContent() {
        return new Font(Font.HELVETICA, 4, Font.COURIER, Color.BLACK);
    }

    public void createHeader(Document document, Image logo, String title, String date) {
        PdfPTable header = new PdfPTable(3);
        header.setTotalWidth(document.getPageSize().getWidth() - document.leftMargin() - document.rightMargin());
        header.setLockedWidth(true);

        logo.scaleAbsolute(150f, 40f);
        PdfPCell logoCell = new PdfPCell(logo);
        PdfPCell titleCell = new PdfPCell(new Paragraph(title));
        PdfPCell dateCell = new PdfPCell(new Paragraph(date));

        header.addCell(logoCell);
        header.addCell(titleCell);
        header.addCell(dateCell);

        document.add(header);
    }

    public void createTable(Document document, List<HeaderDTO> headers, List<BodyDTO> body) {
        PdfPTable tableHeader = new PdfPTable(headers.size());
        writeTableHeaderPdf(tableHeader, headers);
        document.add(tableHeader);

        PdfPTable tableData = new PdfPTable(headers.size());
        writeTableContentPdf(tableData, body);
        document.add(tableData);
    }

}
