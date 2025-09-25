package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


	public XSSFSheet sheetData(String path,String sheetName) throws Exception {


		File file=new File(System.getProperty("user.dir")+path);
		FileInputStream fis=new FileInputStream(file);

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);

		String data=sheet.getRow(0).getCell(0).toString();
		System.out.println(data);
		return sheet;

	}



	public String[][] sheetDataInArray(String path,String sheetName) throws Exception {


		File file=new File(System.getProperty("user.dir")+path);
		FileInputStream fis=new FileInputStream(file);

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);

		String data=sheet.getRow(0).getCell(0).toString();
		System.out.println(data);


		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum()-1;

		String sheetData[][]=new String[row+1][col+1]; 

		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=col;j++)
			{
				sheetData[i][j]=sheet.getRow(i).getCell(j).toString();
				//System.out.print(data+"\t");
			}
			//System.out.println();
		}

		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=col;j++)
			{
				System.out.print(sheetData[i][j]+"\t");
			}
			System.out.println();
		}



		return sheetData;
	}

}
