package com.granpree.dto;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserJoinDTO {
    @NotNull @Size(max = 10)
    private String userID;
    @NotNull @Size(max = 5)
    private String userName;
    @NotNull @Size(max = 10)
    private String userPwd;
    @Nullable @Pattern(regexp = "/^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$/i")
    private String userEmail;
    @Nullable @Pattern(regexp = "/^\\d{3}-\\d{3,4}-\\d{4}$/")
    private String userPhonenumber;
}
