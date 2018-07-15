package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter03.section03.therad_3_3_4.project_1_ThreadLocal33;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
