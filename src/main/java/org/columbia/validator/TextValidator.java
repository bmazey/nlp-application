package org.columbia.validator;

import org.columbia.dto.TextDto;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TextValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return TextDto.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        TextDto text = (TextDto) obj;
        if (checkInputString(text.getText())) {
            errors.rejectValue("text", "name.empty");
        }
    }

    private boolean checkInputString(String input) {
        return (input == null || input.trim().length() == 0);
    }
}
