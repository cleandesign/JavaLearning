package com.woshidaniu.designpattern.行为.观察者.event;

/**
 * Created by kang on 2018/7/6.
 */
//public class EventObject implements java.io.Serializable {
//
//    private static final long serialVersionUID = 5516075349620653480L;
//
//    /**
//     * The object on which the Event initially occurred.
//     */
//    protected transient Object  source;
//
//    /**
//     * Constructs a prototypical Event.
//     *
//     * @param    source    The object on which the Event initially occurred.
//     * @exception  IllegalArgumentException  if source is null.
//     */
//    public EventObject(Object source) {
//        if (source == null)
//            throw new IllegalArgumentException("null source");
//
//        this.source = source;
//    }
//
//    /**
//     * The object on which the Event initially occurred.
//     *
//     * @return   The object on which the Event initially occurred.
//     */
//    public Object getSource() {
//        return source;
//    }
//
//    /**
//     * Returns a String representation of this EventObject.
//     *
//     * @return  A a String representation of this EventObject.
//     */
//    public String toString() {
//        return getClass().getName() + "[source=" + source + "]";
//    }
//}