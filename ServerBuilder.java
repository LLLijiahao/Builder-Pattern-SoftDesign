package ComputerComponent;

public class ServerBuilder extends ComputerBuilder {
	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		System.out.println("我是服务机的Cpu");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		System.out.println("我是服务机的存储器");
	}

	@Override
	public void buildHarddisk() {
		// TODO Auto-generated method stub
		System.out.println("我是服务机的硬盘");
	}

	@Override
	public void buildMainFrame() {
		// TODO Auto-generated method stub
		System.out.println("我是服务机的框架");
	}

	@Override
	public void buildMonitor() {
		// TODO Auto-generated method stub
		System.out.println("我是服务机的显示器");
	}
}
