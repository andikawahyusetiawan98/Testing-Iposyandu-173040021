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

Mobile.startExistingApplication('id.iposyandu.kader')

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.EditText - TANGGAL PEMERIKSAAN'), 
    '2023-01-5', 30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.EditText - LILA (CM)'), 
    '30.6', 30)

Mobile.scrollToText('simpan')

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.Button - SIMPAN (1)'), 
    30)

Mobile.waitForElementPresent(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.TextView - BERHASIL'), 
    30)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-77.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.TextView - BERHASIL'), 
    30, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.TextView - Klik di sini jika ingin menutup form pengiinputan'), 
    30)
