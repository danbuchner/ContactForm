<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<section id="contactForm" class="container">
		<form action="sendEmail">
			<label for="contactName">Name</label>
			<input id="contactName" name="name" type="text" placeholder="Your name...">
			<label for="contactEmail">Email</label>
			<input id="contactEmail" name="email" type="text" placeholder="Your e-mail...">
			<label for="contactMsg">Message</label>
			<textarea id="contactMsg" name="message"></textarea>
			<input type="submit" value="Submit">
		</form>
	</section>
</body>
</html>
