public abstract class namelist extends Object{
	protected double version = 0.01;
	private String[] 16A = {'侯庆超','陈可依','闫雨晴','王子砚','殷佳琪','宋存飞','刘安琪','陈文远','苏雪茗','李欣恬','郭庆阳','张忠豪','程庆哲','胡梦丹','王修志','司语涵','苏亚奇','李书强','赵登辰','王雨曦','俞正亚','徐光宇','孟轲冰','宫志昊','段润哲','商腾凯'};
	private String[] 16B = {'王一博','陈功名','王超林','郭彦晴','秦玟今','王兆讯','李亚琪','王晓丹','张亚琪','张天琦','武瑞艳','陈雪娇','司长鸿','薛宪昊','王旭瑞','徐晓爽','方晓涵','侯慧茹','张徐辰珂','赵含雨','唐文超','丁佳欣','刘项羽','白树坤','赵耀洋','洪一鸣'};
	private String[] 15A = {'魏义乾','冯素青','孔荧荧','张海涛','许晓轩','苗苏','张丽婷','张睦臻','张宇','赵登坤','张爱涛','郝继昶','李师恒','张雯雯','宋雨欣','蒋泽恒','徐大斌','陈静茹','苏琪琪','杨兆渠','苗翠莹','穆学博','王一彤','高伟华','郭荟鑫','魏海青'};
	private String[] 15B = {'孙文萱','白天旭','王延哲','吕琪倩','朱思如','宋嘉硕','陈玉萌','孟雨琦','张利伟','李贵昊','王之洋','李泽凯','郭少凯','张玉鹏','朱占博','张垚','王含含','杨洪福','王洪程','臧孝申','于龙浩','李媛媛','王一心','王一凡','刘秀丽','孟凡瑄'};
	
	public int getArraysAmount(String type){
		if(name.equals("16A")){
			return this.16A.length;
		}else if(name.equals("16B"){
			return this.16B.length;
		}else if(name.equals("15A"){
			return this.15A.length;
		}else if(name.equals("15B"){
			return this.15B.length;
	}
	System.err.println("参数未找到!");
	}
	
	protected abstract void submit();
}