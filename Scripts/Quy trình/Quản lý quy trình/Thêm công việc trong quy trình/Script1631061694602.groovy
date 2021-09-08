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

WebUI.click(findTestObject('Quản lý quy trình/Thêm công việc trong quy trình/a'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm công việc trong quy trình/a_demo'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm công việc trong quy trình/a_Tt c'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm công việc trong quy trình/button_Thm'))

WebUI.setText(findTestObject('Quản lý quy trình/Thêm công việc trong quy trình/input__name'), 'NV03')

WebUI.click(findTestObject('Quản lý quy trình/Thêm công việc trong quy trình/div_Trung bnh'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm công việc trong quy trình/div_Cao'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm công việc trong quy trình/button_Thm mi'))

WebUI.click(findTestObject('Quản lý quy trình/Thêm công việc trong quy trình/div_Thm mi thnh cng'))

