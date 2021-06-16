/**
 *
 * @author Sumit Bhimte
 */
public class Storage {
    private final String[][] matrix = new String[3][3];
    private String currentPlayerName = "X";
    private int XWonCount = 0;
    private int YWonCount = 0;
    int totalMoves = 0;
    //

    public int getTotalMoves() {
        return totalMoves;
    }

    public String getCurrentPlayerName() {
        return currentPlayerName;
    }

    public int getXWonCount() {
        return XWonCount;
    }

    public int getYWonCount() {
        return YWonCount;
    }

    public void registerMove(int x, int y) {
        matrix[x][y] = currentPlayerName;
        currentPlayerName = "X".equals(currentPlayerName) ? "O" : "X";
        totalMoves++;
    }
    
    public void incrementXWonCount(){
        XWonCount++;
    }
    public void incrementYWonCount(){
        YWonCount++;
    }
    
    
    public String checkWinner() {
        // horizontal win check
        if (!"".equals(matrix[0][0]) && (matrix[0][0] == null ? matrix[0][1] == null : matrix[0][0].equals(matrix[0][1])) && (matrix[0][0] == null ? matrix[0][2] == null : matrix[0][0].equals(matrix[0][2]))) {
            return matrix[0][0];
        }
        if (!"".equals(matrix[1][0]) && (matrix[1][0] == null ? matrix[1][1] == null : matrix[1][0].equals(matrix[1][1])) && (matrix[1][0] == null ? matrix[1][2] == null : matrix[1][0].equals(matrix[1][2]))) {
            return matrix[1][0];
        }
        if (!"".equals(matrix[2][0]) && (matrix[2][0] == null ? matrix[2][1] == null : matrix[2][0].equals(matrix[2][1])) && (matrix[2][0] == null ? matrix[2][2] == null : matrix[2][0].equals(matrix[2][2]))) {
            return matrix[2][0];
        }

// vertical win check
        if (!"".equals(matrix[0][0]) && (matrix[0][0] == null ? matrix[1][0] == null : matrix[0][0].equals(matrix[1][0])) && (matrix[0][0] == null ? matrix[2][0] == null : matrix[0][0].equals(matrix[2][0]))) {
            return matrix[0][0];
        }
        if (!"".equals(matrix[0][1]) && (matrix[0][1] == null ? matrix[1][1] == null : matrix[0][1].equals(matrix[1][1])) && (matrix[0][1] == null ? matrix[2][1] == null : matrix[0][1].equals(matrix[2][1]))) {
            return matrix[1][0];
        }
        if (!"".equals(matrix[0][2]) && (matrix[0][2] == null ? matrix[1][2] == null : matrix[0][2].equals(matrix[1][2])) && (matrix[0][2] == null ? matrix[2][2] == null : matrix[0][2].equals(matrix[2][2]))) {
            return matrix[0][2];
        }

        // diagonal element check
        if (!"".equals(matrix[0][0]) && (matrix[0][0] == null ? matrix[1][1] == null : matrix[0][0].equals(matrix[1][1])) && (matrix[0][0] == null ? matrix[2][2] == null : matrix[0][0].equals(matrix[2][2]))) {
            return matrix[0][0];
        }
        if (!"".equals(matrix[0][2]) && (matrix[0][2] == null ? matrix[1][1] == null : matrix[0][2].equals(matrix[1][1])) && (matrix[0][2] == null ? matrix[2][0] == null : matrix[0][2].equals(matrix[2][0]))) {
            return matrix[0][2];
        }

        return "";
    }

    public void ResetMatrix() {
        totalMoves=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = "";
            }
        }
    }

    public void ResetScore() {
        currentPlayerName = "X";
        XWonCount = 0;
        YWonCount = 0;
    }

    public boolean isGameOver(){
        return totalMoves == 9;
    }
    public String getPlayerByPosition(int x,int y){
    
    return matrix[x][y];
    }
    
}
