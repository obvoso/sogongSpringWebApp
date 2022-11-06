package edu.catholic.controller;



import edu.catholic.Service.AccountService;


import edu.catholic.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller //컨트롤러 클래스 지정
public class HomeController {

    private final AccountService accountService;

    @Autowired
    public HomeController(AccountService accountService) {
        this.accountService = accountService;
    }


    @RequestMapping(value = "/") // url과 method 매핑
    public String index(Model model) {
        model.addAttribute("text", "Spring Page."); //model object
        return "index"; // veiw name 지정
    }

    @RequestMapping(value = "/registration")
    public String loadRegistrationForm() {
        return "registration";
    }

    @RequestMapping(value = "/addUser")
    public String addUser(Model model, HttpServletRequest req) {

        Account account = new Account();
        account.setId(req.getParameter("id"));
        account.setPassword(req.getParameter("password"));
        accountService.insertAccount(account);
        model.addAttribute("text", "Spring Page.");
        return "index";
    }

    @RequestMapping(value = "/findUser")
    public String loadFindForm() {
        return "findUser";
    }

    @RequestMapping(value = "/showUser")
    public String showUser(Model model, HttpServletRequest req) {

        Account account = new Account();
        account.setId(req.getParameter("id"));
        account = accountService.selectAccount(account);
        model.addAttribute("id", account.getId());
        model.addAttribute("password", account.getPassword());
        return "showUser";
    }

    @RequestMapping(value = "/userList")
    public String userList(Model model, HttpServletRequest req) {
        List<Account> userList = accountService.searchAccount();
        model.addAttribute("list", userList);
        return "userList";
    }
}