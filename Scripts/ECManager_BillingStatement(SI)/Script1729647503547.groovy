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

WebUI.navigateToUrl('http://172.30.1.26/ECManager_Sprint3/Account/Login?ReturnUrl=%2FECManager_Sprint3%2F')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Login - Easy Claims Manager/div_Username                               _345e58'))

WebUI.setText(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Login - Easy Claims Manager/input_Username_Username'), 
    'patche1412')

WebUI.setEncryptedText(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Login - Easy Claims Manager/input_Password_Password'), 
    'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Login - Easy Claims Manager/input_Password_submitBtn'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Home - Easy Claims Manager/span_Reports'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Account Receivable - Easy Claims Manager/span_Billing Statement'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Billing Statement Report - Easy Claims_285efc/span_TIN_k-icon k-i-more-vertical'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Billing Statement Report - Easy Claims_285efc/span_Filter'))

WebUI.setText(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Billing Statement Report - Easy Claims_285efc/input_Equals_k-textbox'), 
    'H08013394')

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Billing Statement Report - Easy Claims_285efc/button_Filter'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Billing Statement Report - Easy Claims_285efc/span_Terms_k-icon k-i-more-vertical_1'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Billing Statement Report - Easy Claims_285efc/span_Sort Descending_1'))

'The \'Prepared By\' field now correctly displays \'SVN\' and the \'Registered Name\' has been corrected. The signatory has ensured that all letters are no longer uppercase.'
WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Billing Statement Report - Easy Claims_285efc/a_View'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_BillingStatement/Page_Billing Statement Report - Easy Claims_285efc/a_Billing Statement_k-button k-flat k-butto_3a341b'))

