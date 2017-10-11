package co.com.saimyr.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import co.com.saimyr.domain.Person;
import co.com.saimyr.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup() {
		emailService = Mockito.mock(EmailService.class);
//		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@Test
	public void NotifyTest() {
		//Arrange
		Person person = new PersonTestDataBuilder().build();
		Mockito.when(emailService.sendMail(Mockito.anyString())).thenReturn("Funciona");
		//Act
		String message = notifyPersonService.notify(person);
		//Assert
		Assert.assertEquals("NO Funciona", message);
	}
}
