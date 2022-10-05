package techproed.tests.excelautomation;

import org.testng.annotations.Test;
import techproed.utilities.ExcelUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelSetValue {
    @Test
    public void writeExcel() throws FileNotFoundException {
        String path="./src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName="customer_info";
        ExcelUtil excelUtil=new ExcelUtil(path,sheetName);
        excelUtil.setCellData("customer8@bluerentalcars.com",1,0);
        excelUtil.setCellData("98765",1,1);
        excelUtil.setCellData("customer7@bluerentalcars.com",2,0);
        excelUtil.setCellData("98764",2,1);
        excelUtil.setCellData("customer6@bluerentalcars.com",3,0);
        excelUtil.setCellData("98763",3,1);
        excelUtil.setCellData("customer5@bluerentalcars.com",4,0);
        excelUtil.setCellData("98762",4,1);



    }
}
