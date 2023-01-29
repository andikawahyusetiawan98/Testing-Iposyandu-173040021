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

Mobile.startExistingApplication('id.iposyandu.kader', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.ImageButton tombol tambah posyandu'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.LinearLayout tombol pemeriksaan bayi dan balita'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.Button - CARI'), 
    30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.EditText - NAMA BAYI  BALITA'), 
    'andika wahyu setiawan' + '\\n', 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.Button - PILIH'), 
    30)

Mobile.setText(findTestObject('Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.EditText - 38.4'), 
    '250.5', 30)

Mobile.setText(findTestObject('Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.EditText - BERAT BADAN (KG)'), 
    '150.1', 30)

Mobile.scrollToText('simpan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.Button - SIMPAN (2)'), 
    30)

Mobile.waitForElementPresent(findTestObject('Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.TextView - DATA YANG DIINPUT DI LUAR KEWAJARAN'), 
    30)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-70.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.TextView - DATA YANG DIINPUT DI LUAR KEWAJARAN'), 
    30, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.Button - YAKIN'), 
    30)

Mobile.waitForElementPresent(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.TextView - BERHASIL (1)'), 
    30)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-70.1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.TextView - BERHASIL (1)'), 
    30, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-07-Mengelola Data Pemeriksaan Bayi dan Balita/android.widget.TextView - Klik di sini jika ingin menutup form pengiinputan (1)'), 
    30)

