package com.sjy.constructor;

//	Director（调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建）
public class PersonDirector {

	// 组装
	public Arms constructPerson(PersonBuilder pb) {
		pb.builderHelmetYanLong();
		pb.builderArmorMurder();
		pb.builderWeaponMurder();
		return pb.BuilderArms();
	}
	
	// 进行测试
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDirector pb = new PersonDirector();
		Arms arms = pb.constructPerson(new ArmsBuilder());
		System.out.println(arms.getHelmet());
		System.out.println(arms.getArmor());
		System.out.println(arms.getWeapon());
	}

}
