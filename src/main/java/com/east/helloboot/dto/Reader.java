package com.east.helloboot.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by yaowg on 2017/11/14
 */
@Entity
public class Reader /*implements UserDetails*/{

    @Id
    private String username;

    private String fullname;

    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @Override
    public String getUsername() {
        return username;
    }

//    @Override
    public String getPassword() {
        return password;
    }

   /* @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("READER"));
    }*/



   /* @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }*/
}
