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

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Type_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/li_ICD Code'))

WebUI.setText(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_ICD Code_FirstCaseRate.ItemCode_input'), 
    'p91.3')

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_ICD Code_FirstCaseRate.ItemCode_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Add Professional Fees and Charges'))

//WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Accre Code_DoctorAccreCode'))

//WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Accre Code_DoctorAccreCode'), 
   // '1302-9813891-1')

//WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Accre Code_DoctorAccreCode'),
	//Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Select One_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/li_Yes'))

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Co-Pay_DoctorCoPay'), 
    '100')

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Consumption_EnoughBenefits_Default_Co_454067'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_AccessPatientRecords_APRType_Default__6e28a2'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Date Signed_k-icon k-i-calendar'))

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Date Signed_AccessPatientRecords.DateSigned'), 
    '11/12/2024')

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Add Itemized Billing Items'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Select One_k-select'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/li_Room And Board'))

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Item Code_ItemCode'), 
    'ItemCode')

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Item Name_ItemName'), 
    'ItemName')

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Unit of Measurement_UnitofMeasurement'), 
    'UOF')

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Unit Price_k-formatted-value k-input'), 
    '₱0.00')

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Unit Price_k-formatted-value k-input'))

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Unit Price_UnitPrice'), 
    '20')

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Quantity_k-formatted-value k-input'), 
    '0.00')

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Quantity_k-formatted-value k-input'))

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Quantity_Quantity'), 
    '20')

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/div_SaveCancel'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Add Professional Fees and Charges_1'))

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Amount_Amount'), 
    '20000')

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Charge Net of Applicable VAT_k-format_3fd957'), 
    '₱0.00')

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Charge Net of Applicable VAT_k-format_3fd957'))

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Charge Net of Applicable VAT_ChargeNetVAT'), 
    '200')

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Edit'))

WebUI.sendKeys(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Charge Net of Applicable VAT_ChargeNetVAT'), 
    '20')

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_Consumption_EnoughBenefitsEsoa_Defaul_ded43e'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/span_Select One_k-icon k-i-arrow-60-down_1'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/li_Anesthesia Record'))

WebUI.click(findTestObject('Object Repository/Page_FeesAndCharges/Page_Fees and Charges - Easy Claims/input_eSOA_saveFeesCharges'))


