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

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.FrameLayout tombol dashboard'), 
    30)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.FrameLayout tombol ibu hamil'), 
    30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.TextView - IBU SHOLEHAH IBU'), 
    30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.TextView - MELAHIRKAN'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.EditText - PENOLONG PERSALINAN'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.TextView - LAINNYA (SEBUTKAN)'), 
    30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.EditText - INPUT PENOLONG PERSALINAN'), 
    'ibu daryahwati ibu daryahwati ibu daryahwati ibu daryahwati ibu daryahwati ibu daryahwati ibu daryahwati ibu daryahwati ibu daryahwati ibu daryahwati', 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.EditText - TEMPAT PERSALINAN'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.TextView - LAINNYA (SEBUTKAN) (1)'), 
    30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.EditText - INPUT TEMPAT PERSALINAN'), 
    'rumah bapak hartono rumah bapak hartono rumah bapak hartono rumah bapak hartono rumah bapak hartono rumah bapak hartono ', 
    30)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.EditText - TANGGAL PERSALINAN'), 
    '2022-12-27', 30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.Button - SELANJUTNYA (1)'), 
    30)

Mobile.verifyElementVisible(findTestObject('Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.Toast - OK'), 
    30, FailureHandling.OPTIONAL)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-38.png', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.EditText - NAMA ANAK'), 
    'ardian putra ardian putra ardian putra ardian putra ardian putra ardian putra ardian putra ardian putra ardian putra', 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.RadioButton - LAKI-LAKI'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.Button - SIMPAN BAYI'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.Button - TIDAK'), 
    30)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-38.1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Repo-Iposyandu-173040021/RKF-04-Mengelola Data Ibu Hamil/android.widget.Toast - Baby data created successfully'), 
    'penolong persalinan, tempat persalinan dan nama anak tidak boleh melebihi 50 karakter', FailureHandling.STOP_ON_FAILURE)

