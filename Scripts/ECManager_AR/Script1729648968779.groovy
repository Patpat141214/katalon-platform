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

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Home - Easy Claims Manager/span_Reports'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/span_Accounts Receivable'))

WebUI.navigateToUrl('http://172.30.1.26/ECManager_Sprint3/AR')

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/a_Generate AR Letter'))

WebUI.setText(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Selected Account Receivables_SearchTerm'), 
    'H08013394')

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Selected Account Receivables_ProcessButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Oct 22, 2024 - 0140 PM_GenerateARButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Final Letter Sent_Idnull'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Oct 22, 2024 - 0140 PM_GenerateARButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/span_Select a template_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/li_Initial Letter'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Initial Letter_confirm-btn'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Oct 22, 2024 - 0140 PM_GenerateARButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Final Letter Sent_Idnull'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Oct 22, 2024 - 0140 PM_GenerateARButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/span_Initial Letter_k-select'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/li_First Letter'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Initial Letter_confirm-btn'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Oct 22, 2024 - 0140 PM_GenerateARButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Final Letter Sent_Idnull'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Oct 22, 2024 - 0140 PM_GenerateARButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/span_Select a template_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/li_Second Letter'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Initial Letter_confirm-btn'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Oct 22, 2024 - 0140 PM_GenerateARButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Final Letter Sent_Idnull'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Oct 22, 2024 - 0140 PM_GenerateARButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/a_Generate AR Letter_k-button k-button-icon_1b6b44'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Oct 22, 2024 - 0140 PM_GenerateARButton'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/span_Select a template_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/li_Final Letter'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/input_Initial Letter_confirm-btn'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/a_Click here'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/a_Generate AR Letter_k-button k-flat k-butt_a4b8a4'))

WebUI.navigateToUrl('http://172.30.1.26/ECManager_Sprint3/AR')

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_AR/Page_Account Receivable - Easy Claims Manager/span_Accounts Receivable'))

