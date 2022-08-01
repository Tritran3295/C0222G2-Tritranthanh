package com.blog.service.Impl;

import com.blog.model.MyUserDetail;
import com.blog.model.User;
import com.blog.repository.IUserRepository;
import com.blog.service.IUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MyUserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByName(username);
        if(user == null){
            throw  new UsernameNotFoundException("user name: " + username + "not found");
        }
        return new MyUserDetail(user);
    }
}
