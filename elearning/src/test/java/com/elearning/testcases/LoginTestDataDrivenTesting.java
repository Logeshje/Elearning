package com.elearning.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.elearning.pages.BaseTest;
import com.elearning.pages.LoginPage;
import com.elearning.utility.ReadExcelFile;

public class LoginTestDataDrivenTesting extends BaseTest {
	String fileName="C:\\Users\\Testi\\Desktop\\TestInfo.xlsx";

	@Test(priority =1,dataProvider="LoginDataProvider")
	public void VerifyLogin(String userEmail,String userPwd)
	{
		LoginPage lp=new LoginPage(driver);

		lp.loginPortal(userEmail, userPwd);
		lp.logout();
	}
	
	
	@DataProvider(name="LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		
		
		int ttlRows= ReadExcelFile.getRowCount(fileName, "LoginData");
		int ttlColumns= ReadExcelFile.getColCount(fileName, "LoginData");
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
			for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
			}
		}
		return data;
	}
}
