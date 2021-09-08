import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.onwork.vn/auth/login')

WebUI.setText(findTestObject('cài đặt/Thêm cây tổ chức/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('cài đặt/Thêm cây tổ chức/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/span_ng nhp'))

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/a'))

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/a_Cy t chc'))

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/button_Thm'))

WebUI.setText(findTestObject('cài đặt/Thêm cây tổ chức/input__organizationCode'), '123')

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/input_Trng thi_select-multiple-staff'))

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/p_Hot ng'))

WebUI.setText(findTestObject('cài đặt/Thêm cây tổ chức/input__organizationName'), 'tech01')

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/input_Trng thi_select-multiple-staff'))

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/p_Vn phng H Ni 2'))

WebUI.setText(findTestObject('cài đặt/Thêm cây tổ chức/input_a ch_address'), 'Hà Nội')

WebUI.setText(findTestObject('cài đặt/Thêm cây tổ chức/input_S in thoi_phone'), '0965487345')

WebUI.setText(findTestObject('cài đặt/Thêm cây tổ chức/input_Email_email'), 'anh@gmail.com')

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/button_Lu'))

WebUI.click(findTestObject('cài đặt/Thêm cây tổ chức/div_Thm thnh cng'))

