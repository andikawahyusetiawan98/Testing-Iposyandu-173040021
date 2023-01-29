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
import internal.GlobalVariable
import io.netty.util.concurrent.FailedFuture

import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('id.iposyandu.kader')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.Button - DAFTAR'), 30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.Button - SELANJUTNYA'), 30)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

for (int i = 1; i <= 15; i++) {
    'Swipe Vertical from top to bottom'
    Mobile.swipe(startX, endY, endX, startY)
}

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.CheckBox - Saya telah membaca dan mengerti'), 
    30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.Button - SELANJUTNYA 2'), 30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.Button - BUKAN BINAAN ASTRA'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - PROVINSI'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.TextView - ACEH'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - KABUPATEN  KOTA'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.TextView - KABUPATEN ACEH BARAT'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - KECAMATAN'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.TextView - ARONGAN LAMBALEK'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - DESAKELURAHAN'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.TextView - PANTE MEUTIA'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - PUSKESMAS'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.TextView - PUSKESMAS DRIEN RAMPAK'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - POSYANDU'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.TextView - TEST (PANTE MEUTIA)'), 
    30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.Button - SELANJUTNYA 3'), 30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.Button - KIRIM PENDAFTARAN'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - PASSWORD'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - NOMOR HANDPHONE'), 
    30)

Mobile.tap(findTestObject('Object Repository/Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - NAMA LENGKAP'), 
    30)

Mobile.verifyElementVisible(findTestObject('Repo-Iposyandu-173040021/RKF-01-Mendaftar Akun/android.widget.EditText - NAMA LENGKAP'), 
    30, FailureHandling.OPTIONAL)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-01.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

