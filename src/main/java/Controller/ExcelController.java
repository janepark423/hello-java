package Controller;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ExcelController {

    public void downloadExcel(HttpServletResponse response) throws IOException{
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("게시판글들");
        int rowNo = 0;

        Row headerRow = sheet.createRow(rowNo++);
        headerRow.createCell(0).setCellValue("글 번호");
        headerRow.createCell(1).setCellValue("작성자");
        headerRow.createCell(2).setCellValue("제목");
        headerRow.createCell(3).setCellValue("내용");
    }
}
