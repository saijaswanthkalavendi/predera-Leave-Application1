package com.application.service;
import com.application.model.*;
import java.util.List;



public interface UserDetailsService {
	public List<UserDetails> list();
	public UserDetails get(int id);
	public void saveOrupdate(UserDetails userDetails);
	
}
