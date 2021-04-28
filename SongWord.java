//Name: Lauren Pak
//Period: 1
//Date: 4/27/21
public class SongWord
{
  public int findCount(String[][]songArray, String word)
  {
    int total = 0;
    for(int r = 0; r < songArray.length; r++)
    {
      for(int c = 0; c < songArray[0].length; c++)
      {
        if(songArray[r][c].indexOf(word) != -1)
        {
          total++;
          }
          }
    }
return total;
  }
}