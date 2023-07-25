//package com.jiffy.util;
//
//import java.io.*;
//import java.util.Date;
//import org.springframework.stereotype.Component;
//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.*;
//import com.jiffy.entity.ServiceRequest;
//
//@Component
//public class PDFGenerator {
//
//    public  void generateItinerary ( ServiceRequest request,String filePath) {
//    	
//        try {
//            Document document = new Document();
//            PdfWriter.getInstance(document,new FileOutputStream(filePath));
//            document.open();
//            document.add(generateTable(request));
//            document.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private PdfPTable generateTable(ServiceRequest request) {
//		
//    	PdfPTable table=new PdfPTable(2);   
//    	PdfPCell cell;
//    	
//        table.setWidthPercentage(100);
//        
//        cell = new PdfPCell(new Phrase("Service Details"));
//        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//        cell.setColspan(2);
//        table.addCell(cell);
//        
//        cell = new PdfPCell(new Phrase("Flight Details"));
//        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//        cell.setColspan(2);
//        table.addCell(cell);
//        
//        
//        table.addCell("Flight Number");
//        table.addCell(request.get);
//        
//        table.addCell("Operating Airlines");
//        table.addCell(reservation.getFlight().getOperatingAirlines());
//        		
//        table.addCell("Departure City");
//        table.addCell(reservation.getFlight().getDepartureCity());
//        
//        table.addCell("Arrival City");
//        table.addCell(reservation.getFlight().getArrivalCity());
//        
//        table.addCell("Departure Time");
//        table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
//        
//        cell = new PdfPCell(new Phrase("Passenger Detail"));
//        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//        cell.setColspan(2);
//        table.addCell(cell);
//        
//        table.addCell("First name");
//        table.addCell(reservation.getPassenger().getFirstName());
//        
//        table.addCell("Last name");
//        table.addCell(reservation.getPassenger().getLastName());
//        
//        table.addCell("Email");
//        table.addCell(reservation.getPassenger().getEmail());
//        
//        table.addCell("Phone Number");
//        table.addCell(reservation.getPassenger().getPhone());
//		return table;
//	}
//
//	// iText allows to add metadata to the PDF which can be viewed in your Adobe
//    // Reader
//    // under File -> Properties
////    private static void addMetaData(Document document) {
////        document.addTitle("My first PDF");
////        document.addSubject("Using iText");
////        document.addKeywords("Java, PDF, iText");
////        document.addAuthor("Lars Vogel");
////        document.addCreator("Lars Vogel");
////    }
//
//    }
//
//
