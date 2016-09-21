/**
 * Project Name:kind-netty
 * Package Name:com.kind.samples.netty
 * Date:2016年9月1日下午10:38:21
 * Copyright (c) 2016, http://www.kindapp.net All Rights Reserved.
 *
*/

package com.kind.samples.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * Function:丢弃服务处理Channel. <br/>
 * 
 * @author cary
 * @since JDK 1.8
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		try {
			// 默默地丢弃收到的数据
			((ByteBuf) msg).release(); // (3)
		} finally {
			// TODO: handle finally clause
			ReferenceCountUtil.release(msg);
		}

	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		// 当出现异常就关闭连接
		cause.printStackTrace();
		ctx.close();
	}

}
