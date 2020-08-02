package com.lti.LoginBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.LoginBoot.model.LoginDetails;


@Repository
public interface LoginDao extends JpaRepository <LoginDetails,Long>{

}
