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

WebUI.mouseOver(findTestObject('Dự án/Xóa dự án mẫu/a'))

WebUI.click(findTestObject('Dự án/Xóa dự án mẫu/a'))

WebUI.click(findTestObject('Dự án/Xóa dự án mẫu/a_D n mu'))

WebUI.click(findTestObject('Dự án/Xóa dự án mẫu/button_test_MuiButtonBase-root MuiButton-ro_deeffb'))

WebUI.click(findTestObject('Dự án/Xóa dự án mẫu/li_Xa'))

WebUI.click(findTestObject('Dự án/Xóa dự án mẫu/span_Xa'))

WebUI.click(findTestObject('Dự án/Xóa dự án mẫu/div_xa d n thnh cng'))

