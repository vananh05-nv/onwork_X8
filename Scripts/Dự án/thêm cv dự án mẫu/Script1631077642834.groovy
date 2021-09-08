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

WebUI.setText(findTestObject('Dự án/Thêm cv trong dự án mẫu/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Dự án/Thêm cv trong dự án mẫu/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/span_ng nhp'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/a'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/a_D n mu'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/th_Ngy to'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/a_d n 123'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/button_Thm'))

WebUI.setText(findTestObject('Dự án/Thêm cv trong dự án mẫu/input__name'), 'viết testcase')

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/div_ct 1'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/div_ct 1_1'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/div_Trung bnh'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/div_Cao'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/button_Thm mi'))

WebUI.click(findTestObject('Dự án/Thêm cv trong dự án mẫu/div_Thm mi nhim v thnh cng'))

