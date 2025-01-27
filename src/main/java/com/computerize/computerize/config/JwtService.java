package com.computerize.computerize.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.function.Function;

@Service
public class JwtService {

    // TODO: Should be moved to application env/config file
    private static final String SECRET_KEY = "hvD2aKFjvn5jY82g4VFkY2Nq7i6Rjnlq";

    public String getUsername(String jwt){
        return null;
    }

    public <T> T getClaim(String token, Function<Claims, T> claimsResolver){
        final Claims claims = getClaims(token);
        return claimsResolver.apply(claims) ;
    }

    private Claims getClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }


}