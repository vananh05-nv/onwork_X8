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

WebUI.setText(findTestObject('cài đặt/Xóa cây tổ chức/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('cài đặt/Xóa cây tổ chức/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/span_ng nhp'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/a'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/a_Danh sch nhn s'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/a'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/a_Cy t chc'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/span_Tp on GLOBAL'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/span_Vn phng H Ni 2'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/span_tehteh'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/button_Xóa'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/span_Xa'))

WebUI.click(findTestObject('cài đặt/Xóa cây tổ chức/div_Xa thnh cng'))

