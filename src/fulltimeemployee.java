public class fulltimeemployee extends employee {
    public fulltimeemployee(){
        super();
     }
    
      public double getPay()
    {
        double pay;
        if(hours>0)
            pay = rate * 2 * (hours-40) + 40 * rate;
        else
            pay=rate*hours;
        totalpay+=pay;
        return pay;
        
    }
}

