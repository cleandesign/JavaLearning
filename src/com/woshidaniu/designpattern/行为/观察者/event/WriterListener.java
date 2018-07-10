package com.woshidaniu.designpattern.行为.观察者.event;

import java.util.EventListener;

/**
 * Created by kang on 2018/7/6.
 */
public interface WriterListener extends EventListener {
    void addNovel(WriterEvent writerEvent);
}
