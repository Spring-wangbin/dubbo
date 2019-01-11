package dubbo.service.impl;

import dubbo.service.MemberService;

public class MemberServiceImpl implements MemberService {
    @Override
    public String sayHello(String name) {
        System.out.println("接收信息name:"+name);
        return "Hello " + name;
    }
}
