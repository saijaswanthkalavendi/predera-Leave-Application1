package com.application.dao;

import java.util.List;
import com.application.model.UserDetails;



public interface UserDetailsDAO 
{
public List<UserDetails> list();
public UserDetails get(int id);
public void saveOrupdate(UserDetails userDetails);

}