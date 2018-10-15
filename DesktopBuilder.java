package ComputerComponent;

public class DesktopBuilder extends ComputerBuilder {
	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		System.out.println("我是pc的Cpu");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		System.out.println("我是pc的存储器");
	}

	@Override
	public void buildHarddisk() {
		// TODO Auto-generated method stub
		System.out.println("我是pc的硬盘");
	}

	@Override
	public void buildMainFrame() {
		// TODO Auto-generated method stub
		System.out.println("我是pc的框架");
	}

	@Override
	public void buildMonitor() {
		// TODO Auto-generated method stub
		System.out.println("我是pc的显示器");
	}
}
