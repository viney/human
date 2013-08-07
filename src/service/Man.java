package service;

import service.impl.StudyImpl;
import base.Human;

/**
 * @author viney
 *
 * 2013-8-7
 */
public class Man extends Human implements StudyImpl {
	public Man(){
		this.Sex="男";
	}
	
	public void Dress(){
		System.out.println("我穿西服");
	}
	
	public void Say(){
		System.out.println("我学习汉语");
	}
}
