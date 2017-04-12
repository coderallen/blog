package com.ca.blog.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Allen on 31/03/2017.
 * coder.allen@hotmail.com
 */

@Entity
@Table(name = "Dept")
public class Dept {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    private String createtime;

    @OneToMany
    private Set<User> users;

    public Dept() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
