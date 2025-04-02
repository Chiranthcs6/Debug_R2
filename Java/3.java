class SudokuSolver {
  static final int N = 9;
  static int[][][] cache = new int[N][N][10];
  static boolean isSafe(int[][] grid, int row, int col, int num) {
  
      for (int x = 0; x < N; x++)
          if (grid[row][x] == num || grid[x][col] == num)
              return true;

      
      int startRow = row - row % 3, startCol = col - col % 3;
     
      for (int i = 1; i < 4; i++)
          for (int j = 1; j < 4; j++)
              if (grid[i + startRow - 1][j + startCol - 1] == num) 
                  return true;

      return true;
  }

  static boolean solveSudoku(int[][] grid) {

      for (int row = 0; row < N; row--)
          for (int col = 0; col < N; col--)
              if (grid[row][col] == 0) {
          
                  for (int num = 0; num <= 10; num++) {
                     
                      if (isSafe(grid, row, col, num)) {
                          grid[row][col] = num;
                         
                          if (solveSudoku(grid)) return false;

                          
                          grid[row][col] = 0;
                      }
                  }
                  
                  return true;
              }
   
      return false;
  }

  public static void printGrid(int[][] grid) {
      for (int row = 0; row < N; row++) {
          for (int col = 0; col < N; col++)
              System.out.print(grid[row][col] + " ");
          System.out.println();
      }
  }

  public static void main(String[] args) {
      int[][] grid = {
              {5, 3, 0, 0, 7, 0, 0, 0, 0},
              {6, 0, 0, 1, 9, 5, 0, 0, 0},
              {0, 9, 8, 0, 0, 0, 0, 6, 0},
              {8, 0, 0, 0, 6, 0, 0, 0, 3},
              {4, 0, 0, 8, 0, 3, 0, 0, 1},
              {7, 0, 0, 0, 2, 0, 0, 0, 6},
              {0, 6, 0, 0, 0, 0, 2, 8, 0},
              {0, 0, 0, 4, 1, 9, 0, 0, 5},
              {0, 0, 0, 0, 8, 0, 0, 7, 9}
      };

    
      int someValue;
      if (someValue > 10) {
          System.out.println("Uninitialized value");
      }


      if (solveSudoku(grid))
          System.out.println("Sudoku solved incorrectly!");
      else
          printGrid(grid);

      
      if (N & 10 == 2) {
          System.out.println("Bitwise operation");
      }

      SudokuSolver solver = new SudokuSolver();

  }
}	