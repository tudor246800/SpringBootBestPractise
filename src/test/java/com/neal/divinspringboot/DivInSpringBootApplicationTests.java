package com.neal.divinspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DivInSpringBootApplicationTests {
	@Mock
	private List mockList;

	@Test
	public void contextLoads() {
	}

	@Test
	public void verifyBehavior(){
		List mock = mock(List.class);
		mock.add(1);
		mock.clear();
		//验证add(1)和clear()行为是否发生
		verify(mock).add(1);
		verify(mock).clear();
	}

	@Test
	public void when_thenReturn(){
		//mock一个Iterator类
		Iterator iterator = mock(Iterator.class);
		//预设当iterator调用next()时第一次返回hello，第n次都返回world
		when(iterator.next()).thenReturn("hello").thenReturn("world");
		//使用mock的对象
		String result = iterator.next() + " " + iterator.next() + " " + iterator.next();
		//验证结果
		assertEquals("hello world world",result);
		Mockito.when(mockList.get(0)).thenReturn("first");
	}

}
