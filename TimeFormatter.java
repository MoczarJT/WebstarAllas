public class TimeFormatter{
    public static String formatDuration(int seconds){
              
    		String result = "";
        int sec = seconds;
        int[] timeArr = { 60 * 60 * 24 * 365, 60 * 60 * 24, 60 * 60, 60, 1 };
        String[] periodArr = {"year","day","hour","minute","second"};
  
        if (seconds == 0) {
          result = "now";
        }
  
        for (int i = 0; i< timeArr.length; i++) {
          int k = sec / timeArr[i];
					sec = sec % timeArr[i];
									
          if (k != 0) {
            String pref = "";
            if (result != "") {
              if (sec == 0) {
                pref = " and ";    
              } else {
                pref = ", ";
                }
						}
											
            result = result + pref + Integer.toString(k) + " " + periodArr[i];
            result += k > 1 ? "s" : "";
          }
				}
			  
				return result;

    	}
  }