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

WebUI.setText(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/input_Tp on Digital NOVAON_userName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/span_ng nhp'))

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/a'))

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/button_Thm'))

WebUI.setText(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/input__name'), 'học automation')

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/div__user-select_actionIcon__6tLJr'))

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/input_Admin - 2 - Ban Gim c_jss81'))

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/div_Cng vic ring l 4'))

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/div_Thc hin'))

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/div_Trung bnh'))

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/div_Thp'))

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/button_Thm mi'))

WebUI.click(findTestObject('Công việc riêng lẻ/Thêm công việc riêng lẻ/div_Thm mi nhim v thnh cng'))

