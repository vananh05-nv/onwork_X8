package duan

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Select {

	@Keyword
	def getMultiSelect (TestObject to, String ops) {
		String [] op = ops.split(',')
		if (op.size()>1) {
			for (int i=0;i<op.length();i++) {
				WebUI.click (to)
				WebUI.setText(to, op[i].trim())
				WebUI.click(findTestObject('Chung/Chọn giá trị trong MutilSelect',[('op'):(op[i].trim())]))
			}
		}
		else {
			WebUI.click(to)
			WebUI.setText(to, ops.trim())
			WebUI.click(findTestObject('chung/Chọn giá trị trong MultiSelect',[('op'):ops]))
		}
	}
}
