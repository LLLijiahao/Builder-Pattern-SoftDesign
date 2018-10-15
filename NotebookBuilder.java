package ComputerComponent;

public class NotebookBuilder extends ComputerBuilder {

	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		System.out.println("我是笔记本的Cpu");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		System.out.println("我是笔记本的存储器");
	}

	@Override
	public void buildHarddisk() {
		// TODO Auto-generated method stub
		System.out.println("我是笔记本的硬盘");
	}

	@Override
	public void buildMainFrame() {
		// TODO Auto-generated method stub
		System.out.println("我是笔记本的框架");
	}

	@Override
	public void buildMonitor() {
		// TODO Auto-generated method stub
		System.out.println("我是笔记本的显示器");
	}
}
