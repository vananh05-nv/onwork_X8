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

WebUI.click(findTestObject('Dự án/Lọc công việc trong dự án/a'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án/label_Thời gian tạo'))

WebUI.click(findTestObject('Dự án/Lọc công việc trong dự án/a_d n abc'))

WebUI.click(findTestObject('Dự án/Lọc công việc trong dự án/a_Tt c'))

WebUI.click(findTestObject('Dự án/Lọc công việc trong dự án/button_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Dự án/Lọc công việc trong dự án/input_B lc_jss111'))

WebUI.click(findTestObject('Dự án/Lọc công việc trong dự án/button_sổ xuống'))

WebUI.delay(1)

WebUI.setText(findTestObject('Dự án/Lọc công việc trong dự án/Input_chọn kiểu lọc'), 'Contains')

WebUI.click(findTestObject('Dự án/Lọc công việc trong dự án/li_Type filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Dự án/Lọc công việc trong dự án/input_filterValue'), 'CV')

WebUI.delay(1)

WebUI.click(findTestObject('Dự án/Lọc công việc trong dự án/button_p dng'))

WebUI.delay(1)

CustomKeywords.'CheckColumnFilter.checkColumnFilter'('CV')

WebUI.mouseOver(findTestObject('Dự án/Lọc công việc trong dự án/button_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Dự án/Lọc công việc trong dự án/item_Hủy lọc'))

