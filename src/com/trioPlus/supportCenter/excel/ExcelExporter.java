package com.trioPlus.supportCenter.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.trioPlus.supportCenter.excel.layout.Layouter;
import com.trioPlus.supportCenter.form.TravelCostForm;

public class ExcelExporter extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	 
		List<TravelCostForm> revenueData = (List<TravelCostForm>) model.get("travels");
			//create a wordsheet
			HSSFSheet sheet = workbook.createSheet("Travel Report");
	 
			
			 
			  // 3. Define starting indices for rows and columns
			  int startRowIndex = 0;
			  int startColIndex = 0;
			 Layouter.buildReport(sheet, startRowIndex, startColIndex);
//			HSSFRow header = sheet.createRow(0);
//			header.createCell(0).setCellValue("User ID");
//			header.createCell(1).setCellValue("User Name");
//			header.createCell(2).setCellValue("Start Date");
//			header.createCell(3).setCellValue("End Date");
//			header.createCell(4).setCellValue("Destination");
//			header.createCell(5).setCellValue("Staying Period");
//			header.createCell(6).setCellValue("Flight Cost");
//			header.createCell(7).setCellValue("Accoumadtion");
//			
//			header.createCell(8).setCellValue("Currency");
//			header.createCell(9).setCellValue("Perduim");
//			header.createCell(10).setCellValue("Total");
//			
//			
//			
//			
			int rowNum =3 ;
			HSSFCellStyle bodyCellStyle = sheet.getWorkbook().createCellStyle();
			  bodyCellStyle.setAlignment(CellStyle.ALIGN_CENTER);
			  bodyCellStyle.setWrapText(true);
			  
			for (TravelCostForm entry : revenueData) {
				//create the row data
				HSSFRow row = sheet.createRow(rowNum++);
				row.createCell(0).setCellValue(entry.getUser_id());
				row.getCell(0).setCellStyle(bodyCellStyle);
				row.createCell(1).setCellValue(entry.getEmpName());
				row.getCell(1).setCellStyle(bodyCellStyle);
				row.createCell(2).setCellValue(entry.getStartDate());
				row.getCell(2).setCellStyle(bodyCellStyle);
				row.createCell(3).setCellValue(entry.getEndDate());
				row.getCell(3).setCellStyle(bodyCellStyle);
				row.createCell(4).setCellValue(entry.getDestName());
				row.getCell(4).setCellStyle(bodyCellStyle);
				row.createCell(5).setCellValue(entry.getEndDate().getTime()-entry.getStartDate().getTime()/ (1000*60*60*24));
				row.getCell(5).setCellStyle(bodyCellStyle);
				row.createCell(6).setCellValue(entry.getFlightCost());
				row.getCell(6).setCellStyle(bodyCellStyle);
				row.createCell(7).setCellValue(entry.getAccomodation());
				row.getCell(7).setCellStyle(bodyCellStyle);
				row.createCell(8).setCellValue(entry.getCurrency());
				row.getCell(8).setCellStyle(bodyCellStyle);
				row.createCell(9).setCellValue(entry.getPerduim());
				row.getCell(9).setCellStyle(bodyCellStyle);
				row.createCell(10).setCellValue(entry.getTotal());
				row.getCell(10).setCellStyle(bodyCellStyle);
	                }
		}

}
