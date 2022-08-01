package com.form.dto;

import javax.validation.constraints.*;

public class UserDTO {
    private Integer id;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 5, max = 45)
    private String firstName;

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastName;

    @NotNull
    @PositiveOrZero
    @Pattern(regexp = "^[0-9]{10}$", message = "phone valid")
    private String phone;

    @NotNull
    @Min(18)
    @PositiveOrZero
    private int age;

    @NotNull
    @NotBlank
    @NotEmpty
    @Email(message = "email valid")
    private String email;

    public UserDTO() {
    }

    public UserDTO(Integer id, String firstName, String lastName, String phone, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
