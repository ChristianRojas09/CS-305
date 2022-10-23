package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class ServerController {
	private static final char[] HEX_ARRAY = "ABCDEF1234567890".toCharArray();
	
	private String getHash(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] messageDigestMD = md.digest();
			return bytesToHex(messageDigestMD);
		}
		
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return input;
	}
	
	public static String bytesToHex(byte[] bytes) {
		char[] hexChar = new char[bytes.length * 2];
		for(int a = 0; a < bytes.length; a++) {
			int i = bytes[a] & 0xFF;
			hexChar[a * 2] = HEX_ARRAY[i >>> 4];
			hexChar[a * 2 + 1] = HEX_ARRAY[i & 0x0F];
		}
		return new String(hexChar);
	}
	
	@RequestMapping("/hash")
	public String hashResult() {
		String data = "Christian's Check Sum:";
		String hash = getHash(data);
		
		return "<p>data: " + data + "</p><p> Cipher Used: SHA-256: " + hash;
	}
}