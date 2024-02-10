package org.humber.project.controllers;

import org.humber.project.domain.Customer;
import org.humber.project.services.CustomerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        customerService.insertCustomer(customer);
    }

    @PutMapping("/{id}")
    public void updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        customer.setCustomerId(id);
        customerService.updateCustomer(customer);
    }
}
/*
 * package org.humber.project.controllers;
 * 
 * import org.humber.project.domain.Student;
 * import org.humber.project.services.StudentService;
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * 
 * import java.util.List;
 * 
 * @RestController
 * 
 * @RequestMapping("/students")
 * public class StudentController {
 * 
 * private final StudentService studentService;
 * 
 * public StudentController(StudentService studentService) {
 * this.studentService = studentService;
 * }
 * 
 * @GetMapping
 * public List<Student> getAllStudents() {
 * return studentService.getAllStudents();
 * }
 * 
 * @PostMapping
 * public void addStudent(@RequestBody Student student) {
 * studentService.insertStudent(student);
 * }
 * 
 * @PutMapping("/{id}")
 * public void updateStudent(@PathVariable Long id, @RequestBody Student
 * student) {
 * student.setStudentId(id);
 * studentService.updateStudent(student);
 * }
 * }
 */