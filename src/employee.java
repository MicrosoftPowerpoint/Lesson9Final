



public class employee {

    
    
	 String name;
	 double rate;
	 int hours;	
	 
            double low_rate = 6.75;
            double high_rate = 30.50;
            double low_hours = 1;
            double high_hours = 60;
            double totalpay = 0;
	public employee() {
	 name = "";
         rate = 0;
         hours = 0;
	 
	}

	
	public String getNameRules() {
	 	return "nonblank";
	}

	public String getTypeRules() {
		return "1 or 2";
	}
        
        public static double getTotalPay()
        {
        return 0;
        }
                
                public String getRateRules() {
		return "between 6.75 and 30.50, inclusive";
	}

	
	public String getHoursRules() {
		return "between 1 and 60, inclusive";
	}

	public boolean setName(String nm) {
		if (nm.equals(""))
			return false;
		else{
			name=nm;
			return true;
		}
	}

	
	

	
	public boolean setRate(double rt) {
		if (rt < 6.75 || rt > 30.50)
			return false;
		else{
			rate=rt;
			return true;
		}
	}

	public boolean setHours(int hrs) {
		if (hrs < 1 || hrs > 60)
			return false;
		else{
			hours=hrs;
			return true;
		}
	}

	public String getName() {
		return name;
	}

	public double getPay() {
        return 0;
        }
}

