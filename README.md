# Home Services Provider Website
## UCS662 Test Automation Project Report

### Introduction
This document provides a comprehensive overview of the test automation processes for the Home Services Provider website. It includes testing strategies, test cases, and the generation of various test reports. The functionalities tested include forget password, signup, login, view and edit profile, and update password.

### Test Scenarios

#### 1. Forget Password Testing
**Objective**: Ensure that users can reset their password using the "Forget Password" feature.

**Steps**:
1. Navigate to the login page.
2. Click on the "Forget Password" link.
3. Enter a registered phone number.
4. OTP is sent to user to verify phone number.
5. Once verified the password can be reset.
6. Log in with the new password.

**Expected Result**: User should receive a otp and be able to set a new password successfully.

#### 2. Signup Testing
**Objective**: Ensure that users can create a new account as either a Seeker or a Provider.

**Steps**:
1. Navigate to the signup page.
2. Select either "Seeker" or "Provider".
3. Fill in the required details.
4. Submit the form.
5. Verify that the account is created and the user is redirected to the appropriate page.

**Expected Result**: User account should be created, and the user should be logged in and redirected correctly.

#### 3. Login Testing
**Objective**: Ensure that users can log in with valid credentials.

**Steps**:
1. Navigate to the login page.
2. Enter valid email and password.
3. Submit the form.
4. Verify that the user is logged in and redirected to the homepage.

**Expected Result**: User should be able to log in and be redirected to the homepage.

#### 4. View and Edit Profile Testing
**Objective**: Ensure that users can view and edit their profile information.

**Steps**:
1. Log in to the website.
2. Navigate to the profile page.
3. Verify that the profile details are displayed correctly.
4. Edit profile information (e.g., address, phone number, services).
5. Save changes and verify that the updates are reflected.

**Expected Result**: Users should be able to view and update their profile information successfully.

#### 5. Update Password Testing
**Objective**: Ensure that users can update their password from their profile.

**Steps**:
1. Log in to the website.
2. Navigate to the profile page.
3. Go to the change password section.
4. Enter the current password and new password.
5. Submit the form.
6. Log out and log in with the new password.

**Expected Result**: Users should be able to update their password and log in with the new password.

### Test Reports

#### 1. Emailable Report
**Description**: A report that is generated in HTML format and can be emailed to stakeholders.

**Content**:
- Summary of test cases executed.
- Number of test cases passed and failed.
- Detailed information about each test case.

#### 2. Index.html Report
**Description**: An HTML report that provides a comprehensive overview of the test execution.

**Content**:
- Total number of test cases.
- Number of test cases passed, failed, and skipped.
- Graphical representation of test results.
- Detailed information about each test case.

#### 3. XSLT Report
**Description**: An XML-based report transformed into a readable HTML format using XSLT.

**Content**:
- Execution summary.
- Test case details with pass/fail status.
- Timing information for each test case.

### Tools Used
- **Selenium**: For automated testing of website functionalities.
- **TestNG**: For organizing and executing test cases.
- **Nodemailer**: For sending test reports via email.
- **Twilio**: For sending SMS notifications during testing.

### Conclusion
The test automation project for the Home Services Provider website has successfully validated critical functionalities such as forget password, signup, login, view and edit profile, and update password. The automated tests ensure that the website operates smoothly and provides a seamless user experience. The generated test reports offer valuable insights into the testing process, helping maintain high-quality standards for the application.

### Screenshots and Additional Documentation
*(Placeholder for screenshots and any additional documentation related to the test automation project)*
XSLT report
![Screenshot 2024-07-04 022729](https://github.com/Cheshta08/Home-Service-Provider-Website-Testing/assets/111150320/c0adac04-69f9-417c-9cc0-2624ece53456)

index.html

![Screenshot 2024-07-04 022915](https://github.com/Cheshta08/Home-Service-Provider-Website-Testing/assets/111150320/ba881228-2a72-428a-81b8-61bc5511acda)

emailable-report

![Screenshot 2024-07-04 023017](https://github.com/Cheshta08/Home-Service-Provider-Website-Testing/assets/111150320/a8a64726-faee-4878-bb27-f5822ff0b7c3)
