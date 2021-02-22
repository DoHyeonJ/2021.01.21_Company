package main.company.information;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class InformationForm {

    @NotBlank
    private String name;

    @NotBlank
    private String number;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String license;

}
