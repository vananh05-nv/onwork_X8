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

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Dự án/Thêm công việc trong dự án mẫu/a'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/a'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/a_D n mu'))

WebUI.delay(2)

WebUI.setText(findTestObject('Dự án/Thêm công việc trong dự án mẫu/input_tìm kiếm'), 'dự án 123')

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/Label_Ngày tạo'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/Lấy dự án sau khi tìm kiếm'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/button_Thm'))

WebUI.setText(findTestObject('Dự án/Thêm công việc trong dự án mẫu/input__name'), 'Công việc dọn dẹp')

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/icon_người thực hiện'))

WebUI.setText(findTestObject('Dự án/Thêm công việc trong dự án mẫu/input_Timkiemnhansu'), 'Nguyễn Đức Đạt')

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/button_Tên nhân sự'))

WebUI.sendKeys(findTestObject('Dự án/Thêm công việc trong dự án mẫu/div_bị che'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/div_ct 1'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/div_ct 2'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/button_Thm mi'))

WebUI.click(findTestObject('Dự án/Thêm công việc trong dự án mẫu/div_Thm mi nhim v thnh cng'))

