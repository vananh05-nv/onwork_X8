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

WebUI.setText(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/input_Tp on Digital NOVAON_userName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/span_ng nhp'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/a'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/a_Danh sch nhn s'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/button_Thc tp_MuiButtonBase-root MuiButton-_23a774'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/li_Sa'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/div_M nhn s M nhn s H v tn H v tn Tn ng nhp_2f55dd'))

WebUI.setText(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/input__staffCode'), '1456')

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/input__select-manager'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/p_Phm Ngc Minh - 1234 - Phng HCNS'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/input__select-position'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/p_Ph phng'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/input__select-organization'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/p_Phng d n'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/button_Cp nht'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Sửa nhân sự/div_Thnh cng'))

