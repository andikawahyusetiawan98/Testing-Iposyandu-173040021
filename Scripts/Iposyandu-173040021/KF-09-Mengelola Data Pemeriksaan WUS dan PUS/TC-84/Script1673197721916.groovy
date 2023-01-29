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

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.FrameLayout tombol lainnya'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.LinearLayout tombol wus dan pus'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.ImageButton tombol tambah wus dan pus'), 
    30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.EditText - NAMA'), 
    'andika wahyu s' + '\\n', 30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.EditText - TANGGAL LAHIR'), 
    '1998-02-29', 30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.Button - SIMPAN'), 
    30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.FrameLayout tombol dashboard'), 
    30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.FrameLayout tombol posyandu'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.ImageButton tambah kegiatan posyandu'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.LinearLayout tombol pemeriksaan wus dan pus'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.Button - CARI'), 
    30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.EditText - NAMA BAYI  BALITA'), 
    'andika wahyu s', 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.Button - PILIH'), 
    30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.EditText - TANGGAL PEMERIKSAAN'), 
    '2023-01-5', 30)

Mobile.scrollToText('simpan')

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.Button - SIMPAN (1)'), 
    30)

Mobile.scrollToText('andika wahyu s')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-84.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-09-Mengelola Data Pemeriksaan WUS dan PUS/android.widget.TextView - LILA TIDAK BOLEH KOSONG'), 
    30, FailureHandling.OPTIONAL)

