package cloud.csonic.labmaven.service;

import cloud.csonic.labmaven.model.Customer;
import cloud.csonic.labmaven.repository.CustomerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { CustomerServiceImplTest.TestConfiguration.class })
class CustomerServiceImplTest {

    public static class TestConfiguration{

        @Bean
        public CustomerService customerService(CustomerRepository customerRepository){
            CustomerService customerService = new CustomerServiceImpl(customerRepository);
            return customerService;
        }

    }

    @MockBean
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sanity() {
        assertThat(customerRepository).isNotNull();
        assertThat(customerService).isNotNull();
    }

    @Test
    void listAll() {
    }

    @Test
    void getById() {
    }
}