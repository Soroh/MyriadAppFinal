package com.myriad.christian.myriadapp.controllers;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.myriad.christian.myriadapp.config.smtp.IMailService;
import com.myriad.christian.myriadapp.config.smtp.implementation.MailMessageTemplate;
import com.myriad.christian.myriadapp.models.Myriad;
import com.myriad.christian.myriadapp.service.MyriadService;
import com.myriad.christian.myriadapp.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;




@Controller
public class MyriadController {
    @Autowired
    private MyriadService myriadService;
    @Autowired
    private RoleService roleService;
    @Autowired
    protected IMailService emailService;
    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("/user/create-new-account")//sign up page
    public String signUpPage(@ModelAttribute Myriad myriad, Model model){
        model.addAttribute("myriad",myriad);
        return "users/signuppage";
    }

    @RequestMapping("/users/login?new")//sign up page
    public String afterRegistration(){
              return "/users/login?new";
    }

    @RequestMapping("/myriad/save")
    public String saveMyriad(@Valid @ModelAttribute Myriad myriad, BindingResult result){
        if (result.hasErrors()) {
            return "users/signuppage";
        }else {
            myriad.setActive(0);
            myriad.setRoles(roleService.findById(2L));
            myriad= myriadService.saveMyriad(myriad);

            try {

                    System.out.printf("Sending email to:%s......\n\n\nn\n",myriad.getEmailAddress());
                SimpleMailMessage msg = new SimpleMailMessage();
                msg.setTo("msoroncho@gmail.com");

                msg.setSubject("Testing from Spring Boot");
                msg.setText(new MailMessageTemplate().BookingConfirmation(myriad));

                emailService.sendMailUsingTemplate(myriad.getEmailAddress(),"faustinesoroncho@gmail.com","Testing from Spring Boot",new MailMessageTemplate().BookingConfirmation(myriad));

                System.out.print("Email sent......\n\n\nn\n");
            }catch (Exception ex){

               System.out.print("Unable to send email" + ex);
            }

            return "redirect:/users/login?new";
        }

    }

}
