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

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_703ef5'), 'vanhoang')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - test Mattermost/button_vanhoang_style--none sidebar-header-_1c3d3c'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - test Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - test Mattermost/button_Security'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - aaaaaaaaaa Mattermost/div_PasswordEdit'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - test Mattermost/input_Current Password_currentPassword'), 
    curpwd)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - test Mattermost/input_New Password_newPassword'), newpwd)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - test Mattermost/input_Retype New Password_confirmPassword'), 
    newpwd1)

WebUI.click(findTestObject('Object Repository/Page_Town Square - test Mattermost/span_Save'))

WebUI.closeBrowser()

