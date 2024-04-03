package todo.project.todo.service;

import todo.project.todo.dto.JwtAuthResponse;
import todo.project.todo.dto.LoginDto;
import todo.project.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    JwtAuthResponse login(LoginDto loginDto);

}
