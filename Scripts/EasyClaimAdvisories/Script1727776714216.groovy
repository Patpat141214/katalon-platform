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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.30.1.26/OPSUI.EasyClaims.Legacy/Account/Login?ReturnUrl=%2FOPSUI.EasyClaims.Legacy%2F')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Login - Easy Claims/input_Username_Username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Login - Easy Claims/input_Password_Password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Login - Easy Claims/input_Password_submitBtn'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Connect - Easy Claims/span_Advisories'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/span_Advisories_k-icon k-i-more-vertical'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/span_Sort Descending'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/span_Advisories_k-icon k-i-more-vertical'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/span_Sort Ascending'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/span_Advisories_k-icon k-i-more-vertical'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/span_Is equal to_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/li_Is equal to'))

WebUI.setText(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/input_Is equal to_k-textbox'), 
    '101')

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/button_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Adivisories - Easy Claims/Page_Advisories - Easy Claims/span_Control Panel'))

