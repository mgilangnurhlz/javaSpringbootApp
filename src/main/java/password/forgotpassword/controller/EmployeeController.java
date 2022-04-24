package password.forgotpassword.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import password.forgotpassword.entity.Employee;
import password.forgotpassword.service.framework.EmployeeService;

import java.util.List;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/show")
    public String show() {
        return "EmployeeRegister";
    }

    @PostMapping("/register")
    public String saveEmployee(@ModelAttribute Employee emp) {
        service.saveEmployee(emp);
        return "redirect:all";
    }

    @GetMapping("/all")
    public String showEmployees(Model model) {
        List<Employee> list = service.getAllEmployees();
        model.addAttribute("list", list);
        return "index";
    }
    //http://3031/employee/remove?id=2
    @GetMapping("/remove")
    public String removeEmployee(@RequestParam Integer id) {
        service.deleteEmployeeById(id);
        return "redirect:all";
    }

    @GetMapping("/edit")
    public String editEmployee(@RequestParam Integer id,Model model) {
        Employee emp = service.getEmployeeById(id);
        model.addAttribute("emp", emp);
        return "EmployeeEdit";
    }

    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute Employee emp) {
        service.updateEmployee(emp);
        return "redirect:all";
    }
}
