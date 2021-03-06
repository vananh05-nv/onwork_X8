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

WebUI.click(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/a'))

WebUI.setText(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/input_Li_MuiInputBase-input MuiOutlinedInpu_efbd34'), 
    'dự án abc')

WebUI.sendKeys(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/input_Li_MuiInputBase-input MuiOutlinedInpu_efbd34'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Dự án/Page_Qun l cng vic/th_Thời gian tạo'))

WebUI.click(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/a_d n abc'))

WebUI.click(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/a_Kanban'))

WebUI.click(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/span_Thm ct'))

WebUI.setText(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/input_Hon thnh_MuiInputBase-input MuiOutlin_650231'), 
    'Cột 1')

WebUI.click(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/button'))

WebUI.click(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/span_Thm ct'))

WebUI.setText(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/input_Hon thnh_MuiInputBase-input MuiOutlin_650231'), 
    'Cột 2')

WebUI.click(findTestObject('Object Repository/Dự án/Page_Qun l cng vic/button'))

WebUI.click(findTestObject('Page_Qun l cng vic/div_Thm mi ct thnh cng'))

