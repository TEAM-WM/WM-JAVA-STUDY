package com.wm.d08;

public class SumThread extends Thread {		// ������ ���
	
	private long sum;

	public long getSum() {		// private�� �ɸ� sum ���� �ܺο��� ������ �� �ִ� getter
		return sum;
	}

	public void setSum(long sum) {		// private�� �ɸ� sum ���� �ܺο��� ���� �� �� �ִ� setter
		this.sum = sum;
	}

	@Override
	public void run() {		// �����带 ���� �۾��ϰ� ���� ������ ���� run() �޼ҵ�
		for(int i=0; i<=100; i++) {
			sum+=i;			// ������� �۾��� ����
		
		}	// for
		
	}	// run
	
}	// class
