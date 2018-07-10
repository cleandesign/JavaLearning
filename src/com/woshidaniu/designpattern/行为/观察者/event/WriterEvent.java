package com.woshidaniu.designpattern.行为.观察者.event;


import java.util.EventObject;

/**
 * Created by kang on 2018/7/6.
 */
public class WriterEvent extends EventObject {

    private static final long serialVersionUID = 8546459078247503692L;

    public WriterEvent(Writer writer) {
        super(writer);
    }

    public Writer getWriter(){
        return (Writer) super.getSource();
    }

}