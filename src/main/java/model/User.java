package model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private  int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private UserType userType;
}
