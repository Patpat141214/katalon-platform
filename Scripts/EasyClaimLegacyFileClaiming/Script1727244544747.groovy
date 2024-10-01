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

WebUI.callTestCase(findTestCase('EasyClaimLegacyConnect'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_Home - Easy Claims/a_File Claim'))

WebUI.navigateToUrl('http://172.30.1.26/OPSUI.EasyClaims.Legacy/Claim/Create')

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_PIN_MemberPIN'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_PIN_MemberPIN'), 
    '05-201174650-0')

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/div_MemberGender_DefaultMaleFemale'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/div_kendo.syncReady(function()jQuery(Member_da9fb1'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_PIN_fetchMemberBtn'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Male_MemberGender'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Date of Birth_MemberBirthDate'))

WebUI.setText(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Date of Birth_MemberBirthDate'), 
    '1/24/1964')

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/textarea_Mailing Address_MailingAddress'), 
    'mail@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Zip Code_ZipCode'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Zip Code_ZipCode'), 
    '1128')

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/span_Select One_k-select'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/li_Individually Paying'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/span_Select One_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/li_Member (Self)'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Admission Date and Time_AdmissionDateTime'), 
    '9/23/2024 12:00 AM')

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Discharge Date and Time_DischargeDateTime'), 
    '9/24/2024 11:00 PM')

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Save for E-Claims_IsFinal'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Transmittal Number_TransmittalNo'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Transmittal Number_TransmittalNo'), 
    'TRANSS1212')

WebUI.doubleClick(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Transmittal Number_TransmittalNo'))

WebUI.sendKeys(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Claim Number_ClaimNumber'), 
    'CLAIMM1212')

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Please ensure that all of the entered_eacd21'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_PBEF - Easy Claims/input_Generating and printing of this form _08f184'))

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_PBEF - Easy Claims/input_Generating and printing of this form _e07ca8'))

WebUI.navigateToUrl('http://172.30.1.26/OPSUI.EasyClaims.Legacy/Claim/Eligibility?forEditing=False')

WebUI.click(findTestObject('Object Repository/Page_ClaimFiling - Easy Claims/Page_File Claim - Easy Claims/input_Please ensure that all of the entered_eacd21'))

