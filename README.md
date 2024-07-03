Home Services Provider Website
Introduction
This document provides a comprehensive overview of the test automation processes for the Home Services Provider website. It includes testing strategies, test cases, and the generation of various test reports. The functionalities tested include forget password, signup, login, view and edit profile, and update password.

Test Scenarios
1. Forget Password Testing
Objective: Ensure that users can reset their password using the "Forget Password" feature.

Steps:

Navigate to the login page.
Click on the "Forget Password" link.
Enter a registered phone number.
Verify that otp is sent to registered phone number to verify the user.
Use the otp to set a new password.
Log in with the new password.
Expected Result: User should receive a otp and be able to set a new password successfully.

2. Signup Testing
Objective: Ensure that users can create a new account as either a Seeker or a Provider.

Steps:

Navigate to the signup page.
Select either "Seeker" or "Provider".
Fill in the required details.
Submit the form.
Verify that the account is created and the user is redirected to the appropriate page.
Expected Result: User account should be created, and the user should be logged in and redirected correctly.

3. Login Testing
Objective: Ensure that users can log in with valid credentials.

Steps:

Navigate to the login page.
Enter valid phone number and password.
Submit the form.
Verify that the user is logged in and redirected to the homepage.
Expected Result: User should be able to log in and be redirected to the homepage.

4. View and Edit Profile Testing
Objective: Ensure that users can view and edit their profile information.

Steps:

Log in to the website.
Navigate to the profile page.
Verify that the profile details are displayed correctly.
Edit profile information (e.g., address, phone number, services).
Save changes and verify that the updates are reflected.
Expected Result: Users should be able to view and update their profile information successfully.

5. Update Password Testing
Objective: Ensure that users can update their password from their profile.

Steps:

Log in to the website.
Navigate to the profile page.
Go to the change password section.
Enter the current password and new password.
Submit the form.
Log out and log in with the new password.
Expected Result: Users should be able to update their password and log in with the new password.

Test Reports
1. Emailable Report
Description: A report that is generated in HTML format and can be emailed to stakeholders.

Content:

Summary of test cases executed.
Number of test cases passed and failed.
Detailed information about each test case.
2. Index.html Report
Description: An HTML report that provides a comprehensive overview of the test execution.

Content:

Total number of test cases.
Number of test cases passed, failed, and skipped.
Graphical representation of test results.
Detailed information about each test case.
3. XSLT Report
Description: An XML-based report transformed into a readable HTML format using XSLT.

Content:

Execution summary.
Test case details with pass/fail status.
Timing information for each test case.
Tools Used
Selenium: For automated testing of website functionalities.
TestNG: For organizing and executing test cases.
Nodemailer: For sending test reports via email.
Twilio: For sending SMS notifications during testing.
Conclusion
The test automation project for the Home Services Provider website has successfully validated critical functionalities such as forget password, signup, login, view and edit profile, and update password. The automated tests ensure that the website operates smoothly and provides a seamless user experience. The generated test reports offer valuable insights into the testing process, helping maintain high-quality standards for the application.

Screenshots and Additional Documentation
