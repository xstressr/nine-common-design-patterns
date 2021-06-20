package com.sjy.constructor;

//	创建Builder接口（给出一个抽象接口，以规范产品对象的各个组成成分的建造，这个接口只是规范）
public interface PersonBuilder {

	void builderHelmetMurder();
	
	void builderArmorMurder();
	
	void builderWeaponMurder();
	
	void builderHelmetYanLong();
	
	void builderArmorYanLong();
	
	void builderWeaponYanLong();
	
	Arms BuilderArms();	//	组装
}
