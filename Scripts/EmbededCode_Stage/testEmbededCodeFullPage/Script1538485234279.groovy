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

CustomKeywords.'test.AbstractWeb.loginKVC'(GlobalVariable.qaUserLogin, GlobalVariable.qaUserPass, 'QASharingFeaturesEnabled')

WebUI.waitForElementPresent(findTestObject('Page_KnovioLibrary/span_Share_presentation_852'), GlobalVariable.mediumWait)

WebUI.click(findTestObject('Page_KnovioLibrary/span_Share_presentation_852'))

WebUI.waitForPageLoad(GlobalVariable.mediumWait)

WebUI.waitForElementPresent(findTestObject('EmbededCode/a_Get Embed Code_btn852'), GlobalVariable.shortWait)

WebUI.click(findTestObject('EmbededCode/a_Get Embed Code_btn852'))

WebUI.delay(GlobalVariable.shortWait)

WebUI.waitForElementPresent(findTestObject('EmbededCode/a_Full Page'), GlobalVariable.mediumWait)

WebUI.click(findTestObject('EmbededCode/a_Full Page'))

WebUI.verifyElementAttributeValue(findTestObject('EmbededCode/a_Full Page'), 'href', 'https://stage-library.kvcentral.com/#fullpage_embed_code', 
    GlobalVariable.shortWait)

