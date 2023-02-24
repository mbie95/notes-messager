package com.marcinbielenit.messager;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author marcin
 */
@Getter
@Setter
public class Mail {
    @Email
    private String email;
    @NotBlank
    private String title;
    @NotBlank
    private String content;
}
