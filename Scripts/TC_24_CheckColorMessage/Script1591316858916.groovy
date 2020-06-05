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

WebUI.setText(findTestObject('Object Repository/15/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'vanhoang')

WebUI.setEncryptedText(findTestObject('Object Repository/15/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/15/Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('Object Repository/15/Page_Town Square -  Mattermost/time_223 PM'))

def css_color = WebUI.getCSSValue(findTestObject('Object Repository/15/Page_Town Square -  Mattermost/div_vanhoang223 PM'), 
    'color')

println(css_color)

WebUI.verifyEqual(css_color, 'rgb(61, 60, 64)')

