package com.tupilabs;

import org.apache.wicket.markup.html.border.Border;
import org.apache.wicket.markup.html.border.BoxBorder;

public class MyBorder extends Border {

    public MyBorder(String id) {
        super(id);
        
        addToBorder(new BoxBorder("nav"));
        addToBorder(new BoxBorder("body"));
    }

    private static final long serialVersionUID = 1L;

}
