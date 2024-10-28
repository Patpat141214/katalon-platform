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

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_ControlPanel/Page_Leads - Easy Claims Manager/span_Control Panel'))

WebUI.navigateToUrl('http://172.30.1.26/ECManager_Sprint3/ControlPanel')

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_ControlPanel/Page_Control Panel - Easy Claims Manager/span_Users'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_ControlPanel/Page_Control Panel - Easy Claims Manager/input_YES_AddUser'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_ControlPanel/Page_Control Panel - Easy Claims Manager/div_Roles_k-multiselect-wrap k-floatwrap'))

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_ControlPanel/Page_Control Panel - Easy Claims Manager/li_CollectionOfficer'))

'New Text Field'
WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_ControlPanel/Page_Control Panel - Easy Claims Manager/input_Contact Number_ContactNumber'))

'Successfully allow only 11 digits. Required when the role is "Collection Officer"'
WebUI.sendKeys(findTestObject('Object Repository/ECMSprint3/ECM_ControlPanel/Page_Control Panel - Easy Claims Manager/input_Contact Number_ContactNumber'), 
    '09548562051')

WebUI.click(findTestObject('Object Repository/ECMSprint3/ECM_ControlPanel/Page_Control Panel - Easy Claims Manager/a_Add User_k-button k-flat k-button-icon k-_54851a'))

