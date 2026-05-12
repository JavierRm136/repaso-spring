package com.darkcode.spring.app.Services;
import java.util.ArrayList;
import java.util.List;
import com.darkcode.spring.app.Models.*;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<User> usuarios = new ArrayList<>();
    public void guardar (User user){
        usuarios.add(user);
    }
    public List<User> listarTodos(){
        return usuarios;
    }
}
