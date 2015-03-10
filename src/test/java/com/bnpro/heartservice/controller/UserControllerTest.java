package com.bnpro.heartservice.controller;

import com.bnpro.heartservice.controller.request.RegisterRequest;
import com.bnpro.heartservice.controller.response.MobileResponse;
import com.bnpro.heartservice.repository.entity.User;
import com.bnpro.heartservice.service.UserService;
import com.bnpro.heartservice.service.model.UserDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock private UserService mockUserService;
    @Mock private RegisterRequest mockRegisterRequest;
    @Mock private User mockUser;

    @Test
    public void testRegister__registerWithEmailSuccess__responseIsSuccess() throws Exception {
        MobileResponse<UserDetail> mobileResponse = new MobileResponse<UserDetail>("0", "success");
        when(mockUserService.register(anyString(), anyString(), anyString())).thenReturn(mobileResponse);

        MobileResponse<UserDetail> result = userController.register(mockRegisterRequest);

        assertEquals("0", result.getStatusCode());
        assertEquals("success", result.getStatusMessage());
    }

    @Test
    public void testRegister__registerWithEmailFail__responseIsNotSuccess() throws Exception {
        when(mockUserService.register(anyString(), anyString(), anyString())).thenThrow(new RuntimeException());
        MobileResponse<UserDetail> result = userController.register(mockRegisterRequest);
        assertEquals("error", result.getStatusCode());
    }

}
