import java.util.Random;
/**
 * Displays a ReliefMap
 */
public class ReliefMapViewer
{
    public static void main(String[] args)
    {
        int[][] mapData =  new int[15][15];
        Random gen = new Random(1234567);
        
        for (int row = 0; row < 15; row++)
        {
            for (int column = 0; column < 15; column++)
            {
                // get elevations between -100 and 2000 ft
                int elevation = gen.nextInt(210) * 10  - 100;
                mapData[row][column] = elevation;
            }
        }
      
        ReliefMap map = new ReliefMap(mapData);
        
        int diff = map.maxDifference();
        Text message = new Text(0, 180, "Difference: " + diff);
        message.draw();
        
        //print(mapData);
    }
    
    public static void print(int[][] map)
    {
        for (int row = 0; row < map.length; row++)
        {
            for (int column = 0; column < map[0].length; column++)
            {
                
                System.out.print(map[row][column] + " " );
            }
            System.out.println();
        }
    }
}
