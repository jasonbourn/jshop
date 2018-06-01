package com.jason.shop.common.util;

import com.jason.shop.common.base.model.JWT;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;
import java.util.Date;

/** 
 * token生成和解密工具 
 *  
 * @author Linhai.Tan 
 */  
public class TokenUtil {
    private static SignatureAlgorithm signatureAlgorithm;  
    private static Key secretKey;
    private static String encodedKey = "jshopSk";

    static {  
        signatureAlgorithm = SignatureAlgorithm.HS512;
        secretKey = serializeKey(encodedKey);
    }  
  
    /** 
     * 创建token 
     *  
     * @param jwt 
     * @return 
     */  
    public static String createToken(JWT jwt) {
        return Jwts.builder().setSubject(String.valueOf(jwt.getMemberId())).claim("memberId", jwt.getMemberId())
                .setIssuedAt(new Date()).claim("userName", jwt.getUsername()).setExpiration(jwt.getExpirationDate())
                .signWith(getSignatureAlgorithm(), secretKey).compact();  
    }
  
    private static SignatureAlgorithm getSignatureAlgorithm() {
        return signatureAlgorithm;  
    }  
  
    public static JWT parseAndValidate(String token) {  
        JWT jwt = null;  
        try {  
            jwt = new JWT();  
            Claims claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
            jwt.setMemberId(String.valueOf(claims.get("memberId")));
            jwt.setUsername(String.valueOf(claims.get("userName")));
            jwt.setExpirationDate(claims.getExpiration());  
        } catch (JwtException ex) {  
            ex.printStackTrace();
            jwt = null;
        }  
        return jwt;  
    }  
  
    /** 
     * 序列化key 
     *  
     * @param encodedKey 
     * @return 
     */  
    private static Key serializeKey(String encodedKey) {  
        byte[] decodedKey = Base64.getDecoder().decode(encodedKey);  
        Key key = new SecretKeySpec(decodedKey, getSignatureAlgorithm().getJcaName());  
        return key;  
    }  
}  