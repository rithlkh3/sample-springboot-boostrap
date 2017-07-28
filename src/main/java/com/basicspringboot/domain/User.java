package com.basicspringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ron Rith
 * Created on 7/27/2017.
 */
@Entity
@Table(name = "tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @NotEmpty(message = "Message ereraddsa")
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
