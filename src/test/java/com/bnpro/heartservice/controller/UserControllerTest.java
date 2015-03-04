package com.bnpro.heartservice.controller;

import com.bnpro.heartservice.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock private UserService mockUserService;

    @Test
    public void testRegister__registerSuccess__resultSuccess(){
        when(mockUserService.register()).thenReturn("success");
        String result = userController.register();
        verify(mockUserService, times(1)).register();
        assertEquals("success", result);
    }

}
