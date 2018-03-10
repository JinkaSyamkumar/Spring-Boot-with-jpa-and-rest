package com.learning.data.dao;

import java.util.List;

import com.learning.data.dao.interfaces.UserDao;
import com.learning.data.entities.User;

public class UserHibernateDao extends AbstractDao<User,Long> implements UserDao {

	@Override
	public List<User> findByFirstName(String firstName) {
		//add implementation here...
		return null;
	}

}
