package com.example.sistema;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private MensajeService mensajeService;

	@Test
	public void contextLoads() {
		assertEquals(new Mensaje("hola","Michael"), mensajeService.holaSaludar("Michael"));
	}

}
