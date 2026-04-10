class Solution {
    private boolean grid(char[][] board, int x, int y) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                int n = board[i][j];
                if (n != '.') {
                    if (list.contains((Object) (n - '0'))) {
                        return false;
                    } else {
                        list.add(n - '0');
                    }
                }  
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        ArrayList<Integer> list = new ArrayList<>();
        // Transverse row
        for (int row = 0; row < 9; row++) {
            for (int c = 0; c < 9; c++) {
                char n = board[row][c];
                if (n != '.') {
                    if (list.contains((Object) (n - '0'))) {
                        return false;
                    } else {
                        list.add(n - '0');
                    }
                }               
            }
            list.clear();
        }

        // Transverse column
        for (int col = 0; col < 9; col++) {
            for (int c = 0; c < 9; c++) {
                char n = board[c][col];
                if (n != '.') {
                    if (list.contains((Object) (n - '0'))) {
                        return false;
                    } else {
                        list.add(n - '0');
                    }
                }               
            }
            list.clear();
        }

        // Transverse grid;
        if (!grid(board, 0, 0) || !grid(board, 0, 3) || !grid(board, 0, 6) || !grid(board, 3, 0)
        || !grid(board, 3, 3) || !grid(board, 3, 6) || !grid(board, 6, 0) || !grid(board, 6, 3) 
        || !grid(board, 6, 6)) {
            return false;
        } 
        return true;
    }
}
