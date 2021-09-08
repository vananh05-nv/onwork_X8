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

WebUI.setText(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/input_Tp on Digital NOVAON_userName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/span_ng nhp'))

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/a'))

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/a_QT01'))

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/a_Tt c'))

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/span_test auto'))

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/button_Chuyn tip'))

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/input__select-tag-work'))

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/p_Admin'))

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/button_Lu'))

WebUI.click(findTestObject('Quản lý quy trình/Chuyển tiếp nhiệm vụ trong quy trình/div_Chuyn tip thnh cng'))

