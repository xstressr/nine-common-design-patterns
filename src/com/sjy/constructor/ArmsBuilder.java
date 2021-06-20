package com.sjy.constructor;

//	创建Builder实现类（这个类主要实现复杂对象创建的哪些部分需要什么属性）
public class ArmsBuilder implements PersonBuilder {
	private Arms arms;
	
	//	创建一个Arms实例，用于调用set方法
	public ArmsBuilder() {
		arms = new Arms();
	}

	public void builderHelmetMurder() {
		// TODO Auto-generated method stub
		arms.setHelmet("夺命头盔");
	}

	public void builderArmorMurder() {
		// TODO Auto-generated method stub
		arms.setArmor("夺命铠甲");
	}

	public void builderWeaponMurder() {
		// TODO Auto-generated method stub
		arms.setWeapon("夺命宝刀");
	}

	public void builderHelmetYanLong() {
		// TODO Auto-generated method stub
		arms.setHelmet("炎龙头盔");
	}

	public void builderArmorYanLong() {
		// TODO Auto-generated method stub
		arms.setArmor("炎龙铠甲");
	}

	public void builderWeaponYanLong() {
		// TODO Auto-generated method stub
		arms.setWeapon("炎龙宝刀");
	}

	public Arms BuilderArms() {
		// TODO Auto-generated method stub
		return arms;
	}
	
	
	
	
}
