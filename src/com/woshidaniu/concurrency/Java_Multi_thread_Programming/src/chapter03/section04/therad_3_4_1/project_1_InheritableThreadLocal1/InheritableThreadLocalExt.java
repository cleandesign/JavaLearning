package com.woshidaniu.concurrency.Java_Multi_thread_Programming.src. chapter03.section04.therad_3_4_1.project_1_InheritableThreadLocal1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
