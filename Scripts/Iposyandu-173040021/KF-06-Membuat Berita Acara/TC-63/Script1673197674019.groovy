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

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.TextView - Klik di sini jika ingin menutup form pengiinputan'), 
    30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.FrameLayout tombol dashboard'), 
    30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.FrameLayout tombol posyandu'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.CheckedTextView - 7'), 
    30)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(66, 1781, 0, 1200)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.Button - UPDATE'), 
    30)

Mobile.clearText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - 200'), 
    30)

Mobile.clearText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - 300'), 
    30)

Mobile.clearText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - 106'), 
    30)

Mobile.clearText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - 300 (1)'), 
    30)

Mobile.clearText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - 220'), 
    30)

Mobile.clearText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - 250'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.Button - SIMPAN (1)'), 
    30)

Mobile.verifyElementVisible(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.TextView - JUMLAH KADER LAKI-LAKI HARUS ANGKAJUMLAH KADER LAKI-LAKI HARUS DIISI (1)'), 
    30, FailureHandling.OPTIONAL)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-63.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

