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
		this.Sex="��";
	}
	
	public void Dress(){
		System.out.println("�Ҵ�����");
	}
	
	public void Say(){
		System.out.println("��ѧϰ����");
	}
}
