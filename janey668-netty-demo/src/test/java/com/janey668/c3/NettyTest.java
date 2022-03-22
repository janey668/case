package com.janey668.c3;

import io.netty.channel.DefaultEventLoopGroup;
import io.netty.util.concurrent.EventExecutor;
import org.junit.Test;

public class NettyTest {

    @Test
    public void testEventLoopGroup() {
        DefaultEventLoopGroup group = new DefaultEventLoopGroup();
        for (EventExecutor loop : group) {
            System.out.println(loop);
        }
    }

    @Test
    public void testEventLoopGroup1() {
        DefaultEventLoopGroup group = new DefaultEventLoopGroup(2);
        for (EventExecutor loop : group) {
            System.out.println(loop);
        }
    }

    @Test
    public void testEventLoopGroup2() {
        DefaultEventLoopGroup group = new DefaultEventLoopGroup(2);
        System.out.println(group.next());
        System.out.println(group.next());
        System.out.println(group.next());
        System.out.println(group.next());
    }

}
