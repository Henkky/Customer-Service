package id.co.travel.customerapp;

import id.co.travel.customerapp.controller.CustomerController;
import id.co.travel.customerapp.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

//@SpringBootTest
@WebMvcTest(CustomerController.class)
class CustomerAppApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CustomerService service;

	@Test
	public void customerShouldReturnMessageFromService() throws Exception {

	}

}
