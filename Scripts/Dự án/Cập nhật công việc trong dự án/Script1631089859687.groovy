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

WebUI.setText(findTestObject('Dự án/Cập nhật kết quả công việc/input_Tp on Digital NOVAON_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Dự án/Cập nhật kết quả công việc/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Dự án/Cập nhật kết quả công việc/span_ng nhp'))

WebUI.click(findTestObject('Dự án/Cập nhật kết quả công việc/a'))

WebUI.click(findTestObject('Dự án/Cập nhật kết quả công việc/th_Qun l'))

WebUI.click(findTestObject('Dự án/Cập nhật kết quả công việc/a_d n abc'))

WebUI.click(findTestObject('Dự án/Cập nhật kết quả công việc/a_Tt c'))

WebUI.click(findTestObject('Dự án/Cập nhật kết quả công việc/span_lm lnglm lng'))

WebUI.click(findTestObject('Dự án/Cập nhật kết quả công việc/button_Cp nht'))

WebUI.setText(findTestObject('Dự án/Cập nhật kết quả công việc/div_hc xong'), '<p data-slate-node="element" style=""><span data-slate-node="text"><span data-slate-leaf="true"><span data-slate-string="true" style="">học xong</span></span></span></p>')

WebUI.click(findTestObject('Dự án/Cập nhật kết quả công việc/button_Lu'))

WebUI.click(findTestObject('Dự án/Cập nhật kết quả công việc/div_Cp nht thnh cng'))

