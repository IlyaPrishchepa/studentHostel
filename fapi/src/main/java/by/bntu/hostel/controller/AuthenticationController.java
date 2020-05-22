package by.bntu.hostel.controller;

import by.bntu.hostel.config.JwtTokenUtil;
import by.bntu.hostel.entity.AuthToken;
import by.bntu.hostel.entity.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/generate-token")
    public ResponseEntity<?> register(@RequestBody Base base) {

        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        base.getLogin(),
                        base.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final String token = jwtTokenUtil.doGenerateToken(authentication);
        return ResponseEntity.ok(new AuthToken(token));
    }
}
