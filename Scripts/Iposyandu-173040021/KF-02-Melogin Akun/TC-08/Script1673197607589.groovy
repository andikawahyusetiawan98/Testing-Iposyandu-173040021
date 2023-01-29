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

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-02-Melogin Akun/android.widget.Button - LOGIN'), 30)

Mobile.setText(findTestObject('Repo-Iposyandu-173040021/RKF-02-Melogin Akun/android.widget.EditText - NOMOR HANDPHONE'), 
    '081995424242', 30)

Mobile.setText(findTestObject('Repo-Iposyandu-173040021/RKF-02-Melogin Akun/android.widget.EditText - PASSWORD'), '173040021', 
    30)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-02-Melogin Akun/android.widget.Button - LOGIN (1)'), 30)

Mobile.waitForElementPresent(findTestObject('Repo-Iposyandu-173040021/RKF-02-Melogin Akun/android.widget.TextView - ASESMEN MANDIRI'), 
    30)

Mobile.verifyElementVisible(findTestObject('Repo-Iposyandu-173040021/RKF-02-Melogin Akun/android.widget.TextView - ASESMEN MANDIRI'), 
    30, FailureHandling.OPTIONAL)

Mobile.takeScreenshot('F:\\Demo Testing Iposyandu\\TC-08.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-02-Melogin Akun/android.widget.FrameLayout lainnya'), 30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(288, 1341, 0, 850)

Mobile.tap(findTestObject('Repo-Iposyandu-173040021/RKF-02-Melogin Akun/android.widget.TextView - LOGOUT'), 30)

Mobile.waitForElementPresent(findTestObject('Repo-Iposyandu-173040021/RKF-02-Melogin Akun/android.widget.Button - LOGIN'), 
    30)

