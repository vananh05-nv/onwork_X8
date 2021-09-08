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

WebUI.navigateToUrl('https://demo.onwork.vn/dashboard')

WebUI.setText(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/input__password'), 'MMTz1tzyjW/IHI2ypnnM3g==')

WebUI.click(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/span_ng nhp'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/a'))

WebUI.mouseOver(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/a'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/a_Qun l nhim v'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/svg'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/li_Xa'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/span_Xa'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa nhiệm vụ/div_Xa cng vic thnh cng'))

