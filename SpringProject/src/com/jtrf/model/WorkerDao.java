package com.jtrf.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("workerDao")
public class WorkerDao {
	
//	@Autowired @Qualifier("worker2")
	private Worker worker;
//	官方建議這種方法
	
	public WorkerDao() {
		
	}
	
	@Autowired
	public WorkerDao( @Qualifier("worker2")Worker worker) {
		this.worker= worker;
	}
	
	public void printResult() {
		System.out.println(worker.getId()+"\t"+worker.getName()+"\t"+worker.getTitle());
	}
}
