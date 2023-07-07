package com.wm.d08;

public class Calculator {
	
	private int memory;

	public int getMemory() {	// private�� �ɷ��ִ� memory���� �ܺο��� ������ �� �ְ� ���ִ� getter	
		return memory;
	}

	public synchronized void setMemory1(int memory) {	// �޼ҵ� ����ȭ --> synchronized
		this.memory = memory;		// memory �� ����
		try {
			Thread.sleep(2000);		// ������ �Ͻ����� ( 2000 -> 2�� )
		} catch (InterruptedException e) {		// ���� ó��

		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);		// ���
	}
	
	public void setMemory2(int memory) {
		synchronized (this) {		// ����ȭ ���
			this.memory = memory;	// memory �� ����
			try {
				Thread.sleep(2000);		// ������ �Ͻ����� ( 2000 -> 2�� )
			} catch (InterruptedException e) {		// ���� ó��
				
			}	
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);		// ���
			
		}	// synchronized
	} // setMemory
}	// class
