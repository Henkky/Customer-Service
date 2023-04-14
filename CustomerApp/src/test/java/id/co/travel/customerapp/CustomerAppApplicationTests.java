package id.co.travel.customerapp;

import id.co.travel.customerapp.controller.RestCustomerController;
import id.co.travel.customerapp.model.Customer;
import id.co.travel.customerapp.service.CustomerService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.mockito.Mockito.when;

//@SpringBootTest
@WebMvcTest(RestCustomerController.class)
class CustomerAppApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CustomerService service;

	@Test
	public void customerShouldReturnMessageFromService() throws Exception {

	}

}
