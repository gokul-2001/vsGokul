package sdtime;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class DeliveryTest {
	User u = new User();
	@Test
	void test1() {
		
		u.add(3);
		
	}
	@Test 
	void test2() {
		u.addtime(LocalDateTime.of(2023, 8, 25, 20, 00));
		u.addtime(LocalDateTime.of(2023, 8, 26, 20, 00));
		u.addtime(LocalDateTime.of(2023, 8, 27, 20, 00));
		u.addtime(LocalDateTime.of(2023, 8, 14, 20, 00));
		u.addtime(LocalDateTime.of(2023, 8, 14, 10, 00));
		u.addtime(LocalDateTime.of(2022, 12, 31, 20, 00));
		u.addtime(LocalDateTime.of(2023, 1, 1, 20, 00));
		u.addtime(LocalDateTime.of(2023, 1, 25, 20, 00));
		u.addtime(LocalDateTime.of(2023, 1, 26, 20, 00));
		u.addtime(LocalDateTime.of(2023, 2, 25, 20, 00));
		u.addtime(LocalDateTime.of(2023, 2, 28, 20, 00));
		u.addtime(LocalDateTime.of(2023, 3, 28, 20, 00));
		
		
		
}
}