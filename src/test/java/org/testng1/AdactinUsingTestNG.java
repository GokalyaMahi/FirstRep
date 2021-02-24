package org.testng1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinUsingTestNG extends LibGlobal {

	@Parameters({ "username", "password" })
	@Test
	public void tc0(String s, String s1) throws IOException {
		getDriver();

		launchUrl(driver, "http://adactinhotelapp.com/");

		maxWindow(driver);

		AdactinLoginPage a = new AdactinLoginPage();

		type(a.getTxtUser(), s);

		type(a.getTxtPass(), s1);

		String attribute = getAttribute(a.getTxtUser());

		excelWrite("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx", 0,
				0, attribute);

		String attribute2 = getAttribute(a.getTxtPass());

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				1, 0, attribute2);

		btnClick(a.getBtnLogin());

	}

	@Parameters({ "dropLocation", "dropHotels", "dropRoomType", "dropRoomNos", "txtCheckin", "txtCheckout",
			"dropAdults", "dropChild" })
	@Test
	private void tc01(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7)
			throws IOException {
		AdactionSearchHotelPage a = new AdactionSearchHotelPage();

		selectByValue(a.getDropLocation(), s);

		String attribute = getAttribute(a.getDropLocation());

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				2, 0, attribute);

		selectByVisibleText(a.getDropHotels(), s1);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				3, 0, getAttribute(a.getDropHotels()));

		selectByVisibleText(a.getDropRoomType(), s2);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				4, 0, getAttribute(a.getDropRoomType()));

		selectByValue(a.getDropRoomNos(), s3);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				5, 0, getAttribute(a.getDropRoomNos()));

		WebElement txtCheckin = a.getTxtCheckin();
		txtCheckin.clear();

		type(txtCheckin, s4);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				6, 0, getAttribute(a.getTxtCheckin()));

		WebElement txtCheckout = a.getTxtCheckout();
		txtCheckout.clear();

		type(txtCheckout, s5);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				7, 0, getAttribute(a.getTxtCheckout()));

		selectByVisibleText(a.getDropAdults(), s6);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				8, 0, getAttribute(a.getDropAdults()));

		selectByVisibleText(a.getDropChild(), s7);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				9, 0, getAttribute(a.getDropChild()));

		btnClick(a.getBtnSearch());

	}

	@Test
	private void tc02() {
		AdactinSelectHotelPage a = new AdactinSelectHotelPage();

		btnClick(a.getBtnRadio());

		btnClick(a.getBtnContinue());
	}

	@Parameters({ "txtFirst", "txtLast", "txtAddress", "txtCCNum", "txtCCType", "dropExpMonth", "dropYear", "txtCCV" })
	@Test
	private void tc03(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7)
			throws IOException {
		AdactinBookHotelPage a = new AdactinBookHotelPage();

		type(a.getTxtFirst(), s);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				10, 0, getAttribute(a.getTxtFirst()));

		type(a.getTxtLast(), s1);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				11, 0, getAttribute(a.getTxtLast()));

		type(a.getTxtAddress(), s2);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				12, 0, getAttribute(a.getTxtAddress()));

		type(a.getTxtCCNum(), s3);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				13, 0, getAttribute(a.getTxtCCNum()));

		selectByValue(a.getDropCCType(), s4);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				14, 0, getAttribute(a.getDropCCType()));

		selectByVisibleText(a.getDropExpMonth(), s5);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				15, 0, getAttribute(a.getDropExpMonth()));

		selectByVisibleText(a.getDropExpYear(), s6);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				16, 0, getAttribute(a.getDropExpYear()));

		type(a.getTxtCCV(), s7);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				17, 0, getAttribute(a.getTxtCCV()));

		btnClick(a.getBtnBook());
	}

	@Test
	private void tc04() throws InterruptedException, IOException {

		sleep(6000);

		AdactinGetOrder a = new AdactinGetOrder();

		String attribute = getAttribute(a.getTxtOrderNo());

		System.out.println("Order No. is " + attribute);

		excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Excel\\AdactinExcelWrite.xlsx",
				18, 0, "Order No. is " + getAttribute(a.getTxtOrderNo()));

	}
}
