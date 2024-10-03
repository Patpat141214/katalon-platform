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

WebUI.navigateToUrl('http://172.30.1.26/DRG_TEST/Account/Login?ReturnUrl=%2FDRG_TEST%2FConnect%3FReturnUrl%3D%252FDRG_TEST%252FAccount%252FLogOff')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/input_Username_Username'), 'patchedrgadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/input_Password_Password'), 
    'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/input_Password_Password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Connect - Easy Claims/span_Control Panel'))

WebUI.navigateToUrl('http://172.30.1.26/DRG_TEST/ControlPanel')

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/span_Hospital Information (offline mode)'))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_b1 l1 bf homes, exchange 05 PAGPARTIA_a9fde9'))

WebUI.setText(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Username_ConnectUserName'), 
    'PRO4A_DEPTMCAH_JMC_01')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Password_ConnectPassword'), 
    'Ov4DKeIvXLiGp9jFpjbR/w==')

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Password_k-button k-primary'))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/div_Hospital Code                          _698c28'))

WebUI.setText(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Hospital Email_Hospital.HospitalEmail'), 
    'peter@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/div_Hospital Code                          _698c28'))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/li'))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/span_User Management'))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_samplegmail.com_addUserBtn'))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/span_SELECT ONE_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/li_Dr. Erlinda P. Tolentino Medical Clinic _78c317'))

WebUI.setText(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Username_Username'), 
    'patcheadmin3')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Password_Password'), 
    'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Confirm password_ConfirmPassword'), 
    'nwr9I1qT+J0GbQ++JlYjHw==')

WebUI.setText(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Email_Email'), 
    'sample@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Roles_k-input k-readonly'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/input_Roles_k-input k-readonly'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/div_Admin_flex-list-action'))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/li_1'))

WebUI.click(findTestObject('Object Repository/Page_Login, User, Hospital - Easy Claims/Page_Control Panel - Easy Claims/span_Log off'))

