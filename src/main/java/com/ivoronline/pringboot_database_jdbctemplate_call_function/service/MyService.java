package com.ivoronline.pringboot_database_jdbctemplate_call_function.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // CALL FUNCTION
  //=========================================================================================================
  public String callFunction(String name) {
    return jdbcTemplate.queryForObject(
      " SELECT TEST.MY_FUNCTION(?) AS MESSAGE FROM DUAL"
      , new Object[] { name }
      , String.class
    );
  }

}
