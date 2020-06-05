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

WebUI.setText(findTestObject('Object Repository/23/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'vanhoang')

WebUI.setEncryptedText(findTestObject('Object Repository/23/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/23/Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('Object Repository/25/Page_ Town Square - aaaaaaaaaa Mattermost/div_te'))

WebUI.click(findTestObject('Object Repository/23/Page_Town Square -  Mattermost/button_vanhoang_style--none sidebar-header-_1c3d3c'))

WebUI.click(findTestObject('Object Repository/23/Page_Town Square -  Mattermost/button_Invite PeopleAdd or invite people to_5d2fc4'))

WebUI.click(findTestObject('Object Repository/23/Page_Town Square -  Mattermost/div_Add members or email addresses'))

for (def rowNum = 1; rowNum < 6; rowNum++) {
    WebUI.setText(findTestObject('Object Repository/23/Page_Town Square -  Mattermost/input_Add members or email addresses_react-_5a852a'), 
        findTestData('23').getValue(1, rowNum))

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/23/Page_Town Square -  Mattermost/span_No one found'), 
        2, FailureHandling.OPTIONAL)) {
        //Xoa du lieu dax nhap
        WebUI.sendKeys(findTestObject('Object Repository/23/Page_Town Square -  Mattermost/input_Add members or email addresses_react-_5a852a'), 
            Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))
    } else {
        WebUI.sendKeys(findTestObject('Object Repository/23/Page_Town Square -  Mattermost/input_Add members or email addresses_react-_5a852a'), 
            Keys.chord(Keys.ENTER))
    }
}

WebUI.click(findTestObject('Object Repository/23/Page_Town Square -  Mattermost/button_Invite Members'))

WebUI.click(findTestObject('Object Repository/23/Page_Town Square -  Mattermost/button_Done'))

