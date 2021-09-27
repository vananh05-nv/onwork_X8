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

WebUI.setText(findTestObject('Dự án/bình luận trong dự án/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Dự án/bình luận trong dự án/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Dự án/bình luận trong dự án/span_ng nhp'))

WebUI.click(findTestObject('Dự án/bình luận trong dự án/a'))

WebUI.click(findTestObject('Dự án/bình luận trong dự án/th_Thi gian to'))

WebUI.click(findTestObject('Dự án/bình luận trong dự án/a_d n abc'))

WebUI.setText(findTestObject('Dự án/bình luận trong dự án/textarea_a'), 'Dự án tốt')

WebUI.sendKeys(findTestObject('Dự án/bình luận trong dự án/textarea_a'), Keys.chord(Keys.ENTER))

