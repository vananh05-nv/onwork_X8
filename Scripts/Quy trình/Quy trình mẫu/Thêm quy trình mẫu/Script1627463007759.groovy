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

WebUI.setText(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/input_Tp on Digital NOVAON_userName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/input__password'), 'MMTz1tzyjW/IHI2ypnnM3g==')

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/span_ng nhp'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/a'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/a_Quy trnh mu'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/span__MuiButton-label'))

WebUI.setText(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/input__name'), 'Quy trình làm việc ')

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/input_Admin - Ban Gim c_select-user-admin'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/p_3 - Ban T Vn thit k'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/input_Nhm quy trnhphng ban_select-department-group'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/li_Nhm khc'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/input_Admin - Ban Gim c_select-user-perwork-add'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/p_Trn Thnh Trung  - Phng trin khai'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/input_Ngi theo di_select-user-follow'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/p_Admin Sale  - P.Test'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/button_Lu'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình mẫu/div_Thm mi quy trnh thnh cng'))

