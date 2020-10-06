/**
 * 
 */
package exp5.e502;

/**
 * @author knightsong
 *
 */
public class PathMatrixDebug {
	public static void main(String[] args) {
//testcase1
//		in：board = [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']], word = "ABCCED"
//		out：true
		PathMatrix pMatrix=new PathMatrix();
		char[][] board1= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word1="ABCCED";
		System.out.println(pMatrix.exist(board1, word1));
//testcase2
//		in:[['C','A','A'],['A','A','A'],['B','C','D']],word ='AAB'
//		out：true
		char[][] board2= {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
		String word2="AAB";
		System.out.println(pMatrix.exist(board2, word2));
	}
}
