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

WebUI.callTestCase(findTestCase('Đăng nhập/Đăng nhập'), [('username') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/a'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/button_Thm'))

WebUI.setText(findTestObject('Quản lý quy trình/Thêm quy trình/input__name'), 'QT 01')

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/input_L Th An - HR HN_select-user-admin'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/li_Adminstrator -'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/input_Nhm quy trnhphng ban_select-department-group'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/p_Nhm khc'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/div_Ngi thc hin_MuiAutocomplete-endAdornment jss96'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/input_Ngi thc hin_select-user-assign'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/input_L Th An - HR HN_select-user-perwork-add'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/p_Trng Ngc Kho -'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/input_Ngi theo di_select-user-follow'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/p_Adminstrator -'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/button_Lu'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm quy trình/div_Thm mi quy trnh thnh cng'))

