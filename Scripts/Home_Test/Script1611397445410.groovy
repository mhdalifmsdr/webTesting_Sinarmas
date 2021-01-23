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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sinarmasland.com/')

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/a_More about us'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Sinar Mas Land Plaza  Sinarmas Land/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_More about us_fab fa-instagram'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_More about us_fab fa-twitter'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_More about us_fab fa-facebook-f'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_More about us_fab fa-youtube'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_Explore More_fal fa-angle-right font-size_6aefdf'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_Explore More_fal fa-angle-right font-size_6aefdf'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_Explore More_fal fa-angle-right font-size_6aefdf'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_Explore More_fal fa-angle-right font-size_6aefdf'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_Explore More_fal fa-angle-right font-size_6aefdf'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_Explore More_fal fa-angle-right font-size_6aefdf'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_Explore More_fal fa-angle-right font-size_6aefdf'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_Explore More_fal fa-angle-right font-size_6aefdf'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/i_Explore More_fal fa-angle-right font-size_6aefdf'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/a_All Projects'))

WebUI.click(findTestObject('Object Repository/Page_Development  Sinarmas Land/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/div_Location'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/div_BSD City'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/div_Property Types'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/div_Residential'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/div_Projects'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/div_Lyndon'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/label_Security 247'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/label_Fresh Modern Market'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/label_Jogging Track'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/label_Green Spaced Garden'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/label_Swimming Pool'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/button_Find Property'))

WebUI.click(findTestObject('Object Repository/Page_Lyndon  Sinarmas Land/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/button_Read More'))

WebUI.click(findTestObject('Object Repository/Page_News  Sinarmas Land/a_Home'))

'Tidak Mengeluarkan Input'
WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/button_See All News'))

WebUI.click(findTestObject('Object Repository/Page_News  Sinarmas Land/a_Blog'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_News  Sinarmas Land/a_Press Release'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_News  Sinarmas Land/a_Event  Program'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_News  Sinarmas Land/a_Sustainability News'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_News  Sinarmas Land/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/a_Investors Area'))

WebUI.click(findTestObject('Object Repository/Page_General Information  Sinarmas Land/a_Home'))

WebUI.setText(findTestObject('Object Repository/Page_Home  Sinarmas Land/input_Subscribe to our mailing list_form-control'), 
    'alifmuhammad30@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Home  Sinarmas Land/button_Subscribe to our mailing list_btn bt_6032cb'))

WebUI.closeBrowser()

