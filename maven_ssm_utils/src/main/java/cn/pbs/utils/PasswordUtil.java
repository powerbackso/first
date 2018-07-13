package cn.pbs.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("123"));;
		//$2a$10$Y1idvRmrE.LfQQI25ivMIuTFtVi9UIz0LYOPoSbw8qG90Kz8N72ba
		//$2a$10$lb0NWPlDeEN601IkJuEU5O9TzwvF19Wm58CHe9h5PwgNVxqPqW3dW
		System.out.println(encoder.matches("123", "$2a$10$Y1idvRmrE.LfQQI25ivMIuTFtVi9UIz0LYOPoSbw8qG90Kz8N72ba"));;
		System.out.println(encoder.matches("123", "$2a$10$lb0NWPlDeEN601IkJuEU5O9TzwvF19Wm58CHe9h5PwgNVxqPqW3dW"));;
		
	}
}
