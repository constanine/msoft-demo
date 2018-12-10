package bokesoft.xialj.demo.dubbo.provider.impl;

import java.util.UUID;

import bokesoft.xialj.demo.dubbo.DubboHelloService;
import bokesoft.xialj.demo.dubbo.bean.ResultVO;

public class DubboHelloServiceImpl implements DubboHelloService{

	@Override
	public ResultVO updateMemberInfo() {
		ResultVO r = new ResultVO();
		r.setSuceess(true);
		r.setId(UUID.randomUUID().toString());
		r.setErrMsg("");
		r.setData("");
		return r;
	}

	@Override
	public ResultVO getMemberInfo() {
		ResultVO r = new ResultVO();
		r.setSuceess(true);
		r.setId(UUID.randomUUID().toString());
		r.setErrMsg("");
		r.setData("my name is xialj");
		return r;
	}

}
