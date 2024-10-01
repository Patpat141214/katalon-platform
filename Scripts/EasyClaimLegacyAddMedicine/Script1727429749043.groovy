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

WebUI.setText(findTestObject('Object Repository/AddMedicine/Page_Login - Easy Claims/input_Username_Username'), 'patcheadmin2')

WebUI.setEncryptedText(findTestObject('Object Repository/AddMedicine/Page_Login - Easy Claims/input_Password_Password'), 
    'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Login - Easy Claims/input_Password_submitBtn'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Connect - Easy Claims/span_Medicine'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/input_admin_k-button'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/span_Select one_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/li_01961'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/span_Select one_k-icon k-i-arrow-60-down_1'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/li_00003'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/span_Select one_k-select'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/li_00004'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/span_Select one_k-icon k-i-arrow-60-down_1_2'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/li_AEROS'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/span_Select one_k-icon k-i-arrow-60-down_1_2_3'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/li_00004_1'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/span_Select one_k-icon k-i-arrow-60-down_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/li_100PC'))

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/input_Price_Price'))

WebUI.sendKeys(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/input_Price_Price'), '200')

WebUI.click(findTestObject('Object Repository/AddMedicine/Page_Medicine - Easy Claims/input_Price_SubmitBtn'))

