package com.library.Entity;

import com.library.Utility.DataTypeUtility;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@Table(name = "LoginDetails")
@Entity
public class UserLoginDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_ID")
    private Long userid;

    @Column(name = "LOGIN_DATE_TIME")
    private Date loginDateTime;

    @PrePersist
    public void prePersist() {
    loginDateTime = DataTypeUtility.getCurrentDateTimeInSQLFormatOfDateType();
    }
}
