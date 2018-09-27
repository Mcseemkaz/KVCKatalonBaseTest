import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Login to KVC
WebUI.openBrowser(urlKVC)

WebUI.sendKeys(findTestObject('Page_Knovio Login/input_Email Address_email'), 'qauser@mail.ua')

WebUI.sendKeys(findTestObject('Page_Knovio Login/input_Password_password'), 'kvstudio1')

WebUI.click(findTestObject('Page_Knovio Login/button_Sign In'))

WebUI.waitForPageLoad(3)

WebUI.selectOptionByLabel(findTestObject('Page_Knovio Login/select_GVAccountStage'), 'QASharingFeaturesEnabled', false)

WebUI.click(findTestObject('Page_Knovio Login/button_Continue'))

WebUI.waitForPageLoad(10)


//
// Share

WebUI.waitForElementVisible(findTestObject('Page_KnovioLibrary/span_Share_presentation_852'), 10)

WebUI.click(findTestObject('Page_KnovioLibrary/span_Share_presentation_852'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementVisible(findTestObject('Page_KnovioLibrary/a_Get Embed Code_btn852'), 10)

WebUI.click(findTestObject('Page_KnovioLibrary/a_Get Embed Code_btn852'))

WebUI.waitForElementNotVisible(findTestObject('Page_KnovioLibrary/a_Get Embed Code_btn852'), 10)

WebUI.verifyElementAttributeValue(findTestObject('Page_KnovioLibrary/a_Get Embed Code_btn852'), 'style', 'display: none;', 
    10)

System.out.println("Passed");


