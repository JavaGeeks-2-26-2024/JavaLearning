package com.leaning.day3;


public class WorkSpace {

	public static void main(String[] args) {
//		Objects  -> volo -> volo, gray, v60, 2020, 30000 
//                          drive(), stop()
		
//		className ObjectName = new className();		
		
		Car volo = new Car();
		
		volo.name = "volo";
		volo.color ="gray";
		volo.model = "v60";
		volo.mfgYear =2020;
		volo.mileage = 30000;
		
		 volo.drive();
		 volo.stop();

		 System.out.println(volo.color);
		 
		 volo.changeColorToRed();
		 
		 System.out.println(volo.mfgYear);
		 System.out.println(volo.color);
//--------------------------------------------------------		
//       -> Toyota -> camry, blue, scl, 2024, 0 
//                    drive(), stop()	
		 
		 
		 Car toyota = new Car();
		 
		 toyota.name = "camry";
		 toyota.color = "blue";
		 toyota.model = "scl";
		 toyota.mfgYear= 2024;
		 toyota.mileage= (int) 12.4567890;
		 toyota.price= 10000;
		 
		 System.out.println(volo);
		 System.out.println(toyota);
        System.out.println(toyota.mileage);
        toyota.drive();
        toyota.chnageColor("white");
        toyota.changePrice(23000);
        System.out.println();
        
        TV mytv = new TV();
        
         mytv.changeChannel(5);
        
	}

}
