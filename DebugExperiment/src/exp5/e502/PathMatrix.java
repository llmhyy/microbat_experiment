/**
 * 
 */
package exp5.e502;

/**
 * @author knightsong The sword refers to Offer 12. The path in the matrix
 */

class PathMatrix {
	public boolean exist(char[][] board, String word) {
		char[] pattern = word.toCharArray();
		for (int i = 0; i < board.length; i++) {
			char[] cs = board[i];
			for (int j = 0; j < cs.length; j++) {
				if (dfsSearch(board, pattern, i, j, 0))
					return true;
			}
		}
		return false;
	}

	public boolean dfsSearch(char[][] board, char[] pattern, int i, int j, int k) {
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != pattern[k]) {
			return false;
		}
		if (k == pattern.length - 1) {
			return true;
		}
		/**
		 * @FC Missing code char tmp = board[i][j];
		 */
		board[i][j] = '/';
		boolean res = dfsSearch(board, pattern, i + 1, j, k + 1) || dfsSearch(board, pattern, i - 1, j, k + 1)
				|| dfsSearch(board, pattern, i, j - 1, k + 1) || dfsSearch(board, pattern, i, j + 1, k + 1);
		/**
		 * @FC Missing code board[i][j] = tmp;
		 */
		return res;
	}

}