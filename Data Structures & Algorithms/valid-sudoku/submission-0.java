class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            if(!isValidRow(board, i)){
                return false;
            }
        }
        for(int i = 0; i < 9; i++){
            if(!isValidColumn(board, i)){
                return false;
            }
        }
        for(int i = 0; i < 9; i+=3){
            for(int j = 0; j < 9; j+=3){
                if(!isValidBox(board,i,j)){
                    return false;
                }
            }
        }
        return true;

        
    }
    //check if a row is valid
    private boolean isValidRow(char[][] board, int rowIndex) {
        HashSet<Integer> rowCheck = new HashSet<>();
        for (int col = 0; col < 9; col++) {
            char num = board[rowIndex][col];
            if (num == '.') continue;
            int number = Character.getNumericValue(num);
            if (rowCheck.contains(number)) {
                return false;
            }
            rowCheck.add(number);
        }
        return true;
    }

    // Check if a column is valid
    private boolean isValidColumn(char[][] board, int colIndex) {
        HashSet<Integer> columnCheck = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            char num = board[row][colIndex];
            if (num == '.') continue;
            int number = Character.getNumericValue(num);
            if (columnCheck.contains(number)) {
                return false;
            }
            columnCheck.add(number);
        }
        return true;
    }

    private boolean isValidBox(char[][]board, int startRow, int startColumn){
        HashSet<Integer> boxCheck = new HashSet<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
                char num = board[startRow+i][startColumn+j];
                if(num == '.') continue;
                int number = Character.getNumericValue(num);
                if(boxCheck.contains(number)){
                    return false;
                }
                boxCheck.add(number);
            }
        }
        return true;
    }
}

