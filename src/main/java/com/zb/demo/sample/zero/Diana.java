package com.zb.demo.sample.zero;

import com.zb.demo.sample.Hzro;
import org.springframework.stereotype.Component;

@Component
public class Diana implements Hzro {
    @Override
    public void r() {
        System.out.println("This is Diana r");
    }
}
