package com.example.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.domain.User;

class UserControllerTest {

  @Test
  void getAnyUser() {
    // given
    User testUser = User.builder().username("oleg").password("qwerty").build();
    UserController userController = mock(UserController.class);
    when(userController.getAnyUser()).thenReturn(new ResponseEntity(testUser, HttpStatus.OK));

    // when
    ResponseEntity result = userController.getAnyUser();

    // then
    assertNotNull(result);
    assertEquals(testUser, result.getBody());
  }
}
