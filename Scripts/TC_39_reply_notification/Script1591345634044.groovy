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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hw2katalonkattermost.herokuapp.com/login')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'vanhoang')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Page_ Town Square - aaaaaaaaaa Mattermost/svg'))

WebUI.click(findTestObject('Page_ Town Square - aaaaaaaaaa Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Page_ Town Square - aaaaaaaaaa Mattermost/button_Notifications'))

WebUI.click(findTestObject('Page_ Town Square - aaaaaaaaaa Mattermost/span_Edit'))

if (findTestObject('Object Repository/Page_ Town Square - aaaaaaaaaa Mattermost/label_Trigger notifications on messages in _a77cbe')) {
	WebUI.click(findTestObject('Object Repository/Page_ Town Square - aaaaaaaaaa Mattermost/label_Trigger notifications on messages in _3c6410'))
}

if (findTestObject('Object Repository/Page_ Town Square - aaaaaaaaaa Mattermost/label_Trigger notifications on messages in _3c6410')) {
	WebUI.click(findTestObject('Object Repository/Page_ Town Square - aaaaaaaaaa Mattermost/label_Do not trigger notifications on messa_d7ce81'))
}

if (findTestObject('Object Repository/Page_ Town Square - aaaaaaaaaa Mattermost/label_Do not trigger notifications on messa_d7ce81')) {
	WebUI.click(findTestObject('Object Repository/Page_ Town Square - aaaaaaaaaa Mattermost/label_Trigger notifications on messages in _a77cbe'))
}

WebUI.click(findTestObject('Page_ Town Square - aaaaaaaaaa Mattermost/span_Save'))

WebUI.closeBrowser()

