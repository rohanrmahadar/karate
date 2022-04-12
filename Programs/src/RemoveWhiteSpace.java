
public class RemoveWhiteSpace {

	public static void main(String[] args) {

		{
			/*String str1 = "Rohan Mahadar        is a QualityAna    list";
  
        //1. Using replaceAll() Method
  
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);*/
			
			String str1 = "Rohan Mahadar        is an Autom ation Engi ne      er";

			char[] chars = str1.toCharArray();

			StringBuffer sb = new StringBuffer();

			for (int i = 0; i < chars.length; i++) {
				if ((chars[i] != ' ') && (chars[i] != '\t')) {
					sb.append(chars[i]);
				}
			}
			System.out.println(sb); // Output : CoreJavajspservletsjdbcstrutshibernatespring
		}
	}
}
