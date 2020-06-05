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

WebUI.setEncryptedText(findTestObject('Object Repository/16/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/16/Page_Mattermost/button_Sign in'))

ad = WebUI.modifyObjectProperty(findTestObject('Object Repository/15/Page_Town Square -  Mattermost/div_vanhoang_hxfw68i8tj8ninrkibcq3fuhpr_message'), 
    'id', 'equals', ID, true)

WebUI.mouseOver(ad)

WebUI.click(findTestObject('Object Repository/15/Page_Town Square -  Mattermost/svg'))

ad1 = WebUI.modifyObjectProperty(findTestObject('Object Repository/15/Page_Town Square -  Mattermost/img_People_emoji-1f643'), 
    'id', 'equals', ID, true)

WebUI.click(ad1)

//WebUI.click(findTestObject('Object Repository/15/Page_Town Square -  Mattermost/img_People_emoji-1f643'))

