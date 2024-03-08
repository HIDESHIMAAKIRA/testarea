package com.example.auth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entity.UserAccount;

@Service
public class DemoUserDetailsService implements UserDetailsService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String query = "SELECT * from user_account";
        List<UserAccount> customer = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(UserAccount.class));
        
        customer.get(0).setPassword("{noop}" +customer.get(0).getPassword());


		UserAccount user = customer.get(0);



		if (user == null) {
			throw new UsernameNotFoundException("not found : " + username);
		}
		return (new DemoUserDetails(user));
	}
}