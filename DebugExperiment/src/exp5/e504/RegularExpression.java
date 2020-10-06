/**
 * 
 */
package exp5.e504;

/**
 * @author knightsong
 *Sword Point Offer 19. Regular expression matching
 */
public class RegularExpression {
	    public boolean isMatch(String A, String B) {
	            int n=A.length();
	            int m=B.length();
	            boolean[][]  f= new boolean[n+1][m+1];
	            for(int i=0;i<=n;i++){
	                for(int j=0;j<=m;j++){
	                    if(j==0){
	                     f[i][j]=i==0;   //处理空正则和空字符串，非字符串，空正则。
	                }else{
	                    //非空正则非为两种情况，‘*’和非‘*’
	                    if(B.charAt(j-1)!='*'){
	                        if(i>0 && (A.charAt(i-1)==B.charAt(j-1) || B.charAt(j-1)=='.')){
	                            f[i][j]=f[i-1][j-1];
	                        }
	                    }else{
	                    	/**@FC
	                    	 * Boundary conditions j>=2
	                    	 */
	                        if(j>2){
	                            f[i][j]|=f[i][j-2];
	                        }
	                    	/**@FC
	                    	 * Boundary conditions j>=1 && j>=2
	                    	 */
	                        if(i>0 && j>2 && (A.charAt(i-1)==B.charAt(j-2) || B.charAt(j-2)=='.')){
	                            f[i][j]|=f[i-1][j];
	                        }
	                    }


	                }
	            }
	    }
	    return f[n][m];
	}
}
