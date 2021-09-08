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

WebUI.setText(findTestObject('Quản lý quy trình/Xóa quy trình/input_Tp on Digital NOVAON_userName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Quản lý quy trình/Xóa quy trình/input__password'), 'MMTz1tzyjW/IHI2ypnnM3g==')

WebUI.click(findTestObject('Quản lý quy trình/Xóa quy trình/span_ng nhp'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa quy trình/a'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa quy trình/span_Tip n nhn vin ban giao cho ngi qun l_M_f2e9e8'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa quy trình/li_Xa'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa quy trình/span_Xa'))

WebUI.click(findTestObject('Quản lý quy trình/Xóa quy trình/div_Xa quy trnh thnh cng'))

