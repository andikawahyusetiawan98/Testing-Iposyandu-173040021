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

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.ImageButton kembali'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.Button - LOGIN'), 
    30)

Mobile.setText(findTestObject('Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.EditText - NOMOR HANDPHONE'), 
    '081995424242', 30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.EditText - PASSWORD'), 
    '173040021', 30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.Button - LOGIN (1)'), 
    30)

Mobile.waitForElementPresent(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.TextView - ASESMEN MANDIRI'), 
    30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.FrameLayout tombol bayi dan balita'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.ImageButton tambah data'), 
    30)

Mobile.scrollToText('simpan')

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.Button - SIMPAN'), 
    30)

Mobile.scrollToText('nama anak')

Mobile.verifyElementVisible(findTestObject('Repo-Iposyandu-173040021/RKF-03-Mengelola Data Bayi dan Balita/android.widget.TextView - Nama bayi  balita tidak boleh kosong'), 
    30, FailureHandling.OPTIONAL)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-11.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
