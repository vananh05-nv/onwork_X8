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

WebUI.setText(findTestObject('Dự án/Thêm công việc trong dự án/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Dự án/Thêm công việc trong dự án/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/span_ng nhp'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/a'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/label_Thời gian tạo'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/a_d n abc'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/a_Tt c'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/button_Thm'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/li_Thm cng vic'))

WebUI.setText(findTestObject('Dự án/Thêm công việc trong dự án/input__name'), 'Làm hợp đồng')

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/div__user-select_actionIcon__6tLJr'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/input_Admin_jss103'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/div'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/div_ct 1'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/div_ct 2'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/div_Trung bnh'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/div_Gp'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/button_Thm mi'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/div_Thm mi nhim v thnh cng'))

