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

WebUI.callTestCase(findTestCase('EasyClaimLegacyLoginAndHospitalAndUser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/span_User Management'))

WebUI.click(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/input_samplegmail.com_addUserBtn'))

WebUI.click(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/span_SELECT ONE'))

WebUI.click(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/li_St. Peter Claver Hospital'))

WebUI.setText(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/input_Username_Username'), 
    'patcheadmin3')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/input_Password_Password'), 
    'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/input_Confirm password_ConfirmPassword'), 
    'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.setText(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/input_Email_Email'), 
    'pat@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/div_Roles_k-multiselect-wrap k-floatwrap'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/Page_Control Panel - Easy Claims/input_Roles_k-input k-readonly'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/Page_Control Panel - Easy Claims/input_Roles_k-input k-readonly'),
Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/Page_Control Panel - Easy Claims/input_Roles_k-input k-readonly'),
	Keys.chord(Keys.ENTER))
//WebUI.click(findTestObject('Object Repository/Page_Control Panel_UserManagement/Page_Control Panel - Easy Claims/input_Admin_k-button k-primary'))

