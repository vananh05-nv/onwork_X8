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

WebUI.setText(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/span_ng nhp'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/a'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/a_1'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/a_Quy trnh mu'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/a_Quy trnh lm vic'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/a_Chnh sa'))

WebUI.setText(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/input__listSteps.0.stepName'), 'gd1')

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/input__select-step-admin-id-0'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/p_L Phng Anh - Phng HCNS'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/input__select-step-admin-id-0'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/p_Admin - Ban Gim c'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/input_Ngi thc hin giai on_select-step-actio_1c198d'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/p_Phm Ngc Minh - Phng d n'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/input_Ngi thc hin giai on_select-step-actio_1c198d'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/p_Nguyn Ngc Trnh - BD02 ADS HN'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/button_Lu'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình mẫu/div_Chnh sa cu hnh quy trnh thnh cng'))

