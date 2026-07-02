class Solution {
    public static boolean checkRows(char [][] board){
        HashSet<Character> set = null;
        for(int i=0;i<board.length;i++){
            set = new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                char curr = board[i][j];
                if(curr=='.') continue;
                if(set.contains(curr)) return false;
                set.add(curr);
            }
        }
        return true;
    }
    public static boolean checkColumns(char [][] board){
        HashSet<Character> set = null;
        for(int i=0;i<board[0].length;i++){
            set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                char curr = board[j][i];
                // System.out.print(curr+" ");
                if(curr=='.') continue;
                if(set.contains(curr)) return false;
                set.add(curr);
            }
            // System.out.println();
        }
        return true;
    }
    public static boolean checkGrids(char [][] board){
        HashMap<Integer, HashSet<Character>> map = new HashMap<>();
        for(int i=0;i<board.length;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                char curr = board[i][j];
                if(curr=='.') continue;


                String index = i/3+""+j/3;
                int ind = Integer.parseInt(index);
                set = map.getOrDefault(ind, new HashSet<>());
                
                if(set.contains(curr)) return false;
                set.add(curr);
                map.put(ind, set);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkColumns(board) && checkGrids(board);
    }
}
