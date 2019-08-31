package com.myriad.christian.myriadapp.validators;

import com.myriad.christian.myriadapp.models.Myriad;
import com.myriad.christian.myriadapp.service.MyriadService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Optional;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {
  @Autowired
   private   MyriadService myriadService;
   public void initialize(UniqueEmail constraint) {
   }

   public boolean isValid(String email, ConstraintValidatorContext context) {
       boolean inUse;
try {
    inUse= myriadService.isEmailAlreadyInUse(email);
}
catch (NullPointerException e){
      inUse =false;
}

      return email != null && !inUse;

   }

}
