public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int numadd = Integer.parseInt(args[1]);

        int hourstoadd = (numadd/60)%24;
        int minutestoadd = numadd%60;
        int newminutes = minutes + minutestoadd;
        if (newminutes >= 60) {
            newminutes = newminutes - 60;
            hourstoadd = hourstoadd + 1;
        }
        
        int newhours = (hours + hourstoadd)%24;

        if(newhours < 10)
        {   if(newminutes < 10)
            {
                System.out.println("0" + newhours + ":0" + newminutes);
            }else{
                System.out.println("0" + newhours + ":" + newminutes);
            }
        }else{
            if(newminutes < 10)
            {
                System.out.println(newhours + ":0" + newminutes);
            }else{
                System.out.println(newhours + ":" + newminutes);
            }
        }
    }
}