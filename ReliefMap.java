import java.util.Arrays;
/**
 * Repesents a ReliefMap
 * 
 * @author Michelle Pham
 * @version Nov 4, 2016 / Final
 */
public class ReliefMap
{
    int [][] intArr2D;
    
    public ReliefMap(int[][] intArr2D)
    {
        this.intArr2D = intArr2D;
    }
    
    public int maxDifference()
    {
        if (intArr2D.length == 0  || intArr2D[0].length == 0) {
            return 0;
        }

        int max = intArr2D[0][0];
        int min = intArr2D[0][0];

        for (int r = 0; r < intArr2D.length; r++) {
            for (int c = 0; c < intArr2D[r].length; c++) {
                if (intArr2D[r][c] > max) {
                    max = intArr2D[r][c];
                }

                if (intArr2D[r][c] < min) {
                    min = intArr2D[r][c];
                }
            }
        }
        return max - min;
    }
    
    public void drawMap()
    {
        int squareSize = 10;
        for (int r = 0; r < intArr2D.length; r++)
        {
            for (int c = 0; c < intArr2D[r].length; c++)
            {
                Rectangle rect = new Rectangle(0 + c*squareSize, 0 + r*squareSize, squareSize, squareSize);
                if (intArr2D[r][c] < -10)
                {
                    rect.setColor(Color.LIGHT_GRAY);
                }
                else if (intArr2D[r][c] <= 1000)
                {
                    rect.setColor(Color.GRAY);
                }
                else
                {
                    rect.setColor(Color.GREEN);
                }
                rect.fill();
            }
        }
    }
}