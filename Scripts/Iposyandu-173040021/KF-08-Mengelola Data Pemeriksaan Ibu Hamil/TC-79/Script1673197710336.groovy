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

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.TextView - Klik di sini jika ingin menutup form pengiinputan (1)'), 
    30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.FrameLayout tombol dashboard'), 
    30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.FrameLayout tombol posyandu'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.ImageButton tambah'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.LinearLayout (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.Button - CARI (2)'), 
    30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.EditText - NAMA IBU HAMIL (3)'), 
    'ibu rianita' + '\\n', 30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.Button - PILIH (2)'), 
    30)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-79.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.ImageButton tombol kembali dari tambah data'), 
    30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-08-Mengelola Data Pemeriksaan Ibu Hamil/android.widget.FrameLayout tombol dashboard'), 
    30)

