package com.clf.basicproject.domain.entity;


import com.clf.basicproject.domain.model.LifeCycleStatus;
import com.clf.basicproject.domain.model.TableNames;
import com.clf.basicproject.domain.model.UserType;

import javax.persistence.*;


@Entity
@Table(name = TableNames.auth_user)
public class AuthUserEntity extends MixinAuditedEntity {

    @Id
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserType type;
    @Enumerated(EnumType.STRING)
    private LifeCycleStatus status;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public LifeCycleStatus getStatus() {
        return status;
    }

    public void setStatus(LifeCycleStatus status) {
        this.status = status;
    }
}
