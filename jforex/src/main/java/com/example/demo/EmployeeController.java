package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @RequestMapping("/show")
    public ModelAndView show(ModelAndView mav) {
        EmployeeForm form = new EmployeeForm();
        form.setId("1");
        form.setName("Ken");
        form.setEmail("ken@mail.coml");

        mav.addObject("employeeForm", form);
        mav.setViewName("employee");

        return mav;
    }

}