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

WebUI.setText(findTestObject('Dự án/Sửa dự án/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Dự án/Sửa dự án/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Dự án/Sửa dự án/span_ng nhp'))

WebUI.click(findTestObject('Dự án/Sửa dự án/a'))

WebUI.click(findTestObject('Dự án/Sửa dự án/button_d n abc_MuiButtonBase-root MuiButton_18c8aa'))

WebUI.click(findTestObject('Dự án/Sửa dự án/li_Sa'))

WebUI.click(findTestObject('Dự án/Sửa dự án/svg_Admin - Ban Gim c_MuiChip-deleteIcon'))

WebUI.click(findTestObject('Dự án/Sửa dự án/input_L Phng Anh - Phng HCNS_select-multiple-admin'))

WebUI.click(findTestObject('Dự án/Sửa dự án/p_Phm Ngc Minh - P.Test'))

WebUI.click(findTestObject('Dự án/Sửa dự án/input_Phm Ngc Minh - P.Test_select-multiple-member'))

WebUI.click(findTestObject('Dự án/Sửa dự án/p_Nguyn c t - BD01 ADS HN'))

WebUI.click(findTestObject('Dự án/Sửa dự án/input_Phm Th Nht L - BD01 ADS HN_select-use_d55287'))

WebUI.click(findTestObject('Dự án/Sửa dự án/p_Nguyn Ngc Trnh - BD02 ADS HN'))

WebUI.click(findTestObject('Dự án/Sửa dự án/button_Lu'))

WebUI.click(findTestObject('Dự án/Sửa dự án/div_Cp nht d n thnh cng'))

