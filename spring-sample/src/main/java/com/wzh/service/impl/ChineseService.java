package com.wzh.service.impl;

import com.wzh.service.IPersonService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author wzh
 * @version 1.0
 * @date 2023/12/17 12:16
 * @since 1.0
 */

@Service
@Primary
public class ChineseService implements IPersonService {
	@Override
	public void sayHello() {
		System.out.println("你好");
	}
}
