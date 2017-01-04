## Relief Map
The relief map is a map indicating hills and valleys by the use of different colors. The colors are indicated as follows:
* Color.LIGHT_GRAY if the elevation is less than -10 feet
* Color.GRAY if the elevation is greater than or equal to -10 and less than or equal to 1000
* Color.GREEN if the elevation is greater than 1000 feet

### Examples:
```java
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

for (int row = 0; row < map.length; row++)
{
    for (int column = 0; column < map[0].length; column++)
    {

        System.out.print(map[row][column] + " " );
    }
    System.out.println();
}
```

### Output:
![output image](https://raw.githubusercontent.com/ellelustrious/relief-map/master/relief-map.png)
