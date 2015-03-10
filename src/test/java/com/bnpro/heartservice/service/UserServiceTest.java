package com.bnpro.heartservice.service;

import com.bnpro.heartservice.controller.response.MobileResponse;
import com.bnpro.heartservice.repository.UserRepository;
import com.bnpro.heartservice.repository.entity.User;
import com.bnpro.heartservice.service.model.UserDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock UserRepository mockUserRepository;
    @Mock User mockUser;

    @Test
    public void testRegister__registerSuccess__responseIsSuccess() throws Exception {
        when(mockUserRepository.save(any(User.class))).thenReturn(mockUser);
        MobileResponse<UserDetail> result = userService.register("", "", "");
        assertEquals("0", result.getStatusCode());
        assertEquals("success", result.getStatusMessage());
    }

    @Test
    public void testRegister__registerFail__exceptionWasTrown() {
        try {
            when(mockUserRepository.save(any(User.class))).thenThrow(new RuntimeException());
            userService.register("", "", "");
            assertTrue(false);
        } catch (Exception ex) {
            assertTrue(true);
        }
    }
}
