package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.dto.LoginDTO;
import com.project.dto.UserDetailsDto;
import com.project.entity.User;
import com.project.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findUserNameDuplicate(username);

		// Nếu email gửi từ client lên không có trong database
		if (user == null) {
			throw new UsernameNotFoundException("Email không tồn tại!");
		}
		String roleName = user.getROLE();

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(roleName));
		// Tạo đối UserDetailsDto
		UserDetailsDto userDetailsDto = new UserDetailsDto(user.getUSERNAME(), user.getPASSWORD(), authorities);

		return userDetailsDto;

	}
}