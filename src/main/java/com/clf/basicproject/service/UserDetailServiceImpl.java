package com.clf.basicproject.service;

import com.clf.basicproject.domain.entity.AuthUserEntity;
import com.clf.basicproject.domain.repository.AuthUserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final AuthUserRepository authUserRepository;

    public UserDetailServiceImpl(AuthUserRepository authUserRepository) {
        this.authUserRepository = authUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUserEntity userEntity = authUserRepository.findFirstByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("auth.usernameNotFound");
        }
        return new User(userEntity.getUsername(), new BCryptPasswordEncoder().encode(userEntity.getPassword()), new ArrayList<>());
    }
}
