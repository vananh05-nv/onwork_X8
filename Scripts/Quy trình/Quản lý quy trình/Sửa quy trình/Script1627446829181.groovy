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

WebUI.setText(findTestObject('Quản lý quy trình/Sửa quy trình/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Quản lý quy trình/Sửa quy trình/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/span_ng nhp'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/a'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/button_-_MuiButtonBase-root MuiButton-root _17dd25'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/li_Sa'))

WebUI.delay(1)

//WebUI.clearText(findTestObject('Quản lý quy trình/Sửa quy trình/input__listSteps.0.stepName'), FailureHandling.STOP_ON_FAILURE)
'Press Ctrl+A to select all text in txt_Comment'
WebUI.sendKeys(findTestObject('Quản lý quy trình/Sửa quy trình/input__listSteps.0.stepName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Quản lý quy trình/Sửa quy trình/input__listSteps.0.stepName'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Quản lý quy trình/Sửa quy trình/input__listSteps.0.stepName'), 'gd 1')

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/input__select-step-admin-id-0'))

WebUI.setText(findTestObject('Quản lý quy trình/Sửa quy trình/input_người quản trị'), 'Lê Phương Anh - Phòng HCNS')

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/p_L Phng Anh - Phng HCNS'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/input_Ngi thc hin giai on_select-step-actio_1c198d'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/p_Admin - Ban Gim c'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/button_Lu'))

WebUI.click(findTestObject('Quản lý quy trình/Sửa quy trình/div_Chnh sa cu hnh quy trnh thnh cng'))

