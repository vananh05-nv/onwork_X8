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

WebUI.navigateToUrl('https://demo.onwork.vn/work-management/project')

WebUI.setText(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input_Tp on Digital NOVAON_userName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/span_ng nhp'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/a'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/a_Danh sch nhn s'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/button_Thm'))

WebUI.setText(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input__staffCode'), '123')

WebUI.setText(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input__name'), 'mai thị vân anh')

WebUI.setText(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input__userName'), 'anhhh')

WebUI.setEncryptedText(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input__password_1'), 'aeHFOx8jV/A=')

WebUI.setText(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input_S in thoi lm vic_phone'), '096538267')

WebUI.setText(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input_Email_email'), 'anh@gmail.com')

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input__select-manager'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/p_Admin - 2 - Ban Gim c'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input__select-position'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/p_Thc tp'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input__select-organization'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/p_Vn phng H Ni 2'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input_Trng thi_select-status'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/p_Hot ng'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/input_Nhm quyn_select-role'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/p_Nhn vin'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/button_Lu'))

WebUI.click(findTestObject('cài đặt/Nhân sự/Thêm nhân sự/div_Thnh cng'))

