package service;

import service.impl.StudyImpl;
import base.Human;

/**
 * @author viney
 *
 * 2013-8-7
 */
public class Woman extends Human implements StudyImpl {
	public Woman(){
		this.Sex="女";
	}
	
	public void Dress(){
		System.out.println("我穿裙子");
	}
	
	public void Say(){
		System.out.println("我学习英语");
	}
}
