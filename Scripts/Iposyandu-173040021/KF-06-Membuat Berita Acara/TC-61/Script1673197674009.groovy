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

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.ImageButton tombol tambah'), 
    30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.LinearLayout tombol berita acara'), 
    30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - TANGGAL'), 
    '2023-01-7', 30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - JUMLAH KADER LAKI-LAKI'), 
    'sepuluh', 30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - JUMLAH KADER PEREMPUAN'), 
    'lima belas orang', 30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - JUMLAH PLKB LAKI-LAKI'), 
    'sembilan', 30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - JUMLAH PLKB PEREMPUAN'), 
    'tujuh orang', 30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - JUMLAH TENAGA MEDISPARAMEDIS LAKI-LAKI'), 
    '5 orang', 30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.EditText - JUMLAH TENAGA MEDISPARAMEDIS PEREMPUAN'), 
    'tiga', 30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.Button - SIMPAN'), 30)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Repo-Iposyandu-173040021/RKF-06-Membuat Berita Acara/android.widget.TextView - JUMLAH KADER LAKI-LAKI HARUS ANGKA'), 
    30, FailureHandling.OPTIONAL)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-61.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

