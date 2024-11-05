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

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_Yes_PatientReferred'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_Yes_IsEmergency'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_PatientType_Default_PatientType'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/span_Select One_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/li_Improved'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/span_Select One_k-icon k-i-arrow-60-down_1'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/li_Private'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/textarea_Admission Diagnosis_AdmissionDiagnosis'), 
    GlobalVariable.pAdmissionDiagnosis)

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_Please add at least one (1) Discharge_bd5a63'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/textarea_Discharge Diagnosis_DischargeDiagnosis'), 
    GlobalVariable.pDischargeDiagnosis)

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/a_Add ICD Code'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_ICD Code_ICDCode_input'), 
    GlobalVariable.pIcdCode)

WebUI.sendKeys(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_ICD Code_ICDCode_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/a_Add RVS Code'))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_RVS Code_RVSCode_input'), 
    GlobalVariable.pRvsCode)

WebUI.sendKeys(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_RVS Code_RVSCode_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/textarea_Related Procedure_RelatedProcedure'), 
    GlobalVariable.pRelatedProc)

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/span_Select One_k-icon k-i-arrow-60-down_1_2'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/span_Right'), 
    2)

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/span_Right'))

WebUI.sendKeys(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_Procedure Date_ProcedureDate'), 
    GlobalVariable.pProcedureDate)

WebUI.sendKeys(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_Procedure Date_ProcedureDate'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/a_Save'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_Please update the RVS Procedure Date(_50687d'))

WebUI.click(findTestObject('Object Repository/ClaimFiling_ConfinementInfo/Page_Confinement Information - Easy Claims/input_Right Eye IOL Expiry Date_SaveConfine_8606f5'))

WebUI.navigateToUrl(GlobalVariable.NavFeesAndCharges)

