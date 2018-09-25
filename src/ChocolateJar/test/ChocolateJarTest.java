package ChocolateJar.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ChocolateJar.ChocolateJar;

class ChocolateJarTest {

	@Test
	void testChocolateJar() {// 생성자 테스트
		ChocolateJar jar = new ChocolateJar();
		assertEquals(13, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testChocolateJarInt() {// 초콜릿 수를 입력 받는 생성자 테스트
		ChocolateJar jar = new ChocolateJar(11);
		assertEquals(11, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testGetItem() {// 총아이템수
		ChocolateJar jar = new ChocolateJar();
		assertEquals(14, jar.getItem());
	}

	@Test
	void testGetChocolate() {// 초콜릿갯수 확인
		ChocolateJar jar = new ChocolateJar();
		assertEquals(13, jar.getChocolate());
	}

	@Test
	void testGetChilli() {// 칠리 갯수 확인
		ChocolateJar jar = new ChocolateJar();
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testTakeItem() {// 초콜릿 뽑기
		ChocolateJar jar = new ChocolateJar();
		assertEquals(14, jar.getItem());
		jar.takeItem(3);
		assertEquals(11, jar.getItem());
		jar.takeItem(2);
		assertEquals(9, jar.getItem());
		jar.takeItem(1);
		assertEquals(8, jar.getItem());
	}

	@Test
	void testStatus() {// 항아리 안에 아이템의 상태
		ChocolateJar jar = new ChocolateJar();
		assertEquals("[ ■ □ □ □ □ □ □ □ □ □ □ □ □ □ ]", jar.status());
		jar.takeItem(3);
		assertEquals("[ ■ □ □ □ □ □ □ □ □ □ □ ]", jar.status());
	}

	@Test
	void testIsEmpty() {// 항아리가 비워있는지 확인
		ChocolateJar jar = new ChocolateJar();
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(2);
		assertTrue(jar.isEmpty());
	}

}
