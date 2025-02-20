package com.example.JAVA_SPRING_PHONESHOP.service.validator;

import com.example.JAVA_SPRING_PHONESHOP.domain.dto.RegisterDTO;
import com.example.JAVA_SPRING_PHONESHOP.service.UserService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RegisterValidator implements ConstraintValidator<RegisterChecked, RegisterDTO> {
    private final UserService userService;

    public RegisterValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean isValid(RegisterDTO user, ConstraintValidatorContext context) {
        boolean valid = true;
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            context.buildConstraintViolationWithTemplate("Password must match").addPropertyNode("confirmPassword")
                    .addConstraintViolation().disableDefaultConstraintViolation();
            valid = false;
        }
        if (this.userService.checkEmailExist(user.getEmail())) {
            context.buildConstraintViolationWithTemplate("Email exist").addPropertyNode("email")
                    .addConstraintViolation().disableDefaultConstraintViolation();
            valid = false;

        }
        return valid;
    }
}
