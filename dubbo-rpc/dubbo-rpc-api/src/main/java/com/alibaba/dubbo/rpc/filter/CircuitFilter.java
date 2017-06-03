package com.alibaba.dubbo.rpc.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * 服务熔断机制：主要实现服务的异常时的熔断与自动回复机制
 * @author wuwenhui
 *
 */
@Activate(group = Constants.PROVIDER, value = Constants.CIR_KEY)
public class CircuitFilter  implements  Filter{

	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		
		return null;
	}

}
