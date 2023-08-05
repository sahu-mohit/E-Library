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
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstname;
    @Column(name = "LAST_NAME")
    private String lastname;
    @Column(name = "EMAIL_ID")
    private String emailid;
    @Column(name = "CONTACT_NO")
    private String contactno;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "IS_ADMIN")
    private Boolean isAdmin;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATEDON")
    private Date createdon;
    @Column(name = "IS_DELETE")
    private Boolean isDelete;
    @Column(name = "IS_INCHARGE")
    private Boolean isIncharge;

    @PrePersist
    public void prePersist() {
        isAdmin = false;
        isDelete = false;
        isIncharge = false;
        createdon = DataTypeUtility.getCurrentDateTimeInSQLFormatOfDateType();
    }
}
