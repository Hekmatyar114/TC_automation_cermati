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

WebUI.navigateToUrl('https://www.cermati.com/gabung-v2?')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__email'), 'gbbheks11@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__password'), 
    'vJbJxW87ldozRbWrqehnww==')

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/div_Daftar ke Cermati.comEmail Kata Sandi K_39e489'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__confirmPassword'), 
    'vJbJxW87ldozRbWrqehnww==')

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/div_Nama Depan'))

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__firstName'), 'Ghulbuddin')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__lastName'), 'Hikmatiar')

WebUI.setText(findTestObject('Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__mobilePhone'), '085624011101')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__residenceCity'), 
    'Kota Bogor')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/div_KOTA BOGOR'))

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/button_Daftar Akun'))

WebUI.closeBrowser()

