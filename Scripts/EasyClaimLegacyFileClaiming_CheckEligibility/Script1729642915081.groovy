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

WebUI.click(findTestObject('Object Repository/Page_LoginAccountCreatedAndConnect/Page_Connect - Easy Claims/span_Claims'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_Home - Easy Claims/a_File Claim'))

WebUI.navigateToUrl(GlobalVariable.NavClaimFiling)

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_PIN_MemberPIN'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_PIN_MemberPIN'), 
    GlobalVariable.pPIN)

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/div_MemberGender_DefaultMaleFemale'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/div_kendo.syncReady(function()jQuery(Member_da9fb1'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_PIN_fetchMemberBtn'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Male_MemberGender'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/textarea_Mailing Address_MailingAddress'), 
    GlobalVariable.pMailingAdd)

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Zip Code_ZipCode'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Zip Code_ZipCode'), 
    GlobalVariable.pZipCode)

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/span_Select One_k-select'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/li_Individually Paying'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/span_Select One_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/li_Member (Self)'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Admission Date and Time_AdmissionDateTime'), 
    GlobalVariable.pAddmissionD)

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Discharge Date and Time_DischargeDateTime'), 
    GlobalVariable.pDischargeD)

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Save for E-Claims_IsFinal'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Transmittal Number_TransmittalNo'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Transmittal Number_TransmittalNo'), 
    GlobalVariable.pTransNo)

WebUI.doubleClick(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Transmittal Number_TransmittalNo'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Claim Number_ClaimNumber'), 
    GlobalVariable.pClaimsNo)

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Please ensure that all of the entered_eacd21'))

WebUI.navigateToUrl(GlobalVariable.pPBEF)

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_PBEF - Easy Claims/input_Generating and printing of this form _08f184'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_PBEF - Easy Claims/input_Generating and printing of this form _60f11f'))

