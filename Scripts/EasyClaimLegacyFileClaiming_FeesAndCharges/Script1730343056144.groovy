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

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_All Case Rate_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/li_All Case Rate'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Type_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/li_ICD Code'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_ICD Code_k-icon k-i-arrow-60-down'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_ICD Code_FirstCaseRate.ItemCode_input'), 
    'P91.3')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Add Professional Fees and Charges'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Accre Code_DoctorAccreCode'), 
    '1308-1533299-1')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/div_First Name_k-edit-field'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/div_Accre Code_k-edit-field'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Select One_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/li_Yes'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Co-Pay_DoctorCoPay'), 
    '1000')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Sign Date_k-icon k-i-calendar'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Sign Date_DoctorSignDate'), 
    '10/28/2024')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Consumption_EnoughBenefits_Default_Co_454067'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_AccessPatientRecords_APRType_Default__6e28a2'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Date Signed_AccessPatientRecords.DateSigned'), 
    '10/04/2024')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Add Itemized Billing Items'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Select One_k-icon k-i-arrow-60-down_1'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/li_Room And Board'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Item Code_ItemCode'), 
    '12')

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Item Name_ItemName'), 
    'Item')

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Unit of Measurement_UnitofMeasurement'), 
    '12')

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Unit Price_k-formatted-value k-input'), 
    '₱0.00')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/div_Unit Price'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Unit Price_UnitPrice'), 
    '200')

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Quantity_Quantity'), 
    '10')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Add Professional Fees and Charges_1'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Accre Code_DoctorAccreCode'), 
    '1308-1533299-1')

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Last Name_DoctorLastName'), 
    '')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Last Name_DoctorLastName'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/div_Accre CodeLast NameFirst NameMiddle Nam_8428f9'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Amount_Amount'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Charge Net of Applicable VAT_k-format_3fd957'), 
    '₱0.00')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Charge Net of Applicable VAT_k-format_3fd957'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Charge Net of Applicable VAT_ChargeNetVAT'), 
    '100')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Edit'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Charge Net of Applicable VAT_ChargeNetVAT'), 
    '20')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Consumption_EnoughBenefitsEsoa_Defaul_ded43e'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Select One_k-icon k-i-arrow-60-down_1_2'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/li_Anesthesia Record'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Claim Form 2 (CF2)'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Export Form_k-button k-flat k-button-icon_e86315'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Claim Signature Form (CSF)'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Export Form_k-button k-flat k-button-icon_e86315'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_eSOA'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Export Form_k-button k-flat k-button-icon_e86315'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_eSOA_saveFeesCharges'))

WebUI.navigateToUrl('http://172.30.1.26/OPSUI.EasyClaims.Legacy/Claim/ClaimSummary?forEditing=True')

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Claim Summary - Easy Claims/label_Mark as Complete and Ready for Submission'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Claim Summary - Easy Claims/input_Mark as Complete and Ready for Submis_641e2f'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_FeesAndCharges/Page_Claim Summary - Easy Claims/input_Add new Claim_cancelActionButton'))

