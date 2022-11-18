import java.util.Scanner;

public class GDirTest {

  public static void main( String[] args ) {
    GrafoDir G = new GrafoDir( 50 );

    Scanner input = new Scanner( System.in );

    while ( input.hasNext() ) {
      int i = input.nextInt();
      int j = input.nextInt();
      if ( i == 0 && j == 0 ) break;
      G.InsereAresta( i, j );
    }

    G.Graphviz( );
//  G.Explore( 2 );

    input.close();
  }

}