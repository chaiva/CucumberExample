Feature: Free CRM login
	
Scenario Outline: Free CRM login scenario
    Given user is already on login page
    When title of login page is FreeCRM
    Then user enters "<username>" and "<password>"
    Then user clicks on Login Button
    Then user is on home page
    Then user moves to new contact page
    Then user enters contact details "<firstname>"and "<lastname">and "<position">
    Then close the browser
   Examples:
		| username| password | firstname |lastname |position|
		| batchautomation | Test@12345|Tom |Kelvin|Manager|
		| batchautomation | Test@12345|David |Cruise|CEO|
		   

