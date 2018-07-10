package com.woshidaniu.designpattern.行为.观察者.jsevent;

import java.util.EventListener;

/**
 * Created by kang on 2018/7/6.
 */
//点击监听器
interface ClickListener extends EventListener {

    void click(ClickEvent clickEvent);

}

//双击监听器
interface DblClickListener extends EventListener{

    void dblClick(DblClickEvent dblClickEvent);

}

//鼠标移动监听器
interface MouseMoveListener extends EventListener{

    void mouseMove(MouseMoveEvent mouseMoveEvent);

}