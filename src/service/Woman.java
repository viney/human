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
		this.Sex="Ů";
	}
	
	public void Dress(){
		System.out.println("�Ҵ�ȹ��");
	}
	
	public void Say(){
		System.out.println("��ѧϰӢ��");
	}
}
